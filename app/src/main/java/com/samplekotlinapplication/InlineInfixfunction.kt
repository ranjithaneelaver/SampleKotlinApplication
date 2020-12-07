package com.samplekotlinapplication

fun main() {

    //infix function
    val b = Numbers()
    b addNumbers 10
    inlinefunExample { }
}

//save us memory overhead by preventing object allocations for the anonymous functions/lambda expression
inline fun inlinefunExample(myfunction: () -> Unit) {
    myfunction()

    print("Inline fumction example")

}


//infix function call function without parenthesis or brackets

class Numbers {
    var x = 10
    infix fun addNumbers(num: Int) {
        this.x = this.x + num
    }
}