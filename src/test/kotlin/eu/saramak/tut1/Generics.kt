package eu.saramak.tut1

import org.junit.Test
import sun.net.www.content.text.Generic

/**
 * Created by saramakm on 02/06/2017.
 */
class Generics {
    @Test
    fun `test generic repo implementation`() {
        val customRepository = GenericRepo<Customer>();
        val result = customRepository.getCusById(1);
        assert(result=="Ba", {result})
    }
}