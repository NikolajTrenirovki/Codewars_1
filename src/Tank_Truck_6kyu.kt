import kotlin.math.*

fun main() {
    tankVol(1, 10, 100)
}

fun tankVol(h:Int, d:Int, vt:Int):Int {
    // your code
    var S: Double = PI * (d/2)*(d/2) // площадь круга
    println(S)
    var H: Double = vt/S // длина цестерны
    println(H)
    return h
}


