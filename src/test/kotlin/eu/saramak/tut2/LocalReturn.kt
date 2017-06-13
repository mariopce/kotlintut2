package eu.saramak.tut2

import org.junit.Test

/**
 * Created by saramakm on 13/06/2017.
 */
class LocalReturn {


    public fun <T> Iterable<T>.myForEach(action: (T) -> Unit): Unit {
        for (element in this) action(element)
    }

    fun containingFunction() : String {
        val numbers = 1..100
        numbers.forEach({
            if (it % 5 == 0){
                return "${it}"
            }
        })
        return "Hello"
    }

    fun containingFunctionReturnLocal() : String {
        val numbers = 1..100
        numbers.forEach local@{
            if (it % 5 == 0){
                return@local
            }
        }
        return "Hello"
    }

    fun containingFunctionReturnLocalMy() {
        val numbers = 1..100
        numbers.myForEach {
            if (it % 5 == 0){
                return@myForEach //because myForEach is not inline only local return is possible.
            }
        }
        return
    }

    fun containingFunctionReturnFromAnonymous() :String {
        val numbers = 1..100
        numbers.myForEach (fun(e){
            if (e == 2){
                return;
            }
        })
        return "Hello!"
    }

    @Test
    fun `Should return no local`() {
        val result = containingFunction();
        assert(result=="5", {result})
    }

    @Test
    fun `Should return local`() {
        val result = containingFunctionReturnLocal();
        assert(result=="Hello", {result})
    }
    @Test
    fun `Should retur local from anonymous`() {
        val result = containingFunctionReturnFromAnonymous();
        assert(result=="Hello!", {result})
    }

}