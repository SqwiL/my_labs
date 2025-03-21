package data.vehicle

import data.coordinates.Coordinates
import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Serializable
@Serializable
data class Vehicle(
    val id: Int,
    val name:String,
    val coordinates: Coordinates,
    val creationDate: LocalDateTime,
    val enginePower:Long?,
    val numberOfWheels: Int,
    val distanceTravelled:Double,
    val fuelType: FuelType
): Comparable<Vehicle>{

    override fun hashCode(): Int {
        return id
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Vehicle

        if (id != other.id) return false

        return true
    }

    override fun compareTo(other: Vehicle): Int {
        return this.id - other.id
    }
}
