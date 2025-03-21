package receiver

import commands.AbstractCommand
import java.io.InputStream
import java.io.OutputStream

interface StreamInvoker {
    fun execute(inputStream: InputStream, outputStream: OutputStream): List<AbstractCommand>
}