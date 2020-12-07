package com.samplekotlinapplication


fun main() {

    //Sealed classes
    var success = Status.Success("Evaluated Success")
    var error = Status.Error(-1)
    eval(success)
    eval(error)


    //enum class
    checkEnum(Names.LOADING)





}

fun eval(status: Status) {
    when (status) {
        is Status.Success ->
            println("Success Value ${status.text}")

        is Status.Error ->
            println("Error Value ${status.status}")
    }
}

//Sealed Classes
//can use different types
sealed class Status {
    class Success(var text: String) : Status()

    class Error(var status: Int) : Status()


}


//enum class

//restrict us to use the same type for all enum constants
enum class Names(var status: Int) {
    SUCCESS(1), ERROR(-1), LOADING(0);
    companion object{

    }
}

fun checkEnum(names: Names) {
    when (names) {
        Names.SUCCESS ->
            println("Success Code ${names.status}")
        Names.ERROR ->
            println("Error Code ${names.status}")

        Names.LOADING ->
            println("Loading Code ${names.status}")
    }
}

internal class ExampleNew{
    var name:String?="ranjitha"
}