package collection

import data.vehicle.IVehicle
import data.vehicle.Vehicle
import kotlinx.datetime.LocalDateTime
import java.util.*

interface Receiver {
    fun getAll(): List<Vehicle>
    fun add(vehicle: Vehicle): Boolean
    fun setData(data: List<Vehicle>)
    fun update(id: Int, vehicle: Vehicle)
    fun remove(id: Int)
    fun clear()
    fun addIfMin(vehicle: Vehicle): Boolean
    fun removeLower(vehicle: Vehicle): Int
    fun getSize(): Int
    fun isEmpty(): Boolean
    fun getEnginePower(): List<Long>
    fun getDistanceTravelled():List<Double>
    fun getTime(): LocalDateTime
    fun removeWithGivenNumberOfWheels(numberOfWheels: Int)
    fun getCollection():Vector<Vehicle>
}