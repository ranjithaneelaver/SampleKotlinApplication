package com.samplekotlinapplication


fun main() {
    val objectExample = ObjectExample()

    objectExample.getString()

    //singleton

    Singleton.name
    Singleton.getName()

    //extending open class
    Singleton.getAge()
}


class ObjectExample {
    private fun addString() =
        object {  //private function so the return type is the anonymous object type
            val x: String = "ranjitha"
        }

    fun getString() {
        val name = addString().x
        println(name)
    }
}

object Singleton : getUserAge() {


    init {
        println("Singleton class")

    }

    var name = "singleton"
    fun getName() {
        println(name)
    }

    override fun getAge() {
        super.getAge()
    }
}

open class getUserAge { //kotlin class default final so its cant be inherited //so must mark it to open

    open fun getAge() {
        println(44)
    }

}