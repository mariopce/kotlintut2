package eu.saramak.tut2

import org.junit.Test

/**
 * Created by saramakm on 13/06/2017.
 */
fun String.println(){
    println(this)
}

class InlineFunTest {

    @Test
    fun `should use inline function`(){
        "Before calling op".println();
        operation { println("This is the body fun") }
        "After calling op".println()
    }

    fun operation(op : () -> Unit){
        op();
    }

    inline fun wrongPlace(i : Int){

    }
    inline fun wrongPlace2(noinline op : () -> Unit){

    }
    inline fun wrongPlace3(op : () -> Unit){
        val op3 = "wrong"//op;

    }
}