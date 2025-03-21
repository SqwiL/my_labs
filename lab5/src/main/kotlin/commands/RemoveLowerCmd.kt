package commands

import collection.Receiver
import data.vehicle.Vehicle

class RemoveLowerCmd(val vehicle: Vehicle, val receiver: Receiver) :AbstractCommand("remove_lower"){
    override fun execute(): CommandResult {
        val res = receiver.removeLower(vehicle)
        return CommandResult(false, "Было удалено $res элементов")
    }
}
//удалить из коллекции все элементы, меньшие, чем заданный