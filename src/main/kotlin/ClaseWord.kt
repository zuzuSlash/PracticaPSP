package ies.julian

class  ClaseWord{
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val frase = args[0]
            val longestLength = LargeWord(frase)
            println("La longuitud de la palabra mas larga es: $longestLength")
            println(frase)

        }
    }
}

fun LargeWord (frase: String): Int {
    var longestLength  = 0
    val words = frase.split(" ")

    for (word in words) {
        if (word.length > longestLength) {
            longestLength = word.length
        }
    }
    return longestLength


}

fun main() {
    val frase = "Hola buenasaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa tardes"

    val className = "ies.julian.ClaseWord"
    val classPath = System.getProperty("java.class.path")

    val parentPid = ProcessHandle.current().pid()
    println("PID del proceso padre: $parentPid")

    val processBuilder = ProcessBuilder(
        "java", "-cp", classPath, className, frase
    )

    val process = processBuilder.start()
    val childPid = process.pid()
    println("PID del proceso hijo: $childPid")

    process.waitFor()

    val result = process.inputStream.bufferedReader().readText()
    println("Salida del proceso hijo: $result")

}