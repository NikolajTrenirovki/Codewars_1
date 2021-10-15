fun main() {
    println(makeUpperCase("Сстрока"))
    println(makeUpperCase2("Сстрока"))

}


fun makeUpperCase(str: String): String {
    //todo
    //return str.isUpperCase()
    val inputCharArr = str.toCharArray()
    var resalt: String = ""
    for (i in 0 until inputCharArr.size) {
        resalt += inputCharArr[i].toUpperCase() // Converting the char to upper case
    }
    return resalt
}

fun makeUpperCase2(str: String) = str.toUpperCase()

