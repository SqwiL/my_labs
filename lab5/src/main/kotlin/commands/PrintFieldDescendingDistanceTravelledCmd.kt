package commands

import collection.Receiver

class PrintFieldDescendingDistanceTravelledCmd(val receiver: Receiver) :AbstractCommand("print_field_descending_distance_travelled"){
    override fun execute(): CommandResult {
        return CommandResult(false,receiver.getDistanceTravelled().joinToString("\n"))
    }
}
//вывести значения поля distanceTravelled всех элементов в порядке убывания