package data.coordinates

import java.io.PrintStream
import java.util.*

interface CoordinatesReader {
    fun askCoordinates(inp: Scanner, out: PrintStream): Coordinates

    fun askX(inp: Scanner, out: PrintStream, iCoordinates: ICoordinates)

    fun askY(inp: Scanner, out: PrintStream, iCoordinates: ICoordinates)
}