package eu.saramak.tut1

import org.junit.Test

/**
 * Created by saramakm on 05/06/2017.
 */

class LazyCollections{
    @Test
    fun `Check lazy collections`(){
        val elements = 1..10000000000
        //asSequence() - 8s faster
        val output = elements.asSequence().filter { it<30 }.map { Pair("yes", it) }
        val o = output.first()
        assert(o == Pair("yes", 1L))
    }


    @Test
    fun `Check lazy sum collections`(){
        val elements = 1..10000000000
        //asSequence() - 8s faster
        val output = elements.asSequence().take(30).sum()

        assert(output == 465L, {output})
    }

    @Test
    fun `Check geb seq collections`(){
        val elements = generateSequence(1) { x -> x*2 }
        for (el in elements.take(10)){
            println(el)
        }
        println(elements)
        val output = elements.take(3).sum()
        assert(output == 7, {output})
    }

    @Test
    fun `Check lazy var`(){
        val lazyVal: Int by lazy {
            println ("lazy init")
            10
        }
        assert(lazyVal == 10, {lazyVal})
    }
}