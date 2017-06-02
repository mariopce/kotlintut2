package eu.saramak.tut1

import org.junit.Test

/**
 * Created by saramakm on 23/05/2017.
 */
class LoopsTest {


    @Test
    fun `Test a for loop`(){
        var s : String = ""
        for (a: Int in 99..100) {
            s += a
        }
        for (a: Int in 100 downTo 99) {
            s += a
        }
        for (a: Int in 20 .. 30 step 5) {
            s += a
        }
        //error
        for (a: Int in 50 downTo 40 step 5) {
            s += a
        }
        print(s)
        assert(s == "9910010099202530504540")
    }
    @Test
    fun `Test a for string loop`(){
        val capitals = listOf("Warsaw", "Berlin", "Amsterdam")
        var s= ""
        for (capital in capitals){
            s += capital + ","
        }
        println(s)
        assert(s =="Warsaw,Berlin,Amsterdam,")
    }

    @Test
    fun `Brake a loop`(){
        var x = 0
        loop@ while (x<10){
            x++
            if (x==5)
                break@loop
        }
        assert(x==5)
    }




}