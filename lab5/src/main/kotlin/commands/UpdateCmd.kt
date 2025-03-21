package commands

import collection.Receiver
import data.vehicle.Vehicle

class UpdateCmd(val id:Int, val vehicle: Vehicle, val receiver: Receiver) :AbstractCommand("update"){
    override fun execute(): CommandResult {
        return try {
            receiver.update(id, vehicle)
            CommandResult(false, "Элемент с id = $id был успешно обновлен")
        } catch (e: NoSuchElementException){
            CommandResult(false, e.message ?: "")
        }
    }
}
//{element} : обновить значение элемента коллекции, id которого равен заданному