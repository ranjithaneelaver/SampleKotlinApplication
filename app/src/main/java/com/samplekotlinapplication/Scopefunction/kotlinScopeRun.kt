package com.samplekotlinapplication.Scopefunction

import com.samplekotlinapplication.model.User

fun main() {
    RunOperation()
}

fun RunOperation() {

    //it cannot be renamed to be readable lamda parameter
    //run use this keyword
    val person = User("ranjitha", 25).run {
        name = "anu"
        age = 55
        "The name of the Person is: $this $age"
    }
    print(person)

    //run can do null check

    val person1 = User(null, 5).name?.run {

        return@run "\n The name of the Person is: $this"
    }

    print("\n $person1")


}
