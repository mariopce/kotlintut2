package eu.saramak.tut2

import org.junit.Test

/**
 * Created by saramakm on 14/06/2017.
 */

open class Result {
    class Success(val content: String) : Result()
    class Error(val code: Int, val message: String) : Result()
}

fun getPageByUrl(url: String): Result {
    if (url == "/") {
        return Result.Success("My page");
    } else {
        return Result.Error(404, "Not found")
    }
}

class SealedClassesTest {


    @Test
    fun `Should show error`() {
        val result = getPageByUrl("/index.html");
        var mess = ""
        when (result) {
            is Result.Success -> {
                println(result.content)
                mess = result.content;
            }
            is Result.Error -> {
                println("${result.code} : " + result.message)
                mess = result.message
            }
        }
        assert(mess == "Not found")
    }
}