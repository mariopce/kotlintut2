package eu.saramak.tut1

import org.junit.Test

/**
 * Created by saramakm on 23/05/2017.
 */

class VariablesTest {


    @Test
    fun `Should show initalization of variables`(){
        var mod = "a"
        mod = "b"
        assert(mod == "b")
    }

    @Test
    fun `Should show immutable variables`(){
        val mod = "a"
        //mod = "b" // not possible
        assert(mod == "a")
    }

    @Test
    fun `Should declare val `(){
        val double : Double = 1.1
        val myInt = 1;
        val myLong = 10L
        val myFloat = 10F
        val myHex = 0x0F;
        val myBinary = 0b10;
        val myLongAgain = myInt.toLong()
        println(myBinary)
        assert(myHex == 15)
        assert(myBinary == 2)
        assert(myLongAgain == 1L)
    }

    @Test
    fun `Declare string`() {
        val myString = "Hello world"
        val myChar = 'a'
        val escapeCharInString = "Hello \n world !!"
        println(escapeCharInString)
        val multipleLines = """
This is my multiple line text
  Omg in java not possible
        """
        println(multipleLines)
        val years = 14;
        val agreement = "I meet my wife $years ego"
        assert(agreement == "I meet my wife 14 ego")
    }

    @Test
    fun `Get name length`() {
        val name = "Mario"
        val len = "$name len is ${name.length}"
        assert(len == "Mario len is 5")
    }
}