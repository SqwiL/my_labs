package receiver

import commands.AbstractCommand
import commands.CommandResult
import factory.CommandReader
import util.ParseException
import java.io.EOFException
import java.io.InputStream
import java.io.OutputStream
import java.io.PrintStream
import java.util.*

class StreamInvokerImpl(val commandReader: CommandReader, val receiver: Invoker): StreamInvoker {
    override fun execute(inputStream: InputStream, outputStream: OutputStream): List<AbstractCommand> {
        val inputScanner = Scanner(inputStream)
        val printStream = PrintStream(outputStream)

        while(inputScanner.hasNextLine()){
            val res: CommandResult = try{
                val cmd = commandReader.readCommand(inputScanner, printStream)
                receiver.execute(cmd)
            } catch (e: ParseException){
                printStream.println(e.message)
                continue
            } catch (e: EOFException){
                CommandResult(true, "Входной поток был прерван")
            }

            printStream.println(res.out)
            if(res.isRunning){
                break
            }
        }

        return receiver.getCommandList()
    }
}