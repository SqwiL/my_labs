package receiver

import commands.AbstractCommand
import commands.CommandResult
import java.util.*

class InvokerImpl: Invoker {
    private val commandList: MutableList<AbstractCommand> = mutableListOf()

    override fun execute(cmd: AbstractCommand): CommandResult {
        val res = cmd.execute()
        return res
    }

    override fun execute(cmdList: List<AbstractCommand>): List<CommandResult> {
        val res = LinkedList<CommandResult>()

        for(cmd in cmdList){
            val cmdRes = execute(cmd)

            res.add(cmdRes)

            if(cmdRes.isRunning){
                break
            }
        }

        return res
    }
    override fun getCommandList(): List<AbstractCommand>{
        return commandList
    }
}