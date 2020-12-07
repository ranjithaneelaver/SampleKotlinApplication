package com.samplekotlinapplication.generic

fun main() {
    Example<String, Int>("testing generics", null)
    
}

class Example<T, V>(value: T? = null, data: V? = null) {

    init {

        println("value is $value  $data")
    }
}






