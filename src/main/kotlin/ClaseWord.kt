package ies.julian

class  ClaseWord{
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val words = (args[0]).split(" ")
            println(words)

        }
    }
}

fun launchFrase(words: String): Int {
    val className = "ies.julian.ClaseWord"
    val classPath = System.getProperty("java.class.path")

    val processBuilder = ProcessBuilder(
        "java", "-cp", classPath, className,
        words
    )

    val process = processBuilder.start()
    val result = process.inputStream.bufferedReader().readText()
    return result.toInt()
}

fun LargestWord (word: String) {

}

fun main(args: Array<String>) {
    val childProcess = launchFrase(args[0])

}