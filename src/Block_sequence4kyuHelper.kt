fun main() {
    var result: Long = 0
   // var sumResult: Long = 0 // сумма результатов работы циклов
    var SumResult: Long = 0 // резульат сложения всех предидущих разрядов, без умножения на колличество знаков в многозначных числах
    var PastResult: Long = 0 // результат сложения всех предидущих разрадов
    var newResult = longArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0,) // результат сложения текущего разряда (Res1, Res2, Res3...)
    var ResOb: Long = 0 // резьтат сложения всех разрядов (Res общий)
    var p: Long = 1
    var examination: Long = 0 // проверка (в результате проверки должно получиться 45)
    var examination2: Long = 0 // проверка 2 (в результате проверки должно получиться 45)
    // нужно поставить проверки после каждого цикла
    for(index in 1..9){
        result += index
    }
    println(result)
    ResOb = result
    newResult[0] = ResOb
   // println("$newResult * $p = ${newResult*p}")
    println("p = $p")
    println("newResult = ${newResult[0]}")
    println("ResOb = $ResOb")
    p++
    PastResult = result
    SumResult += result
    result = 0

    for(index in 1..99){
       result += index
    }
    println("result $result")
    println("SumResult = $SumResult")
    println("p = $p")
    ResOb += (result - SumResult) * p
    newResult[1] = ResOb - PastResult
    println("newResult = ${newResult[1]}")
    p++
    PastResult += (result - SumResult) * p
    println("PastResult = $PastResult")
    println("result = $result")
  //  sumResult +=result
    SumResult += result
    examination2 = result - newResult[1]/2
    println("examination2 = $examination2")
    result = 0
    println("ResOb = $ResOb")
    examination = ResOb - newResult[1]
    println("examination = $examination")

 /*   for(index in 1..999){
        result += index
     }
     println(result)
     ResOb += (result - SumResult) * p
     newResult = ResOb - PastResult
     println("p = $p")
     println("newResult = $newResult")
     p++
     PastResult += (result - SumResult) * p
    // sumResult =result
     examination2 = *//*sumResult -*//* 1493550/3 - 9900/2
     println("examination2 = $examination2")
     result = 0
     println("ResOb = $ResOb")
     examination = ResOb - 1493550 - 9900
     println("examination = $examination")

    for(index in 1..9999){
        result += index
     }
     println(result)
     ResOb += (result - SumResult) * p
     newResult = ResOb - PastResult
     println("p = $p")
     println("newResult = $newResult")
     p++
     PastResult += (result - SumResult) * p
     result = 0

    for(index in 1..99999){
        result += index
     }
     println(result)
     ResOb += (result - SumResult) * p
     newResult = ResOb - PastResult
     println("p = $p")
     println("newResult = $newResult")
     p++
     PastResult += (result - SumResult) * p
     result = 0

    for(index in 1..999999){
        result += index
     }
     println(result)
     ResOb += (result - SumResult) * p
     newResult = ResOb - PastResult
     println("p = $p")
     println("newResult = $newResult")
     p++
     PastResult += (result - SumResult) * p
     result = 0

    for(index in 1..9999999){
        result += index
     }
     println(result)
     ResOb += (result - SumResult) * p
     newResult = ResOb - PastResult
     println("p = $p")
     println("newResult = $newResult")
     p++
     PastResult += (result - SumResult) * p
     result = 0

    for(index in 1..99999999){
        result += index
     }
     println(result)
     ResOb += (result - SumResult) * p
     newResult = ResOb - PastResult
     println("p = $p")
     println("newResult = $newResult")
     p++
     PastResult += (result - SumResult) * p
     result = 0

     for(index in 1..999999999){
         result += index
     }
     println(result)
     ResOb += (result - SumResult) * p
     newResult = ResOb - PastResult
     println("p = $p")
     println("newResult = $newResult")
     p++
     PastResult += (result - SumResult) * p
     examination2 = result - 4494949490505050550/9 - 39949494555050550/8 - 349494915050550/7 - 2994946550550/6 - 24949250550/5 - 199475550/4 - 1493550/3 - 9900/2
     println("examination2 = $examination2")
     result = 0
     println("ResOb = $ResOb")
     examination = ResOb - 4494949490505050550 - 39949494555050550 - 349494915050550 - 2994946550550 - 24949250550 - 199475550 - 1493550 - 9900
     println("examination = $examination")

        for(index in 1..9999999999){
         result += index
     }
     println(result)
     ResOb += (result - SumResult) * p
     newResult = ResOb - PastResult
     println("newResult = $newResult")
     p++
     PastResult += (result - SumResult) * p
     result = 0*/
}

