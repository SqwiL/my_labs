package data

class GeneratorId {
    var lastId: Int = 0
    fun generate(): Int{
        return ++lastId
    }
}