package commands

import collection.FileKeeper

class SaveCmd(val fileKeeper: FileKeeper) :AbstractCommand("save"){
    override fun execute(): CommandResult {
        return try {
            fileKeeper.save()
            CommandResult(false, "Коллекция была успешно сохранена")
        } catch (e: Exception){
            CommandResult(false, "Невозможно сохранить коллекцию: ${e.message}")
        }
    }
}
//сохранить коллекцию в файл