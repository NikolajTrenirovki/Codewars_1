fun main(){
    println(getResult(arrayOf("d", "d", "d", "u", "u", "d", "u")))
}

fun getResult(arraySteps: Array<String>): Int {
    // Write your code here...
    var result : Int = 0
    for(index in arraySteps.indices){
        if (arraySteps[index].equals("d")){
            result++
        } //else result++
    }
/*    if(result < 0){
        result *= -1
    }*/
    return result
}


