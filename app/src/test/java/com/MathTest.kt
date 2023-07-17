package com

import junit.framework.Assert.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test
import com.example.test.Math

class MathTest {

    var math :Math? = null

    @Before
    fun init(){
        math = Math()
    }

    @Test
    fun simpleAdd() {
        assertEquals("5", math?.add("2","3"))
    }

    @Test
    fun symbolAdd() {
        assertEquals("Нужно только числа", math?.add("2","3#$"))
    }

    @Test
    fun doubleAdd() {
        assertEquals("4", math?.add("2","2.0"))
    }

    @Test
    fun negativeAdd() {
        assertEquals("0", math?.add("2","-2.0"))
    }

    @Test
    fun egativeAdd() {
        assertEquals("2000002", math?.add("2","2,000,000"))
    }


    @Test
    fun simpleDevide(){
        assertEquals("4",math?.divide("8","2"))
    }

    @Test
    fun simpleZeroDevide(){
        assertEquals("на ноль делить нельзя",math?.divide("8","0"))
    }


    @After
    fun detach() {
        math=null
    }
}