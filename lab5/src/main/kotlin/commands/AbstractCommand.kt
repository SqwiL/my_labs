package commands

abstract class AbstractCommand(val name: String) {
    abstract fun execute(): CommandResult
}