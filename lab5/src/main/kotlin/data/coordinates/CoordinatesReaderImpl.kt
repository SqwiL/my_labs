package data.coordinates

import util.ParseException
import util.checkDouble
import util.checkInt
import java.io.EOFException
import java.io.PrintStream
import java.util.*

class CoordinatesReaderImpl(val iCoordinates: ICoordinates): CoordinatesReader {
    override fun askX(inp: Scanner, out: PrintStream, iCoordinates: ICoordinates) {
        val del = inp.delimiter()
        inp.useDelimiter("\n")

        while(true) {
            out.print("Введите поле Coordinate.x: ")

            if(!inp.hasNextLine()){
                throw EOFException()
            }

            try{
                checkInt(inp, "Coordinate.x")
                iCoordinates.setX(inp.nextInt())
            } catch (e: IllegalArgumentException){
                out.println(e.message)
                continue
            } catch (e: ParseException){
                out.println(e.message)
                inp.nextLine()
                continue
            }

            break
        }

        inp.useDelimiter(del)
    }

    override fun askY(inp: Scanner, out: PrintStream, iCoordinates: ICoordinates) {
        val del = inp.delimiter()
        inp.useDelimiter("\n")

        while(true){
            out.print("Введите поле Coordinates.y: ")

            if(!inp.hasNextLine()){
                throw EOFException()
            }

            try {
                checkDouble(inp, "Coordinates.y")
                iCoordinates.setY(inp.nextDouble())
            } catch (e: IllegalArgumentException){
                out.println(e.message)
                continue
            } catch (e: ParseException){
                out.println(e.message)
                inp.nextLine()
                continue
            }
            break
        }

        inp.useDelimiter(del)
    }

    override fun askCoordinates(inp: Scanner, out: PrintStream): Coordinates {
        askX(inp, out, iCoordinates)

        askY(inp, out, iCoordinates)

        return iCoordinates.build()
    }
}