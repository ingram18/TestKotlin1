package com.tnp.testkotlin1.school


fun main() {
    var stu = Student("ingram", 99 , 82)
    stu.printData();

}




class Student(var name : String , var eng : Int, var math : Int ) {


    fun printData() {
        print("$name's score : English : $eng , Math : $math")
    }


}