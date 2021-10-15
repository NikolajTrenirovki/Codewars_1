fun main(){
    println(prevMultOfThree(125))
    println(prevMultOfThree(1)) // null
    println(prevMultOfThree(25)) // null
    println(prevMultOfThree(36)) // 36
    println(prevMultOfThree(1244)) // 12
    println(prevMultOfThree(952406)) // 9

}

fun prevMultOfThree(n: Int): Int? {
    // have fun :)
    var res: Int = n
    var str: String = n.toString()

    for(index in 1..str.length){
        var temp: Int = 0
        if(res%3 == 0)
            return res
        res /= 10
    }
    return null
}

fun prevMultOfThree_2(n: Int): Int? = when{
    n == 0 -> null
    n % 3 == 0 -> n
    else -> prevMultOfThree(n / 10)
}

fun prevMultOfThree_3(n: Int): Int? =
    generateSequence(n) { it / 10 }
        .find { it % 3 == 0 }
        .let { if (it == 0) null else it }