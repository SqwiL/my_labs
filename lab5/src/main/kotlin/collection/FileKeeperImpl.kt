package collection

import data.GeneratorId
import data.vehicle.Vehicle
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json
import java.io.FileInputStream
import java.io.FileOutputStream

class FileKeeperImpl(private val receiver: Receiver,
                     private val generatorId: GeneratorId
) : FileKeeper {

    private lateinit var currentFilename: String

    override fun openAndParse(filename: String){
        val fileReader = FileInputStream(filename).reader()

        var text: String
        fileReader.use {
            text = fileReader.readText()
        }

        currentFilename = filename


        val list = if(text.isBlank()){
            listOf()
        } else{
            Json.decodeFromString(ListSerializer(Vehicle.serializer()), text)
        }

        generatorId.lastId = list.maxOfOrNull { it.id } ?: 0

        receiver.setData(list)
    }

    override fun save(){
        val fileWriter = FileOutputStream(currentFilename).writer()

        val string = Json.encodeToString(ListSerializer(Vehicle.serializer()), receiver.getAll())

        fileWriter.use { fileWriter.write(string) }
    }
}