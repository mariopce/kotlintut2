package eu.saramak.tut1

import org.junit.Test

/**
 * Created by saramakm on 02/06/2017.
 */


class StandartLib {

    @Test
    fun `Collection test`(){
        //List is immutable
        //Array list is mutable
       var list : List<String> = ArrayList()
        list+=""
       assert(list.size==1)
    }

    @Test
    fun `Collection test list of `(){
        //List is immutable
        //Array list is mutable
        var list : List<String> = listOf("m", "a")
        println(list)
        list+="r"
        assert(list.size==3)
    }

    @Test
    fun `Collection test numbers `(){
        val numbers = 1..100
        println(numbers)
        assert(!numbers.isEmpty())
    }

    @Test
    fun `Collection test mutblelist `(){
        val mutableCities = mutableListOf<String>("Warsaw", "Amsterdam")
        mutableCities.add("Berlin")
        println(mutableCities)
        assert(!mutableCities.isEmpty())
    }
}