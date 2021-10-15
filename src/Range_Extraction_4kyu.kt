fun main() {
    val numbers: IntArray = intArrayOf(-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20)
   // println(rangeExtraction(numbers))
   // println(rangeExtraction3(numbers))
    println(rangeExtraction4(numbers))

/*    val numbers2: IntArray = intArrayOf(-3, -2, -1, 2, 10, 15, 16, 18, 19, 20)
    println(rangeExtraction(numbers2))*/
/*    val numbers3: IntArray = intArrayOf(-10,-7,-5,-2,1,2,4,5,6,9)
    println(rangeExtraction(numbers3))*/
/*    val numbers4: IntArray = intArrayOf(11,14,16,18,19,22,25,26)
    println(rangeExtraction(numbers4))*/

}

fun rangeExtraction(arr: IntArray): String {

    var result: String = ""
    var temp: String = ""
    var counter: Int = 0

    for(index in arr.indices){
        println(arr[index])
        if(index > 0){
            if((arr[index] == ((arr[index-1])+1))) {
                println("вариант 0")
                println("counter $counter")
                if((counter == 0) and (index < (arr.size - 1))){ // вариант 1
                   // println("arr[index-1] ${arr[index-1]}")
                    println("вариант 1")
                    temp = result
                    result="$result${arr[index-1]}-"
                    println(result)
                } else if (counter == 0){
                    println("вариант 1.1")
                    result="$result${arr[index-1]},"
                    println(result)
                }
                counter++
            } else {
                if(counter>1){ // >1, так как счётчик начинает работать со второго числа в последовательнсти вариант 2
                    println("вариант 2")
                    result="$result${arr[index-1]},"
                    println(result)
                    counter = 0
                } else if(index<arr.size){ // вариант 3
                    println("вариант 3")
                    if(counter==1){
                        println("вариант 3.1")
                        result = "$temp${arr[index-2]},${arr[index-1]},"
                        println(result)
                        counter = 0
                    } else{
                        println("вариант 3.2")
                        result="$result${arr[index-1]},"
                        println(result)
                    }
                }
                else { // вариант 4
                    println("вариант 4")
                    result="$result${arr[index-1]}"
                    println(result)
                }
            }
        }
/*        if((counter==1) and (index > 1)){
            println("вариант 3.1")
            result = "$temp${arr[index-2]},${arr[index-1]},"
            println(result)
            counter = 0
        }*/
        if((index == arr.size-1) and (counter>1)){
            result="$result${arr[index]}"
            println(result)
        } else if ((index == arr.size-1)){
            result="$result${arr[index]}"
            println(result)
        }

    }
    return result
}

fun rangeExtraction2(
    arr: IntArray
): String = arr.fold(emptyList<Pair<Int, Int>>()) { rs, x ->
    rs.lastOrNull().run { if (this != null && x - second == 1) rs.dropLast(1) + (first to x) else rs + (x to x) }
}.joinToString(",") { (x, y) -> if (y - x > 1) "$x-$y" else (x..y).joinToString(",") }

fun rangeExtraction3(arr: IntArray): String {
    var str = ""

    arr.forEachIndexed{index, element ->
        if (index == 0 || element - arr[index - 1] > 1){
            str += ",$element"
            println("str_1 $str")
        }
        else if ((index < arr.size - 1 && arr[index + 1] - element > 1) || index == arr.size - 1){
            if (index > 1 && element - arr[index - 2] == 2){
                str += "-$element"
                println("str_2 $str")
            }
            else {
                str += ",$element"
                println("str_3 $str")
            }
        }
    }
        println("str_end $str")
    return str.drop(1)
}

fun rangeExtraction4(
    arr: IntArray
): String = arr.fold(emptyList<Pair<Int, Int>>())
{ ranges, x ->
    ranges.lastOrNull()
        .run { if (this != null && x - second == 1)
            ranges.dropLast(1) + (first to x)
        else ranges + (x to x) }
}.joinToString(",") { (x, y) ->
    when (y - x) {
        0 -> "$x"
        1 -> "$x,$y"
        else -> "$x-$y"
    }
}