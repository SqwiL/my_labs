package data.vehicle

import data.coordinates.Coordinates
import data.GeneratorId
import data.coordinates.ICoordinates
import kotlinx.datetime.Clock
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import util.checkNull

class VehicleImpl(val generatorId: GeneratorId,val iCoordinates: ICoordinates): IVehicle {

    private var id: Int? = null
    private var name: String? = null
    private var coordinates: Coordinates? = null
    private var creationDate: kotlinx.datetime.LocalDateTime? = null
    private var enginePower:Long? = null
    private var numberOfWheels: Int? = null
    private var distanceTravelled:Double? = null
    private var fuelType: FuelType? = null


    override fun clear(): IVehicle{
        id = null
        name = null
        coordinates = null
        creationDate = null
        enginePower = null
        numberOfWheels = null
        distanceTravelled = null
        fuelType = null

        return this
    }

    override fun setName(name: String): IVehicle {
        if(name.isEmpty()){
            throw IllegalArgumentException("Поле name не может быть пустым")
        }
        this.name = name

        return this
    }
    override fun setCoordinates(coordinates: Coordinates): IVehicle {
        this.coordinates = coordinates

        return this
    }

    override fun setCreationDate(time: kotlinx.datetime.LocalDateTime): IVehicle {
        this.creationDate = time

        return this
    }

    override fun setEnginePower(enginePower: Long): IVehicle {
        if(enginePower <= 0){
            throw IllegalArgumentException("Поле enginePower должно быть больше нуля")
        }
        this.enginePower = enginePower
        return this
    }

    override fun setNumberOfWheels(numberOfWheels: Int): IVehicle {
        if(numberOfWheels < 0){
            throw IllegalArgumentException("Поле numberOfWheels должно быть больше нуля")
        }
        this.numberOfWheels = numberOfWheels
        return this    }

    override fun setDistanceTravelled(distanceTravelled: Double): IVehicle {
        if(distanceTravelled < 0){
            throw IllegalArgumentException("Поле distanceTravelled должно быть больше нуля")
        }
        this.distanceTravelled = distanceTravelled
        return this    }

    override fun setFuelType(fuelType: FuelType): IVehicle {
        this.fuelType = fuelType
        return this
    }

    override fun setId(): IVehicle {
        this.id = generatorId.generate()
        return this
    }
    override fun setDefault(): IVehicle {
        name = "untitled"
        coordinates = iCoordinates.buildDefault()
        enginePower = 1
        numberOfWheels = 1
        distanceTravelled = 1.0
        fuelType = FuelType.ALCOHOL

        return this
    }

    override fun build(): Vehicle {
        checkNull(name, "name")
        checkNull(coordinates, "coordinates")
        checkNull(enginePower, "enginePower")
        checkNull(numberOfWheels, "numberOfWheels")
        checkNull(distanceTravelled, "distanceTravelled")
        checkNull(fuelType, "fuelType")


        val res = Vehicle((id?: generatorId.generate()),
            name!!, coordinates!!,creationDate?: Clock.System.now().toLocalDateTime(TimeZone.currentSystemDefault()),
            enginePower!!,numberOfWheels!!,distanceTravelled!!,fuelType!!)

        clear()

        return res
    }
    override fun copyFrom(vehicle: Vehicle): IVehicle {
        with(vehicle){
            setName(name)
            setId()
            if (enginePower != null) {
                setEnginePower(enginePower)
            }
            setNumberOfWheels(numberOfWheels)
            setDistanceTravelled(distanceTravelled)
            setFuelType(fuelType)
            setCoordinates(coordinates.copy())
            setCreationDate(creationDate)
        }

        return this
    }

    override fun buildDefault(id: Int?): Vehicle {
        clear()

        setDefault()
        setId()

        val res = Vehicle(
            ((id?: generatorId.generate())),
            name!!, coordinates!!,creationDate?: Clock.System.now().toLocalDateTime(TimeZone.currentSystemDefault()),
            enginePower!!,numberOfWheels!!,distanceTravelled!!,fuelType!!)

        clear()

        return res
    }
}