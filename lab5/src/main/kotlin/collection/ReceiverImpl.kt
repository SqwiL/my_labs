package collection

import data.vehicle.IVehicle
import data.vehicle.Vehicle
import kotlinx.datetime.Clock
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import java.util.*
import kotlin.NoSuchElementException

class ReceiverImpl(private val iVehicle: IVehicle) : Receiver,Iterable<Vehicle>{
    private val time: LocalDateTime = Clock.System.now().toLocalDateTime(TimeZone.currentSystemDefault())

    private val data: Vector<Vehicle> = Vector()
    override fun getAll(): List<Vehicle> {
        return data.toList()
    }
    override fun setData(data: List<Vehicle>){
        this.data.clear()
        this.data.addAll(data)
    }
    override fun add(vehicle: Vehicle) = data.add(vehicle)
    override fun update(id: Int, vehicle: Vehicle) {
        val el = iVehicle.buildDefault(id)
        if(!data.contains(el)){
            throw NoSuchElementException("Элемент с id = $id не найден")
        }
        data.remove(el)
        iVehicle.clear()
        iVehicle.copyFrom(vehicle)
        iVehicle.setId()
        data.add(iVehicle.build())
    }
    override fun remove(id: Int) {
        data.remove(iVehicle.buildDefault(id))
    }
    override fun removeWithGivenNumberOfWheels(numberOfWheels: Int){
        data.remove(iVehicle.buildDefault(numberOfWheels))
    }
    override fun clear() = data.clear()
    override fun addIfMin(vehicle: Vehicle): Boolean {
        if(vehicle.id < ((data.minByOrNull { it.id })?.id ?: Int.MAX_VALUE)){
            data.add(vehicle)
            return true
        }
        return false
    }

    override fun removeLower(vehicle: Vehicle): Int {
        val prev = data.size
        data.removeIf{ it > vehicle }
        return prev - data.size
    }
    override fun getSize(): Int = data.size
    override fun isEmpty(): Boolean = data.isEmpty()
    override fun getEnginePower(): List<Long> {
        val dst: MutableList<Long> = mutableListOf()
        data.mapNotNullTo(dst){ it.enginePower }
        return dst.sortedByDescending { it }    }

    override fun getDistanceTravelled(): List<Double> {
        val dst: MutableList<Double> = mutableListOf()
        data.mapTo(dst){ it.distanceTravelled }
        return dst.sortedByDescending { it }
    }

    override fun getCollection(): Vector<Vehicle> {
        return data
    }

    override fun iterator(): Iterator<Vehicle> = data.iterator()
    override fun getTime(): LocalDateTime {
        return time
    }
}