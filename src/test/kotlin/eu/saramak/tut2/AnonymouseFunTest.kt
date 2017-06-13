package eu.saramak.tut2

import org.junit.Test

/**
 * Created by saramakm on 10/06/2017.
 */

fun doOperation(x: Int, op: (Int) -> Int): Int {
    return op.invoke(x);
}

class AnonymouseFunTest{

    @Test
    fun `should call operation`(){
         val res = doOperation(3, {it*it});
        assert(res==9)
    }



    @Test
    fun `should call anonymouse operation`(){
        val res = doOperation(3, fun(x):Int {
            if (x>3){
                return x;
            }
            return x*9
        });
        assert(res==27, {res})
    }


}