package com.samplekotlinapplication

fun main() {
    //fixed array
    val arraylist = Array<Int>(5) { 0 }
    arraylist[0] = 34
    arraylist[1] = 35
    arraylist[2] = 36

    for (i in 0..arraylist.size - 1) {
        println(arraylist[i])
    }

    for (element in arraylist) {
        println(element)
    }

    //list

    val list = listOf<Int>(1, 66, 7, 44, 8, 99, 34)  //this list of immutable


    for (e in list)
        println("list of example $e")

    //filter

    val filterlist = list.filter { num -> num < 10 } ///{it<10}

    for (e in filterlist)
        println("filterlist of example $e")


    //mutable list
    val list1 =
        mutableListOf<String>("cat", "dog", "tiger") //mutable, no fixed size , can add or remove
    list1.add("lion")
    list1.add("zebra")

    for (e in list1)
        println("mutable list " + e)

    //map

    var map = mapOf<Int, String>(4 to "name", 5 to "place") //immutable fixed size
    println(map.keys)

    for (key in map)
        println("key " + key.key + "value " + key.value);

    val hasmap = HashMap<Char, String>()  //mutable list
    hasmap.put('r', "ranitha")
    hasmap.put('h', "hani")
    hasmap.put('r', "mani")  //ranjitha replaced by mani
    hasmap.replace('h', "hour")

    for (key in hasmap.keys) {
        println("Element at key $key = ${hasmap[key]}")
    }
    val linkedhasmap = mutableMapOf<Char, String>()  //mutable list //linkedhasmap

    //set
    //set contains unique elements
    //hasSet also contains unique elements but sequence is not
    var mySet = setOf<Int>(2, 4, 5, 6, 4) //Immutable
    for (e in mySet)
        println(e)

    var mutableSet = mutableSetOf<Int>() // mutable print sequence
    mutableSet.add(5)
    mutableSet.add(10)
    mutableSet.add(12)
    mutableSet.add(12)

    mutableSet.remove(10)

    for (e in mutableSet)
        println("\n mutable list $e")

    var hashSet = hashSetOf<Int>() // mutable print item not sequence
    hashSet.add(5)
    hashSet.add(10)
    hashSet.add(12)
    hashSet.add(12)
    hashSet.add(1)
    hashSet.add(3)
    hashSet.add(5)

    for (e in hashSet)
        println("\n hasset list $e")


}

