fun main() {
    var result: Long = 0
    var sumResult: Long = 0 // сумма результатов работы циклов
    var res: Long = 0 // резульат сложения всех предидущих разрядов, без умножения на колличество знаков в многозначных числах
    var PastResult: Long = 0 // результат сложения всех предидущих разрадов
    var newResult: Long = 0 // результат сложения текущего разряда (Res1, Res2, Res3...)
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
    newResult = ResOb
   // println("$newResult * $p = ${newResult*p}")
    println("p = $p")
    println("newResult = $newResult")
    p++
    PastResult = result
    sumResult +=result
    result = 0

    for(index in 1..99){
       result += index
    }
    println(result)
    ResOb += (result - res) * p
    newResult = ResOb - PastResult
    println("p = $p")
    println("newResult = $newResult")
    p++
    PastResult += (result - res) * p
    println("result = $result")
    sumResult +=result
    examination2 = sumResult - 9900/2
    println("examination2 = $examination2")
    result = 0
    println("ResOb = $ResOb")
    examination = ResOb - 9900
    println("examination = $examination")

    for(index in 1..999){
        result += index
     }
     println(result)
     ResOb += (result - res) * p
     newResult = ResOb - PastResult
     println("p = $p")
     println("newResult = $newResult")
     p++
     PastResult += (result - res) * p
    sumResult +=result
     examination2 = sumResult - 1493550/3 - 9900/2
     println("examination2 = $examination2")
     result = 0
     println("ResOb = $ResOb")
     examination = ResOb - 1493550 - 9900
     println("examination = $examination")

    for(index in 1..9999){
        result += index
     }
     println(result)
     ResOb += (result - res) * p
     newResult = ResOb - PastResult
     println("p = $p")
     println("newResult = $newResult")
     p++
     PastResult += (result - res) * p
     result = 0

    for(index in 1..99999){
        result += index
     }
     println(result)
     ResOb += (result - res) * p
     newResult = ResOb - PastResult
     println("p = $p")
     println("newResult = $newResult")
     p++
     PastResult += (result - res) * p
     result = 0

    for(index in 1..999999){
        result += index
     }
     println(result)
     ResOb += (result - res) * p
     newResult = ResOb - PastResult
     println("p = $p")
     println("newResult = $newResult")
     p++
     PastResult += (result - res) * p
     result = 0

    for(index in 1..9999999){
        result += index
     }
     println(result)
     ResOb += (result - res) * p
     newResult = ResOb - PastResult
     println("p = $p")
     println("newResult = $newResult")
     p++
     PastResult += (result - res) * p
     result = 0

    for(index in 1..99999999){
        result += index
     }
     println(result)
     ResOb += (result - res) * p
     newResult = ResOb - PastResult
     println("p = $p")
     println("newResult = $newResult")
     p++
     PastResult += (result - res) * p
     result = 0

     for(index in 1..999999999){
         result += index
     }
     println(result)
     ResOb += (result - res) * p
     newResult = ResOb - PastResult
     println("p = $p")
     println("newResult = $newResult")
     p++
     PastResult += (result - res) * p
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
     ResOb += (result - res) * p
     newResult = ResOb - PastResult
     println("newResult = $newResult")
     p++
     PastResult += (result - res) * p
     result = 0
}

