package com.tnp.testkotlin1

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CountryTest {

    @Test
    fun testWhenTest() {
        val a = Country()
        //Assertions.assertEquals('A' , a.TestWhen1(99))

        Assertions.assertEquals("0".toInt() , a.testAssertion(33).toInt())

        Assertions.assertEquals('A' , a.TestWhen1(90))
        //Assertions.assertEquals('A',)
        //Assertions.assertEquals(/* expected = */ 'A',/* actual = */ a.TestWhen1(80))

        //Assertions.assertEquals('a' , a.TestWhen(90))

    }




}