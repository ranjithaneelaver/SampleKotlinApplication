package com.samplekotlinapplication



interface Base1 {
    fun printVale()

}


fun main(){

    val b = BaseImpl(10)
    Derived(b).printVale()

    //lazy keyword eg
    println(variable)

}

class BaseImpl(val x:Int):Base1 {
     override fun printVale() {
       println(x) // method implementation
    }

}

class Derived(b:Base1) : Base1 by b //delegating public method

//Lazy keyword

val variable:String by lazy {
    "Testing lazy"
}