package org.example.workingwithstringsandregularexpressions

class StringWork {
    fun main(args: Array<String>) {
        println("12.345-6.A".split("\\.|-".toRegex()))  // Явная передача регулярного выражения
        // [12, 345, 6, A]
        println("12.345-6.A".split(".", "-"))  // Передача нескольких разделителей
        // [12, 345, 6, A]


        parsePathVersion1("/Users/yole/kotlin-book/chapter.adoc")
        // Dir: /Users/yole/kotlin-book, name: chapter, ext: adoc
    }

    fun parsePathVersion1(path: String){
        val directory = path.substringBeforeLast("/")
        val fullName = path.substringAfterLast("/")

        val fileName = fullName.substringBeforeLast(".")
        val extension = fullName.substringAfterLast(".")

        println("Dir: $directory, name: $fileName, ext: $extension")
    }


    fun parsePathVersion2(path: String){
        val regex = """(.+)/(.+)\.(.+)""".toRegex()
        val matchResult = regex.matchEntire(path)
        if (matchResult != null){
            val (directory, fileName, extension) = matchResult.destructured
            println("Dir: $directory, name: $fileName, ext: $extension")
        }
    }
}