package eu.saramak.tut1

import org.junit.Test

/**
 * Created by saramakm on 31/05/2017.
 */
class ObjectsTest {

    @Test
    fun `Test objects`() {
        assert(Global.PI == 3.14)
    }

    object Global{
        val PI =3.14
    }

}


