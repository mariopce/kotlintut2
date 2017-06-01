package eu.saramak.tut1

import java.util.*

/**
 * Created by saramakm on 31/05/2017.
 */
class CustomerAge(val yearOfBorn: Int) {
    val age : Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBorn

    var socialSecurityNumber : String = ""
        set(sn) {
            if (!sn.startsWith("SN"))
            {
                throw IllegalAccessError("No security number")
            }else{
                field=sn
            }
        }

    fun customerAsString(): String {
        return "age $age year $yearOfBorn";
    }
}