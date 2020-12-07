package com.samplekotlinapplication.Scopefunction

import com.samplekotlinapplication.model.User

fun main(){

    val person = User().also {persondetails->
        persondetails.name = "ranjitha"

       return@also println("Person name is $persondetails ")
    }.run {
        println("Person name is $name")
    }

    print(person)

}