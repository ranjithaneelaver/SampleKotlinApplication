package com.samplekotlinapplication

fun main() {
    getuserData("ranjitha", 20)

    //named arguments
    getuserData(name = "anitha", age = 45)
    getuserData("anitha", age = 4)


    //multiply
    multiply()
}

fun getuserData(name: String, age: Int) {
    println("name $name  age $age")
}


//tailrec
var count = 0
tailrec fun multiply(): Int {
    count++
    if (count < 5) {
        println(count)
        return multiply()

    }

    return 0
}
