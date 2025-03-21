package factory

import commands.AbstractCommand
import data.vehicle.VehicleReader
import util.ParseException
import java.io.PrintStream
import java.util.*

class CommandReaderImpl(
    private val factory: CommandFactory,
    private val vehicleReader: VehicleReader
): CommandReader {



    private fun checkSize(arr: List<String>, size: Int, name: String){
        if(arr.size != size){
            throw ParseException("Команда $name должна содержать хотя бы $size слов")
        }
    }

    private fun getId(arr: List<String>, name: String, pos: Int = 1): Int{
        checkSize(arr, pos + 1, name)
        try{
            return arr[pos].toInt()
        } catch (e: NumberFormatException){
            throw ParseException("Команда $name должна принимать в качестве ${pos - 1} аргумента целое число")
        }
    }

    override fun readCommand(inp: Scanner, out: PrintStream): AbstractCommand {
        inp.useDelimiter("\n")

        val s = inp.nextLine()

        if(s.isBlank()){
            throw ParseException("Команда не может быть пустой строкой")
        }

        val arr = s.split(" ")

        return when(arr[0]){
            "help" -> factory.buildHelp()
            "info" -> factory.buildInfo()
            "show" -> factory.buildShow()
            "clear" -> factory.buildClear()
            "save" -> factory.buildSave()
            "exit" -> factory.buildExit()
            "reorder" -> factory.buildReorder()
            "remove_any_by_number_of_wheels numberOfWheels" -> factory.buildRemoveWithGivenNumberOfWheels(getId(arr, arr[0]))
            "print_field_descending_engine_power" -> factory.buildPrintFieldDescendingEnginePower()
            "print_field_descending_distance_travelled" -> factory.buildPrintFieldDescendingDistanceTravelled()
            "add" -> factory.buildAdd(vehicleReader.askVehicle(inp, out))
            "update" -> factory.buildUpdate(getId(arr, arr[0]), vehicleReader.askVehicle(inp, out))
            "remove_by_id" -> factory.buildRemove(getId(arr, arr[0]))
            "execute_script" -> {
                checkSize(arr, 2, arr[0])
                factory.buildExecuteFile(arr[1])
            }
            "add_if_min" -> factory.buildAddIfMin(vehicleReader.askVehicle(inp, out))
            "remove_lower" -> factory.buildRemoveLower(vehicleReader.askVehicle(inp, out))
            else -> throw ParseException("Неизвестная команда ${arr[0]}")
        }
    }
}
