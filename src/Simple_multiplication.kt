fun main(){

}

fun simpleMultiplication(n: Int): Int {

    var result: Int = n
    if(n%2==0)
        result*=8
     else result *=9

    return result
}

fun simpleMultiplication_2(n: Int): Int {
    return n * if (n % 2 == 0) 8 else 9
}

fun simpleMultiplication_3(n: Int): Int = n * when {
    n % 2 == 0 -> 8
    else -> 9
}

fun simpleMultiplication_4(n: Int) = n * (8 + n%2)