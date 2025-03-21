package data.vehicle

import data.coordinates.CoordinatesReader
import util.*
import java.io.EOFException
import java.io.PrintStream
import java.util.*

class VehicleReaderImpl(
    private val coordinatesReader: CoordinatesReader,
    private val iVehicle: IVehicle
) : VehicleReader{

    override fun askName(inp: Scanner, out: PrintStream, iVehicle: IVehicle){
        val del = inp.delimiter()
        inp.useDelimiter("\n")

        while(true){
            out.print("Введите поле name: ")

            if(!inp.hasNextLine()){
                throw EOFException()
            }

            try{
                iVehicle.setName(inp.nextLine())
            } catch (e: IllegalArgumentException){
                out.println(e.message)
                continue
            }

            break
        }

        inp.useDelimiter(del)
    }
    override fun askDistanceTravelled(inp: Scanner, out: PrintStream, iVehicle: IVehicle){
        val del = inp.delimiter()
        inp.useDelimiter("\n")

        while(true){
            out.print("Введите поле distanceTravelled: ")

            if(!inp.hasNextLine()){
                throw EOFException()
            }

            try{
                checkDouble(inp, "distanceTravelled")
                iVehicle.setDistanceTravelled(inp.nextDouble())
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
    override fun askEnginePower(inp: Scanner, out: PrintStream, iVehicle: IVehicle){
        val del = inp.delimiter()
        inp.useDelimiter("\n")

        while(true){
            out.print("Введите поле enginePower: ")

            if(!inp.hasNextLine()){
                throw EOFException()
            }

            try{
                checkLong(inp, "enginePower")
                iVehicle.setEnginePower(inp.nextLong())
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
    override fun askNumberOfWheels(inp: Scanner, out: PrintStream, iVehicle: IVehicle){
        val del = inp.delimiter()
        inp.useDelimiter("\n")

        while(true){
            out.print("Введите поле numberOfWheels: ")

            if(!inp.hasNextLine()){
                throw EOFException()
            }

            try{
                checkInt(inp, "numberOfWheels")
                iVehicle.setNumberOfWheels(inp.nextInt())
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
    override fun askVehicle(inp: Scanner, out: PrintStream): Vehicle {
        askName(inp, out, iVehicle)

        iVehicle.setCoordinates(coordinatesReader.askCoordinates(inp, out))

        askEnginePower(inp, out, iVehicle)

        askDistanceTravelled(inp, out, iVehicle)

        askNumberOfWheels(inp, out, iVehicle)

        iVehicle.setFuelType(askEnum<FuelType>(inp, out, "fuelType")!!)

        return iVehicle.build()
    }
}