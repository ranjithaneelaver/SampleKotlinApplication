package com.samplekotlinapplication

fun main(){

    multiplyNumber(5,6,{s:Int-> println(s)}) //{s:Int-> println(s)}  --parameter operator  body

    multiplyNumber(5,6){a:Int,b:Int -> a + b}
}

fun multiplyNumber(a:Int,b:Int,action:(Int) ->Unit ){

    val sum = a*b
    action(sum)

}

fun multiplyNumber(a:Int,b:Int,action:(Int,Int) ->Int ){

    val sum = action(a,b)
    println(sum)

}