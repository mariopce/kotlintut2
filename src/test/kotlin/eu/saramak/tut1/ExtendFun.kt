package eu.saramak.tut1

import org.junit.Test

/**
 * Created by saramakm on 04/06/2017.
 */
fun String.hello(): String {
    return this.toUpperCase() + " Hello!!"
}

class ExtendFun {
    @Test
    fun extendFun(){
        val res = "Are".hello()
        assert(res=="ARE Hello!!", {res})
    }
    @Test
    fun `extend inherit Fun`(){
        val res : BaseClass =  InheritClass();
        assert(res.printMe() == "Base")
    }
    @Test
    fun `extend inherit Fun2`(){
        val res =  InheritClass();
        assert(res.printMe() == "InheritClass")
    }
}



open class BaseClass {

}
class InheritClass : BaseClass(){

}
fun BaseClass.printMe():String{
    return "Base"
}
fun InheritClass.printMe():String{
    return "InheritClass"
}