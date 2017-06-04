package eu.saramak.tut1

import org.junit.Test

/**
 * Created by saramakm on 03/06/2017.
 */
class SmartCast{

    open class Person {

    }
    class Employee : Person() {
        fun vacationsDay(days:Int) : String{
            if (days<60){
                return "you need more vacation";
            }
            return "No vacation"
        }
    }

    class Contractor : Person() {

    }

    fun hasVacation(person: Person): String {
        if (person is Employee){
            return person.vacationsDay(30)
        }
        return ""
    }
    @Test
    fun `Smart cast`(){
        val emp = Employee()
        assert(hasVacation(emp)=="you need more vacation")
    }


    @Test(expected = ClassCastException::class)
    fun `Safe cast`(){
        val age :Any = 20;
        val str = age as String
        assert(str.length == 2)
    }

    @Test()
    fun `Safe cast str is null`(){
        val age :Any = 20;
        val str = age as? String
        assert(str?.length == null)
    }
}
