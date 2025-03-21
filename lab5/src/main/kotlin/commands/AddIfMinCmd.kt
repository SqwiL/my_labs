package commands

import collection.Receiver
import data.vehicle.Vehicle

class AddIfMinCmd(val vehicle: Vehicle, val receiver: Receiver) : AbstractCommand("add_if_min"){
    override fun execute(): CommandResult {
        if(receiver.addIfMin(vehicle)) {
            return CommandResult(false, "Элемент успешно добавлен")
        }
        return CommandResult(false,"Данный элемент уже находиться в коллекции")
    }
}
//{element} : добавить новый элемент в коллекцию, если его значение меньше,
//чем у наименьшего элемента этой коллекции