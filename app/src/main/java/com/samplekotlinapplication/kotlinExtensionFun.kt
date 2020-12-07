package com.samplekotlinapplication

fun main() {
    var example = Example()
    example.getGreaterNumber(5)
    example.addNumber(10, 5)
    example.appendString("str1", "str2");
    val str1 = "hii"
    val str2 = "ranjitha"

    println("Adding two strings " + str2.appendNewString(str1))


}

private fun String.appendNewString(str1: String): String {
    return this + str1;
}
//extension function

fun Example.addNumber(a: Int, b: Int): Boolean {
    return a > b
}

fun Example.appendString(a: String, b: String): String {

    return a + b
}

class Example {

    fun getGreaterNumber(a: Int): Boolean {
        return a > 10
    }
}