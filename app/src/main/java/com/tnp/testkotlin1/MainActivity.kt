package com.tnp.testkotlin1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tnp.testJava1.lottery.BigGame
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

fun main(args: Array<String>) {
    //KeyinTest(args)

    var ctry = Country("England" , 30)

    //testCallJava()

    var newString = "01234567890".newString(); //extension
    println(newString)


}

private fun testCallJava() {
    var callJava = BigGame();
    callJava.testInt = 10;
    callJava.generate();
}

private fun KeyinTest(args: Array<String>) {
    println("please input a number")
    var scanner = Scanner(System.`in`)
    var number = scanner.next()
    println("number is $number , ${args[0]}  ,  ${args[1]}")
}
