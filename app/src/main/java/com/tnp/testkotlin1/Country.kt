package com.tnp.testkotlin1

import java.util.*

class Country(s: String, i: Int) {

    var charA = 'a'
    var weight = 33.6f
    var score : Int = 8
    //true //must change to Integer to compare //L144
    var testB = charA.toInt() == 97

    init {

    }

    fun TestForloop() {

        for ( i in 1..4) {
            println("run $i time , A = $charA , weight = $weight , testB = $testB")
        }

        score = 5

    }

    fun TestIfElse() {
        var math = 20
        var eng = 30

        var max = (math > eng) ? math : eng

        print("max value : $max")

    }

}


fun main(args: Array<String>) {
    //TestKeyIn()

    var score : Int
    var s:String?

    println("s = ${s?.get(3)}")
    //println("s = ${s!!.get(3)}")
    if (s == null) {
        println("s is null")
    }


    Country("England", 30).TestForloop()

    Country().TestIfElse()

}

private fun TestKeyIn() {
    println("please input a number")
    var scanner = Scanner(System.`in`)
    var number = scanner.next()
    println("number is $number")
}