package eu.saramak.tut1

import org.junit.Test as Specification

/**
 * Created by saramakm on 04/06/2017.
 */
class Exceptions {

    @Specification(expected = NotANumberException::class)
    fun `test exceptions`() {
        checkIsNumber(3)
        try {
            checkIsNumber("4")
        }catch (e: NotANumberException){
            println("${e.message}")
        }
        checkIsNumber("3")
    }

    @Specification
    fun `test exceptions returns result`() {
        checkIsNumber(3)
        val result = try {
            checkIsNumber("4")
            -4
        }catch (e: NotANumberException){
            println("${e.message}")
            -1
        }finally {
            -2
        }
        assert(result==-1, {result})
    }

    fun checkIsNumber(obj: Any){
        when(obj){
            !is Int, Long, Double, Short, Float -> throw NotANumberException("$obj is not a number")
        }
    }

    class NotANumberException:Throwable{
        constructor(msg: String) : super(msg)
        constructor():super()
    }
}