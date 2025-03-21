package collection

interface FileKeeper {
    fun openAndParse(filename: String)
    fun save()
}