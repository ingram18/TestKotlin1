package com.tnp.testkotlin1

import java.util.*

class Country(s: String = "", i: Int = 0 ) {

    var charA = 'a'
    var weight = 33.6f
    var score : Int = 8
    //true //must change to Integer to compare //L144
    var testB = charA.toInt() == 97

    init {

    }

    /*constructor() {

    }*/

    fun TestForloop() {

        for ( i in 1..4) {
            println("run $i time , A = $charA , weight = $weight , testB = $testB")
        }

        score = 5

    }

    fun TestFor() {

        print("i is ")
        for (i in 1..100 step 10) {

            print("$i ")
        }
       println()


    }

    //
    fun TestIfElse() : Int{
        var math = 20
        var eng = 30

        //case 1
        var max = if  (math > eng)  math  else eng  //無java的三元運算 ?:
        //case 2
        max = if (math > eng) {
            println("max is Math: &math")
            math
        } else {
            println("max is English : $eng")
            eng
        }

        //case 3
        println("if english > 30 then pass : " + if (eng > 30) "PASS" else "Failed")


        return max;

        println("max value : $max")

    }


    fun TestWhen(grading : Int) : Char {
        var grading:Char = when (grading) {

            in 90..100 -> 'A'
            in 80..89 -> 'B'
            76,77,78,79 -> 'C'
            else -> 'F'

        }

        println("The grading is $grading")

        return grading



    }


    fun TestWhen1(grading: Int) = when (grading) {

        in 90..100 -> 'A'
        in 80..89 -> 'B'
        76,77,78,79 -> 'C'
        else -> 'F'


    }


    fun testAssertion(value : Int) : Int{

        var result = when (value) {

            in 1..100 -> 0
            else -> 1

        }
        return result

    }



}


fun main(args: Array<String>) {
    //TestKeyIn()

    var score : Int
    var s:String? = null

    println("s = ${s?.get(3)}")
    //println("s = ${s!!.get(3)}")
    if (s == null) {
        println("s is null")
    }


    Country("England", 30).TestForloop()

    Country("Japan" , 30).TestIfElse()
    Country("korea" , 31).TestWhen(78)
    Country("korea" , 31).TestWhen1(77)
    Country("korea" , 31).TestFor()

}

private fun TestKeyIn() {
    println("please input a number")
    var scanner = Scanner(System.`in`)
    var number = scanner.next()
    println("number is $number")
}