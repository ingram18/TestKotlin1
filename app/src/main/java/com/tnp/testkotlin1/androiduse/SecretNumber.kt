package com.tnp.testkotlin1.androiduse

import android.content.ContentValues.TAG
import android.util.Log
import java.util.*

class SecretNumber {

    val secret = Random().nextInt(10)+1;
    var count = 0;
    fun validate(number : Int)  = number - secret;

    fun test1(i : Int) : SecretNumber{
        Log.d(TAG, "test1: $i")
        return this;
    }
    fun test2(i : Int) : SecretNumber {
        Log.d(TAG, "test2: $i")
        return this
    }

    class c1 {
        fun test3(i : Int) {
            Log.d(TAG, "test3: $i")
        }

    }
    class c2 {
        fun test4(i : Int) {
            Log.d(TAG, "test4: $i")
        }

    }




}



fun main() {
    var secretNumber = SecretNumber()
    println(secretNumber.secret)
    println(secretNumber.validate(3));
}