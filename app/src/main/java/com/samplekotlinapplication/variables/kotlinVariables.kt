package com.samplekotlinapplication.variables

import com.samplekotlinapplication.model.User


//included loop,var,val,default member function,const

val name = "ranjitha"
var age = 15
const val constname = 20

fun main(args: Array<String>) {

    //print constval

    println("Const Val $constname")
    //assigned val value
    println(name)

    //reassigned value var age
    age = 20

    //assigned var value
    println(age)

    val user1 = User(name = "Yogi", age = 27)
    printUser(user1)

    //default passing only number
    defaultValue(number = 10)


    //default value
    defaultValuePass()


}


fun printUser(user: User) {
    println(user)
    println("String interpolation ${user.age}")

}

fun defaultValue(letter: Char = 'a', number: Int) {
    println("default value passing $letter $number")

    //loop in charecters
    for (i in 1..number) {
        println("default value passing $letter")
    }
}

//passing default value

fun defaultValuePass(letter: Char = 'r', number: Int = 13) {
    println("default both value  $letter $number")
}


