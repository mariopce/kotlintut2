package eu.saramak.tut1

import kotlin.reflect.KFunction3

/**
 * Created by saramakm on 31/05/2017.
 */
open class Customer() {
    var name = "cu";
    open fun validate() : String{
        return name + "c_val"
    }
}

class Person : Customer  {
    override fun validate() : String{
        return name + "p_val"
    }

    constructor() : super() {
        name += "pe"
    }

}
