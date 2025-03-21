package commands

import receiver.StreamInvoker
import java.io.FileInputStream
import java.io.FileNotFoundException
import java.io.IOException

class ExecuteFileCmd(val filename: String, private val streamInvoker: StreamInvoker): AbstractCommand("execute_script"){
    override fun execute(): CommandResult {
        return try {
            FileInputStream(filename).use {
                    inp -> streamInvoker.execute(inp, System.out)
            }

            CommandResult(false, "Файл $filename был успешно исполнен")
        } catch (e: FileNotFoundException){
            CommandResult(false, "Файл $filename не существует")
        } catch (e: IOException) {
            CommandResult(false, "Невозможно прочитать из $filename: ${e.message}")
        }
    }
}
//считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.