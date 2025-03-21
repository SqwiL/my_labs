package commands

import collection.Receiver

class RemoveWithGivenNumberOfWheelsCmd(val numberOfWheels: Int,val receiver: Receiver) :AbstractCommand("remove_any_by_number_of_wheels"){
    override fun execute(): CommandResult {
        receiver.remove(numberOfWheels)
        return CommandResult(false, "Элемент с numberOfWheels = $numberOfWheels был успешно удален")
    }
}
//удалить из коллекции один элемент, значение поля numberOfWheels которого эквивалентно заданному