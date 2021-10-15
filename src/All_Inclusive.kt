fun main() {
    var list: MutableList<String> = ArrayList()
    list.add("строка")
    list.add("нестрока")
    println(containAllRots("строка", list as ArrayList<String>))
    var a = arrayListOf("bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs")
    println(containAllRots("bsjq", a))
    a = arrayListOf("TzYxlgfnhf", "yqVAuoLjMLy", "BhRXjYA", "YABhRXj", "hRXjYAB", "jYABhRX", "XjYABhR", "ABhRXjY")
    println(containAllRots("XjYABhR", a))
/*    var rut : rotationsMainTest = rotationsMainTest()
    rut.test()*/
}

fun containAllRots(strng:String, arr:ArrayList<String>):Boolean {
    var result: Boolean = strng in arr
    if (strng.equals(""))
        result = true
    return result
}
