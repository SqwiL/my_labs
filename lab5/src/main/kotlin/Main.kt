import collection.FileKeeper
import collection.FileKeeperImpl
import collection.Receiver
import collection.ReceiverImpl
import data.GeneratorId
import data.coordinates.CoordinatesImpl
import data.coordinates.CoordinatesReader
import data.coordinates.CoordinatesReaderImpl
import data.coordinates.ICoordinates
import data.vehicle.IVehicle
import data.vehicle.VehicleImpl
import data.vehicle.VehicleReader
import data.vehicle.VehicleReaderImpl
import factory.CommandFactory
import factory.CommandFactoryImpl
import factory.CommandReader
import factory.CommandReaderImpl
import kotlinx.datetime.Clock
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import org.kodein.di.DI
import org.kodein.di.bindProvider
import org.kodein.di.bindSingleton
import org.kodein.di.instance
import receiver.*
import java.io.IOException
import java.util.*

fun main(args: Array<String>){
    val di = DI.direct {
        bindSingleton<CommandFactory> { CommandFactoryImpl(instance(), instance(), instance(), instance()) }
        bindSingleton<CommandReader> { CommandReaderImpl(instance(), instance()) }

        bindSingleton<CoordinatesReader> { CoordinatesReaderImpl(instance()) }
        bindSingleton<ICoordinates> { CoordinatesImpl() }

        bindSingleton<VehicleReader> { VehicleReaderImpl(instance(), instance()) }
        bindSingleton<IVehicle> { VehicleImpl(instance(), instance()) }


        bindSingleton<Invoker> { InvokerImpl() }

        bindProvider<Receiver> { ReceiverImpl(instance()) }
        bindSingleton<FileKeeper> { FileKeeperImpl(instance(), instance()) }
        bindSingleton { StreamKeeper() }

        bindSingleton<StreamInvoker> {
            val res = StreamInvokerImpl(instance(), instance())

            val streamExecutorKeeper: StreamKeeper = instance()
            streamExecutorKeeper.currentStream = res

            res
        }

        bindSingleton { GeneratorId() }
    }

    if(args.isEmpty()){
        println("Программа должна принимать на вход имя файла " +
                "для инициализации коллекции в качестве первого аргумента")
        return
    }

    val fileKeeper: FileKeeper = di.instance()
    fileKeeper.openAndParse(args[0])

    val streamExecutor: StreamInvoker = di.instance()

    try {
        streamExecutor.execute(System.`in`, System.out)
    } catch (e: IOException){
        println("Невозможно воспользоваться входным потоком: ${e.message}")
    }

}