//import kotlinx.coroutines.flow.*

fun main() {

    val list = listOf(1, 2, 3, 4)
    println(list.last()) // 4
    println(list.last { it % 2 == 1 }) // 3
    println(list.lastOrNull { it < 0 }) // null
    println(list.lastOrNull())
// list.last { it < 0 } //  will fail

    val emptyList = emptyList<Int>()
    println(emptyList.lastOrNull()) // null
    /*var str: String = "строка"
    str.drop(2)
    println(str)
    println(str.drop(2))

    var StrArray = arrayOf<String>("строка", "буква", "сова", "кот", "машина")
    var str_2 = StrArray.reduce { acc, s -> acc + " " + s }
    println(str_2)

    var numbersArray = arrayOf(1,2,3,4,5)

    var numbers : Int = numbersArray.reduce {acc, s -> acc + s}
    println(numbers)

    var str_3 = StrArray.fold ("Users:", { a, b -> a + " " + b })
    println(str_3)

    var numbers_2 : Int = numbersArray.fold(12, {a,b -> a + b})
    println(numbers_2)*/

    /*val userFlow = listOf("Tom", "Bob", "Kate", "Sam", "Alice")
    val firstUser = userFlow.first()
    println("First User: $firstUser")       // First User: Tom

    val userFlow2 = listOf("Tom", "Bob", "Kate", "Sam", "Alice")
    val firstUser2_ = userFlow2.first{ name-> name.length > 3}
    println("First User: $firstUser2_")       // First User: Kate

    val userFlow3 = listOf<String>()
    val firstUser1 = userFlow3.firstOrNull()
    val firstUser2 = userFlow3.firstOrNull{ name-> name.length > 3}
    println(firstUser1)
    println(firstUser2)

    val userFlowN = listOf("Tom", "Bob", "Alice", "Sam")
    val lastUser = userFlowN.lastOrNull()
    if(lastUser!=null) println("Last User: $lastUser")

    val userFlowM = listOf("Tom", "Bob")
    val singleUser = userFlowM.singleOrNull()
    if(singleUser!=null)
        println("Single User: $singleUser")
    else
        println("Not found")*/
}