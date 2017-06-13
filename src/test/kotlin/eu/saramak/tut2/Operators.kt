package eu.saramak.tut2

import org.junit.Test

/**
 * Created by saramakm on 13/06/2017.
 */
class Age(val age: Int) {
    operator fun plus(age: Age): Age {
        val newAge = this.age + age.age;
        return Age(newAge)
    }
}

class Operators {
    @Test
    fun `Test plus operator`(){
        val myAge = Age(32)
        val yourAge = Age(31)
        val sum = myAge+yourAge;
        assert(sum.age==63)
    }
}
