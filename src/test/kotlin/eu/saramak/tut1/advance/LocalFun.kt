package eu.saramak.tut1.advance

import com.sun.tools.corba.se.idl.constExpr.Not
import org.junit.Test

/**
 * Created by saramakm on 08/06/2017.
 */
class LocalFun : DescribeTest {

    @Test
    fun `Local function should have access to parent function`() {
        given("a local fun")
        whenn("local fun is call")
        val result = wrapperForLocalFun("Mario")
        then("access to all members, no access to localFun")
        result == "Mario Mariusz2 Mario Mariusz2 bee"
    }

    fun wrapperForLocalFun(str: String) : String {
        val name ="Mariusz2"
        fun localFun(inside: String) : String {
            return str + name + inside;
        }
        return str + name + localFun("bee");
    }
}



interface DescribeTest {
    infix fun LocalFun.given(message: String) {
        println(message)
    }
    infix fun LocalFun.whenn(message: String) {
        println(message)
    }
    infix fun LocalFun.then(message: String) {
        println(message)
    }
}
