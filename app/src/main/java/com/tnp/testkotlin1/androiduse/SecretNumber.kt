package com.tnp.testkotlin1.androiduse

import java.util.*

class SecretNumber {

    val secret = Random().nextInt(10)+1;
    var count = 0;
    fun validate(number : Int)  = number - secret;



}



fun main() {
    var secretNumber = SecretNumber()
    println(secretNumber.secret)
    println(secretNumber.validate(3));
}