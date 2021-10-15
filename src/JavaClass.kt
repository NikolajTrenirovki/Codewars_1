import kotlin.jvm.JvmStatic

class JavaClass {
    fun run() {}

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("строка")
            val JavaClass = JavaClass()
            JavaClass.run()
        }
    }
}