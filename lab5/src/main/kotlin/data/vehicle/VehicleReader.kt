package data.vehicle

import java.io.PrintStream
import java.util.*

interface  VehicleReader {
    fun askVehicle(inp: Scanner, out: PrintStream): Vehicle
    fun askName(inp: Scanner, out: PrintStream, iVehicle: IVehicle)
    fun askNumberOfWheels(inp: Scanner, out: PrintStream, iVehicle: IVehicle)
    fun askEnginePower(inp: Scanner, out: PrintStream, iVehicle: IVehicle)
    fun askDistanceTravelled(inp: Scanner, out: PrintStream, iVehicle: IVehicle)
}