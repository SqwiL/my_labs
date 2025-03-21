package commands

import collection.Receiver
import data.vehicle.Vehicle

class AddCmd(val vehicle: Vehicle,val receiver: Receiver) : AbstractCommand("add"){
    override fun execute(): CommandResult {
        if(receiver.add(vehicle)) {
            return CommandResult(false, "Элемент успешно добавлен")
        }
        return CommandResult(false,"Данный элемент уже находиться в коллекции")
    }
}
//{element} : добавить новый элемент в коллекцию