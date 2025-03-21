package commands

import collection.Receiver

class InfoCmd(val receiver: Receiver) :AbstractCommand("info"){
    override fun execute(): CommandResult {
        return CommandResult(false, "Время инициализации: ${receiver.getTime()}\n" +
                "Количество элементов: ${receiver.getSize()}")
    }
}
//вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)