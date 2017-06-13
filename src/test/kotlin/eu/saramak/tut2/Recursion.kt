package eu.saramak.tut2

import org.junit.Test

/**
 * Created by saramakm on 13/06/2017.
 */
class Recursion {


    fun factorial(number: Long) : Long {
        when(number){
            0L,1L-> return 1L;
            else -> return number * factorial(number -1)
        }
    }

    tailrec fun factorialTR(number: Long, accumulator : Long = 1) : Long {
        when(number){
            0L-> return accumulator;
            else -> return factorialTR(number-1, accumulator*number);
        }
    }

    @Test
    fun `Should return factorial`(){
        val result = factorial(25);
        assert(result==7034535277573963776, {result})
    }
    @Test
    fun `Should return tailrec factorial`(){
        val result = factorialTR(25);
        assert(result==7034535277573963776, {result})
    }
}

//fun main(args: Array<String>){
//    println(Recursion().factorial(5));
//    println(Recursion().factorialTR(5));
//}