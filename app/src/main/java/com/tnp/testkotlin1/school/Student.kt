package com.tnp.testkotlin1.school


fun main() {
    var stu = Student("jeny", 68 , 52)
    var gstu = GraduateStudent("tony" , 30 , 90, 89 )

    //Student.pass
    stu.printData();
    gstu.printData();

}


class GraduateStudent(name: String, eng: Int, math: Int , var thesis : Int) : Student(name, eng, math) {
    companion object {
        val pass = 70;

    }

    override fun getAverage() = (eng + math + thesis) /3

    override fun passOrFail() = if (getAverage() >= pass) "pass" else "fail"

    override fun printData() {

        println("$name's score : English : $eng , Math : $math , Thesis : $thesis," +
                "average : ${getAverage()} , status : ${passOrFail()}")
    }
}



open class Student(var name : String , var eng : Int, var math : Int ) {

    companion object {
        @JvmStatic
        val pass = 60;

    }

    open fun printData() {
        println("$name's score : English : $eng , Math : $math , " +
                "average : ${getAverage()} , status : ${passOrFail()}")
    }

    open fun getAverage() = (eng+math)/2;


    open fun passOrFail() = if (getAverage() >= pass) "pass" else "fail"


}