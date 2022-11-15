package com.tnp.testkotlin1

fun main() {

    val list = listOf(5,1,2,7) //immutable
    println(list)

    for (a in list) {
        println(a)
    }

    println(list.get(2))

    var mutableList = mutableListOf(5,1,2,7)

    mutableList.add(6)
    println(mutableList)


}