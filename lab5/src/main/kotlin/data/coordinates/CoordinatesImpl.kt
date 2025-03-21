package data.coordinates

import util.checkNull

class CoordinatesImpl: ICoordinates {
    private var x: Int? = null
    private var y: Double? = null

    override fun clear(): ICoordinates{
        x = null
        y = null
        return this
    }

    override fun setX(x:Int): ICoordinates{
        this.x = x
        return this
    }

    override fun setY(y:Double): ICoordinates {
        this.y = y
        return this
    }
    override fun build(): Coordinates {
        checkNull(x, "x")
        checkNull(y, "y")

        val res = Coordinates(x!!, y!!)

        clear()

        return res
    }
    override fun setDefault(): ICoordinates {
        x = 1
        y = 1.0

        return this
    }
    override fun buildDefault(): Coordinates {
        clear()
        setDefault()

        val res = Coordinates(x!!, y!!)

        clear()

        return res
    }
}