package eu.saramak.tut1

import org.junit.Test

/**
 * Created by saramakm on 23/05/2017.
 */
class ConditionsTest {

    @Test
    fun `Test if condition`() {

        val mySting = "not empty"
        val cond = if (mySting != "") {
            "is " + mySting
        } else {
            "is empty"
        }

        assert(cond == "is not empty")
    }

    @Test
    fun `Test when condition`() {

        val mySting = "a"
        val cond = when (mySting) {

            "a" -> "value"
            is String -> {
                println("this line")
                "string"
            }
            else -> "Not match"
        }

        assert(cond == "value")
    }
}
