package factory

import commands.AbstractCommand
import java.io.PrintStream
import java.util.*

interface CommandReader {

    fun readCommand(scanner: Scanner, printStream: PrintStream): AbstractCommand
}