package com.samplekotlinapplication.Scopefunction

import com.samplekotlinapplication.model.User

fun main() {

    LetOperation()
}

private fun LetOperation() {
    val person = User("ranjitha", 25).let {
        return@let "The name of the Person is: ${it.name}"
    }
    print(person)

    //it can be readable lamda parameter
    //if not return anything it will take last statement

    val person1 = User("ranjitha", 25).let { persondetails ->
        persondetails.name = "hani"
        "The name of the Person is: ${persondetails.name}"
    }
    print(person1)

    //null check
    val name = User(null, 0).name?.let {
        "name of the person $it"
    }
    print(name)

    //let perform operation

    val list = mutableListOf("one","two","three","four")
    list.map { it.length }.filter { it>3 }.let { print(it) }

}

