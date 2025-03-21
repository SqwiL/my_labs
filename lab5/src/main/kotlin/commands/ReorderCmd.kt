package commands

import collection.Receiver

class ReorderCmd(val receiver: Receiver) :AbstractCommand("reorder"){
    override fun execute(): CommandResult {
        receiver.getCollection().sortDescending()
        return CommandResult(false,"Коллекция успешно отсортирована в порядке убывания!")
    }
}
//отсортировать коллекцию в порядке, обратном нынешнему