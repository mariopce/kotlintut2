package eu.saramak.tut1

import org.junit.Test

/**
 * Created by saramakm on 23/05/2017.
 */
class FunctionsTest {

    @Test
    fun `Should show how use fun`(){
        val res = add(2, 3);
        assert(5 == res)
    }

    fun add(x: Int, y: Int) : Int{
        return x+y
    }
}