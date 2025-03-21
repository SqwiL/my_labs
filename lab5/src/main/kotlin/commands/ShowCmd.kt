package commands

import collection.Receiver

class ShowCmd(val receiver: Receiver) :AbstractCommand("show"){
    override fun execute(): CommandResult {
        val s = if(receiver.isEmpty()){
            "...empty..."
        } else{
            receiver.getAll().joinToString("\n") { it.toString() }
        }

        return CommandResult(false, s)
    }
}
//вывести в стандартный поток вывода все элементы коллекции в строковом представлении