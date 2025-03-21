package receiver

import commands.AbstractCommand
import commands.CommandResult

interface Invoker {
    fun execute(cmd: AbstractCommand): CommandResult

    fun execute(cmdList: List<AbstractCommand>): List<CommandResult>
    fun getCommandList(): List<AbstractCommand>
}