package com.tnp.testkotlin1

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.tnp.testJava1.lottery.BigGame
import com.tnp.testkotlin1.androiduse.SecretNumber
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.linear_main.view.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var secretNumber = SecretNumber()

    private lateinit var testText : TextView  //https://ithelp.ithome.com.tw/articles/10240620
    private lateinit var btn : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  //setContentView(R.layout.linear_main)

//        var test = findViewById<android.view.View>(R.id.number)
//        test.textView.text

        testText = findViewById(R.id.number);
        Log.d("test",testText.text.toString());

    }


    fun check(view : View) {
        val n = number.text.toString().toInt()
        println("number : $n")
        Log.d("MainActivity", "number:"+n)

        val diff = secretNumber.validate(n)
        var msg = "命中"

        if ( diff < 0) {
            //Toast.makeText(this,"再大一點",Toast.LENGTH_LONG).show()
            msg = "再大一點"
        } else if (diff > 0 ){
            //Toast.makeText(this,"小一點",Toast.LENGTH_LONG).show()
            msg = "小一點"
        }
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show()

        AlertDialog.Builder(this).
        setTitle("message").
        setMessage(msg).
        setPositiveButton("ok",null).
        show()


    }
}

fun main(args: Array<String>) {
    //KeyinTest(args)

    var ctry = Country("England" , 30)

    //testCallJava()

    var newString = "01234567890".newString(); //extension
    //println(newString)




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
