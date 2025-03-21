package commands

import collection.Receiver

class PrintFieldDescendingEnginePowerCmd(val receiver: Receiver) :AbstractCommand("print_field_descending_engine_power"){
    override fun execute(): CommandResult {
        return CommandResult(false,receiver.getEnginePower().joinToString("\n"))
    }
}
//вывести значения поля enginePower всех элементов в порядке убывания