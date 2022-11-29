package com.tnp.testkotlin1

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.tnp.testJava1.lottery.BigGame
import com.tnp.testkotlin1.androiduse.SecretNumber
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.linear_main.view.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var secretNumber = SecretNumber()
    val TAG = MainActivity::class.java.simpleName;  //得到class名稱

    private lateinit var testText : TextView  //https://ithelp.ithome.com.tw/articles/10240620
    private lateinit var btn : Button

    val functions = listOf<String>("Camera",
        "Invite friend",
        "Parking",
        "download coupons",
        "News",
        "Maps")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  //setContentView(R.layout.linear_main)

//        var test = findViewById<android.view.View>(R.id.number)
//        test.textView.text

        testText = findViewById(R.id.number);
        Log.d(TAG,testText.text.toString());


        //RecyclerView


        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter


    }

    inner class FunctionAdapter() : Adapter<String> {

        fun test1() {
            functions
        }
    }

    class FunctionHolder(view : View) : ViewHolder(view) {

    }


    fun check(view : View) {
        val n = number.text.toString().toInt()
        //ref : https://techiedelight.com/zh/get-name-current-function-kotlin/
        val TAG = object{}.javaClass.enclosingMethod?.name;  //得到所在FUN名稱,即check
        println("number : $n")
        Log.d(TAG, "number:"+n)

        val diff = secretNumber.validate(n)
        var msg = getString(R.string.you_got_it)//resources.getString(R.string.you_got_it)


        if ( diff < 0) {
            //Toast.makeText(this,"再大一點",Toast.LENGTH_LONG).show()
            msg = getString(R.string.bigger)
        } else if (diff > 0 ){
            //Toast.makeText(this,"小一點",Toast.LENGTH_LONG).show()
            msg = getString(R.string.smaller)
        }
        var toast =  Toast.makeText(this,msg,Toast.LENGTH_LONG)
        toast.setGravity(Gravity.CENTER_VERTICAL , 0 ,0)
        toast.show();


        AlertDialog.Builder(this).
        setTitle(getString(R.string.dialog_title)).
        //setTitle(TAG).
        setMessage(msg).
        setPositiveButton(getString(R.string.ok),null).
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
