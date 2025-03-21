package factory

import collection.FileKeeper
import collection.Receiver
import commands.*
import data.vehicle.Vehicle
import receiver.Invoker
import receiver.StreamKeeper

class CommandFactoryImpl(
    fileKeeper: FileKeeper,
    invoker: Invoker,
    receiver: Receiver,
    streamKeeper: StreamKeeper
) : CommandFactory(fileKeeper, invoker, receiver, streamKeeper) {
        override fun buildHelp(): HelpCmd {
            return HelpCmd()
        }

        override fun buildInfo(): InfoCmd {
            return InfoCmd(receiver)
        }

        override fun buildShow(): ShowCmd {
            return ShowCmd(receiver)
        }

        override fun buildUpdate(id: Int, vehicle: Vehicle): UpdateCmd {
            return UpdateCmd(id, vehicle, receiver)
        }

        override fun buildAdd(vehicle: Vehicle): AddCmd {
            return AddCmd(vehicle, receiver)
        }

        override fun buildRemove(id: Int): RemoveCmd {
            return RemoveCmd(id, receiver)
        }

        override fun buildClear(): ClearCmd {
            return ClearCmd(receiver)
        }

        override fun buildSave(): SaveCmd {
            return SaveCmd(fileKeeper)
        }

        override fun buildExecuteFile(filename: String): ExecuteFileCmd {
            return ExecuteFileCmd(filename, streamKeeper.currentStream)
        }

        override fun buildExit(): ExitCmd {
            return ExitCmd()
        }

        override fun buildAddIfMin(vehicle: Vehicle): AddIfMinCmd {
            return AddIfMinCmd(vehicle, receiver)
        }
        override fun buildRemoveLower(vehicle: Vehicle): RemoveLowerCmd{
            return RemoveLowerCmd(vehicle,receiver)
        }
        override fun buildReorder(): ReorderCmd{
            return ReorderCmd(receiver)
        }
        override fun buildRemoveWithGivenNumberOfWheels(numberOfWheels: Int): RemoveWithGivenNumberOfWheelsCmd{
            return RemoveWithGivenNumberOfWheelsCmd(numberOfWheels,receiver)
        }
        override fun buildPrintFieldDescendingEnginePower(): PrintFieldDescendingEnginePowerCmd{
            return PrintFieldDescendingEnginePowerCmd(receiver)
        }
        override fun buildPrintFieldDescendingDistanceTravelled(): PrintFieldDescendingDistanceTravelledCmd{
            return PrintFieldDescendingDistanceTravelledCmd(receiver)
        }
}