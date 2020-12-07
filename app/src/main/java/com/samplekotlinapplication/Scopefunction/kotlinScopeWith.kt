package com.samplekotlinapplication.Scopefunction

import com.samplekotlinapplication.model.Person
import com.samplekotlinapplication.model.User

fun main() {
    WithOperation()
}

fun WithOperation() {

    //allows to modify inside object
    val person = with(User("anu", 45)) {
        name = "hani"
        age = 23

        return@with print("Name of the Person ${this.name} \n")

    }
    print(person)

    //null check in with

    val person1: Person? = null
    with(person1) {
        this?.name = "testing with"
        this?.mobnumber = 444444

    }

    // performing null operation in with operator is difficult so it can replace with run
    //eg:
    // person1?.run {
    //   name = "testing with"
    // mobnumber = 1111
    //  }


}
