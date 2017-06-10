package eu.saramak.tut2

/**
 * Created by saramakm on 08/06/2017.
 */
class LocalFun : DescribeTest {

    @org.junit.Test
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



