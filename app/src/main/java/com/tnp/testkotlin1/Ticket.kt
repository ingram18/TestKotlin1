package com.tnp.testkotlin1

import kotlin.random.Random

data class Ticket(var origin:Int , val destination : Int , val price : Int)


fun main(args: Array<String>) {
    var ticket = Ticket(20,51,420)
    //testExtensions()



}

private fun testExtensions() {
    val s = "abcdefg"
    println(s.validate());
    println((1..10).random())
}

fun String.validate() : Boolean {
    return this.length >= 6;
}

//kotlin extension
fun String.newString() =
    this.substring(0..5)

fun IntRange.random() : Int {
    val ra = Random(6).nextInt(endInclusive-start)+start
    return ra

}