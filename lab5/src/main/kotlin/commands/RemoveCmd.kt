package commands

import collection.Receiver

class RemoveCmd(val id: Int, val receiver: Receiver) :AbstractCommand("remove"){
    override fun execute(): CommandResult {
        receiver.remove(id)
        return CommandResult(false, "Элемент с id = $id был успешно удален")
    }
}
//удалить элемент из коллекции по его id