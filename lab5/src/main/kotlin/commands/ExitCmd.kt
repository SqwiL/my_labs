package commands

class ExitCmd :AbstractCommand("exit"){
    override fun execute(): CommandResult {
        return CommandResult(true,"")
    }
}
//завершить программу (без сохранения в файл)