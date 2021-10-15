fun main(){
    println(highAndLow("1 2 3 4 5"))
    var smal: SmallestIntegerFinder = SmallestIntegerFinder()
    println(smal.findSmallestInt(arrayListOf(-7,0,3,2,6,5)))
}

fun highAndLow(numbers: String): String {
    // ...
    var array = numbers.split(" ").toTypedArray()
    var IntArray = Array(array.size) { array[it].toInt() }

    var max = -100000
    var min = 100000
    for((index, value) in IntArray.withIndex()){
        if(IntArray[index] > max){
            max = IntArray[index]
        }
        if(IntArray[index] < min){
            min = IntArray[index]
        }
    }

    var result:String ="$max $min"
    return result
}