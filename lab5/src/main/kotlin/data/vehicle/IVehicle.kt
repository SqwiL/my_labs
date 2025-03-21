package data.vehicle

import data.coordinates.Coordinates

interface IVehicle {
    fun clear():IVehicle
    fun setName(name:String):IVehicle
    fun setCoordinates(coordinates: Coordinates):IVehicle
    fun setCreationDate(time: kotlinx.datetime.LocalDateTime):IVehicle
    fun setEnginePower(enginePower:Long):IVehicle
    fun setNumberOfWheels(numberOfWheels:Int):IVehicle
    fun setDistanceTravelled(distanceTravelled: Double):IVehicle
    fun setFuelType(fuelType: FuelType):IVehicle
    fun setId():IVehicle
    fun build(): Vehicle

    fun setDefault(): IVehicle
    fun copyFrom(vehicle: Vehicle): IVehicle
    fun buildDefault(id: Int?): Vehicle
}