package factory

import collection.FileKeeper
import collection.Receiver
import receiver.Invoker
import receiver.StreamKeeper
import commands.*
import data.vehicle.Vehicle


abstract class CommandFactory(
    val fileKeeper: FileKeeper,
    val invoker: Invoker,
    val receiver: Receiver,
    val streamKeeper: StreamKeeper
) {
    abstract fun buildHelp(): HelpCmd
    abstract fun buildInfo(): InfoCmd
    abstract fun buildShow(): ShowCmd
    abstract fun buildUpdate( id:Int, vehicle: Vehicle): UpdateCmd
    abstract fun buildAdd(vehicle: Vehicle): AddCmd
    abstract fun buildRemove(id: Int): RemoveCmd
    abstract fun buildClear(): ClearCmd
    abstract fun buildSave(): SaveCmd
    abstract fun buildExecuteFile(filename: String): ExecuteFileCmd
    abstract fun buildExit(): ExitCmd
    abstract fun buildAddIfMin(vehicle: Vehicle): AddIfMinCmd
    abstract fun buildRemoveLower(vehicle: Vehicle): RemoveLowerCmd
    abstract fun buildReorder(): ReorderCmd
    abstract fun buildRemoveWithGivenNumberOfWheels(numberOfWheels: Int): RemoveWithGivenNumberOfWheelsCmd
    abstract fun buildPrintFieldDescendingEnginePower(): PrintFieldDescendingEnginePowerCmd
    abstract fun buildPrintFieldDescendingDistanceTravelled(): PrintFieldDescendingDistanceTravelledCmd
}