package commands

import collection.Receiver

class ClearCmd(val receiver: Receiver): AbstractCommand("clear"){
    override fun execute(): CommandResult {
        receiver.clear()
        return CommandResult(false, "Хранилище было успешно очищено")
    }
}
//очистить коллекцию