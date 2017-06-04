package eu.saramak.tut1

import org.junit.Test

/**
 * Created by saramakm on 03/06/2017.
 */
class Nullables{
    @Test
    fun `Call null message`(){
        val message: String?= null
        assert(message==null)
    }

    @Test
    fun `Call suspected null message`(){
        val message = null
        assert(message==null)
    }
    var message : String? = null
    @Test
    fun `Call maybe null message`(){
        doSomething()
        assert(message?.length == 5, {"" + message?.toString()})
    }


    @Test
    fun `Call no null message`(){
        var m : String? = null
        if (m!=null) {
            assert(m.length == 5, { "" + m?.toString() })
        }
        assert(true)
    }

    @Test
    fun `Call safe null message`(){
        var m : String? = null
        assert(m?.length == null, { "" +m })
    }

    private fun doSomething() {
        message = "hello"
    }
}