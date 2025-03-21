package data.coordinates

interface ICoordinates {
    fun clear():ICoordinates
    fun setX(x:Int):ICoordinates
    fun setY(y:Double):ICoordinates
    fun setDefault(): ICoordinates

    fun build(): Coordinates
    fun buildDefault(): Coordinates
}