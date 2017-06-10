package eu.saramak.tut2

import org.junit.Test

/**
 * Created by saramakm on 10/06/2017.
 */

infix fun String.shouldBeEqualsTo(value: String): Boolean {
    return this == value;
}



class InfixTest {

    infix fun fuck(value : String):Nothing{
        throw NullPointerException(this::class.java.toString()  + value);
    }

    @Test
    fun `Should equals String`(){
        assert("h".shouldBeEqualsTo("h"))
    }

    @Test
    fun `Should equals String infix`(){
        "h" shouldBeEqualsTo "h"
        assert(true)
    }

    @Test(expected = NullPointerException::class)
    fun `Should equals Object infix`(){
        this fuck "message"
        assert(true)
    }
}