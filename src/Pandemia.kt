fun main() {
    println(infected("01000000X000X011X0X")) // 73.33333333333333
    println(infected("01X000X010X011XX")) // 72.72727272727273
    println(infected("XXXXX")) // 0.0
    println(infected("00000000X00X0000")) // 0.0
    println(infected("0000000010")) // 100.0
    println(infected("000001XXXX0010X1X00010")) // 100.0
    println(infected("X00X000000X10X0100")) // 42.857142857142854
}

fun infected(s: String): Double{
    // have fun :)

    var people: Int = 0
    var inf : Boolean = false
    var sumInf: Double = 0.0
    var sum: Double = 0.0

    var arrayChar = s.toCharArray();
    for(index in arrayChar.indices){
      //  println("arrayChar[index] ${arrayChar[index]}")

        people++
       // println("people $people")

        if (arrayChar[index].equals('1'))
            inf = true

        if(arrayChar[index].equals('X') and (inf==true)){
            people--
            sumInf += people
            sum += people
            people = 0
            inf = false
        } else if(arrayChar[index].equals('X')) {
            people--
            sum += people
            people = 0
        } else if ((index == (arrayChar.size - 1))  and (inf==true)){
            sumInf += people
            sum += people
            people = 0
            inf = false
        } else if ((index == (arrayChar.size - 1))) {
            sum += people
            people = 0
        }
    }
  //  println("sumInf $sumInf" )
  //  println("sum $sum")
    if(sum == 0.0)
        return 0.0
    return 100*sumInf/sum
}

fun infected_2(s: String): Double {
    val peoples = s.split("X").map {
        if (it.contains("1")) {
            it.replace("0", "1")
        } else it
    }.joinToString("")
    if (peoples.isEmpty()) return 0.0
    val infected = peoples.count { it.toString() == "1" }
    return 100.0 * infected / peoples.count()
}

fun infected_3(s: String): Double {
    val allPopulation = s.filter { it != 'X' }.length

    if(allPopulation == 0) {
        return 0.0
    }

    val infectedPopulation = s.split('X')
        .filter { it.contains('1') }
        .map { it.length }
        .sum()

    return infectedPopulation / allPopulation.toDouble() * 100
}