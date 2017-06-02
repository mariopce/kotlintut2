package eu.saramak.tut1

import org.junit.Test

/**
 * Created by saramakm on 23/05/2017.
 */
class FunctionsTest {

    fun add(x: Int, y: Int) : Int{
        return x+y
    }

    @Test
    fun `Should show how use fun`(){
        val res = add(2, 3);
        assert(5 == res)
    }


    fun addDefault(x: Int, y:Int =1, z:Int = 0): Int {
        return add(x, y+z)
    }

    @Test
    fun `Should show added default `(){
        val res = addDefault(2);
        assert(3 == res)
    }
    @Test
    fun `Should show added more default `(){
        val res = addDefault(x = 2, z=2);
        assert(5 == res, {"because y by default is 1"})
    }

    fun addInline(x: Int, y: Int) =  x+y

    @Test
    fun `Should show inline `(){
        val res = addInline(2, 2);
        assert(4 == res)
    }


    fun notInMainThread() : Nothing {
        throw IllegalAccessError("Not in main")
    }

    @Test(expected = IllegalAccessError::class)
    fun `Should check main thread `(){
        val res = notInMainThread()
        assert(res is Nothing)
    }


    @Test
    fun `Should pass many parameters`(){
        assert(printStrings("a", "b")=="ab")
    }


    fun printStrings(vararg strings: String) : String {
        var connected = ""
        for (string in strings){
            connected += string;
        }
        return connected
    }




}