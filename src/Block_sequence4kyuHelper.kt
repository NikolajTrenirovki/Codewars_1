fun main() {
    var result: Long = 0
   // var sumResult: Long = 0 // сумма результатов работы циклов
    var SumResult: Long = 0 // резульат сложения всех предидущих разрядов, без умножения на колличество знаков в многозначных числах
    var PastResult: Long = 0 // результат сложения всех предидущих разрадов
    var newResult = longArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0,) // результат сложения текущего разряда (Res1, Res2, Res3...)
    var ResOb: Long = 0 // резьтат сложения всех разрядов (Res общий)
    var sumResOb: Long = 0 // результат сложения всех последовательностей
    var PastResOb: Long = 0 // общей результат до прибавления числе текущего разряда
    var p: Long = 1
    var examination: Long = 0 // проверка (в результате проверки должно получиться 45)
    var examination2: Long = 0 // проверка 2 (в результате проверки должно получиться 45)
    // нужно поставить проверки после каждого цикла
    var examinationSumResOb: Long = 0
    for(index in 1..9){
        result += index
    }
    println(result)
    ResOb = result
    sumResOb += ResOb
    println("sumResOb = $sumResOb")
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
    sumResOb += ResOb
    println("sumResOb = $sumResOb")
    newResult[1] = ResOb - PastResult
    println("newResult = ${newResult[1]}")
    p++
    PastResult += (result - SumResult) * p
    println("PastResult = $PastResult")
    println("result = $result")
  //  sumResult +=result
    SumResult = result
    examination2 = result - newResult[1]/2
    println("examination2 = $examination2")
    result = 0
    println("ResOb = $ResOb")
    examination = ResOb - newResult[1]
    println("examination = $examination")

    for(index in 1..999){
        result += index
     }
     println(result)
     PastResOb = ResOb
     ResOb += (result - SumResult) * p // проблема с SumResult
    sumResOb += ResOb
    println("sumResOb = $sumResOb")
     newResult[2] = ResOb - PastResOb
     println("p = $p")
     println("newResult = ${newResult[1]}")
     p++
     PastResult += (result - SumResult) * p
     SumResult =result
     examination2 = result - newResult[2]/3 - newResult[1]/2
     println("examination2 = $examination2")
     result = 0
     println("ResOb = $ResOb")
     examination = ResOb - newResult[2] - newResult[1]
     println("examination = $examination")

    for(index in 1..9999){
        result += index
     }
     println(result)
     PastResOb = ResOb
     ResOb += (result - SumResult) * p
    sumResOb += ResOb
    println("sumResOb = $sumResOb")
     newResult[3] = ResOb - PastResOb
     println("p = $p")
     println("newResult = ${newResult[3]}")
     p++
     PastResult += (result - SumResult) * p
    SumResult =result
    examination2 = result - newResult[3]/4 - newResult[2]/3 - newResult[1]/2
    println("examination2 = $examination2")
    result = 0
    println("ResOb = $ResOb")
    examination = ResOb - newResult[3] - newResult[2] - newResult[1]
    println("examination = $examination")

    for(index in 1..99999){
        result += index
     }
     println(result)
     PastResOb = ResOb
     ResOb += (result - SumResult) * p
    sumResOb += ResOb
    println("sumResOb = $sumResOb")
     newResult[4] = ResOb - PastResOb
     println("p = $p")
     println("newResult = ${newResult[4]}")
     p++
     PastResult += (result - SumResult) * p
    SumResult =result
    examination2 = result - newResult[4]/5 - newResult[3]/4 - newResult[2]/3 - newResult[1]/2
    println("examination2 = $examination2")
    result = 0
    println("ResOb = $ResOb")
    examination = ResOb - newResult[4] - newResult[3] - newResult[2] - newResult[1]
    println("examination = $examination")

    for(index in 1..999999){
        result += index
     }
     println(result)
     PastResOb = ResOb
     ResOb += (result - SumResult) * p
    sumResOb += ResOb
    println("sumResOb = $sumResOb")
     newResult[5] = ResOb - PastResOb
     println("p = $p")
     println("newResult = ${newResult[5]}")
     p++
     PastResult += (result - SumResult) * p
    SumResult =result
    examination2 = result - newResult[5]/6 - newResult[4]/5 - newResult[3]/4 - newResult[2]/3 - newResult[1]/2
    println("examination2 = $examination2")
    result = 0
    println("ResOb = $ResOb")
    examination = ResOb - newResult[5] - newResult[4] - newResult[3] - newResult[2] - newResult[1]
    println("examination = $examination")

    for(index in 1..9999999){
        result += index
     }
     println(result)
    PastResOb = ResOb
     ResOb += (result - SumResult) * p
    sumResOb += ResOb
    println("sumResOb = $sumResOb")
     newResult[6] = ResOb - PastResOb
     println("p = $p")
     println("newResult = ${newResult[6]}")
     p++
     PastResult += (result - SumResult) * p
    SumResult =result
    examination2 = result - newResult[6]/7 - newResult[5]/6 - newResult[4]/5 - newResult[3]/4 - newResult[2]/3 - newResult[1]/2
    println("examination2 = $examination2")
    result = 0
    println("ResOb = $ResOb")
    examination = ResOb - newResult[6] - newResult[5] - newResult[4] - newResult[3] - newResult[2] - newResult[1]
    println("examination = $examination")

    for(index in 1..99999999){
        result += index
     }
     println(result)
     PastResOb = ResOb
     ResOb += (result - SumResult) * p
    sumResOb += ResOb
    println("sumResOb = $sumResOb")
     newResult[7] = ResOb - PastResOb
     println("p = $p")
     println("newResult = ${newResult[7]}")
     p++
     PastResult += (result - SumResult) * p
    SumResult =result
    examination2 = result - newResult[7]/8 - newResult[6]/7 - newResult[5]/6 - newResult[4]/5 - newResult[3]/4 - newResult[2]/3 - newResult[1]/2
    println("examination2 = $examination2")
    result = 0
    println("ResOb = $ResOb")
    examination = ResOb - newResult[7] - newResult[6] - newResult[5] - newResult[4] - newResult[3] - newResult[2] - newResult[1]
    println("examination = $examination")

     for(index in 1..999999999){
         result += index
     }
     println(result)
     PastResOb = ResOb
     ResOb += (result - SumResult) * p
    sumResOb += ResOb
    println("sumResOb = $sumResOb")
     newResult[8] = ResOb - PastResOb
     println("p = $p")
     println("newResult = ${newResult[8]}")
     p++
     PastResult += (result - SumResult) * p
    examination2 = result - newResult[8]/9 - newResult[7]/8 - newResult[6]/7 - newResult[5]/6 - newResult[4]/5 - newResult[3]/4 - newResult[2]/3 - newResult[1]/2
    println("examination2 = $examination2")
    result = 0
    println("ResOb = $ResOb")
    examination = ResOb  - newResult[8] - newResult[7] - newResult[6] - newResult[5] - newResult[4] - newResult[3] - newResult[2] - newResult[1]
    println("examination = $examination")

    examinationSumResOb = sumResOb - 4494949490505050505 - 39949494555050505 - 349494915050505 - 2994946550505 - 24949250505 - 199475505 - 1493505 - 9855
    println("examinationSumResOb = $examinationSumResOb")
/*        for(index in 1..9999999999){
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

