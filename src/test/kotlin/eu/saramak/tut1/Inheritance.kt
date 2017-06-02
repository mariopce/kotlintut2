package eu.saramak.tut1

import org.junit.Test

/**
 * Created by saramakm on 02/06/2017.
 */
class Inheritance {

    @Test
    fun `Person inherritance`() {
        val person = Person();
        val customer = Customer();
        println(person.validate() + " " + customer.validate())
        assert(customer.validate() != "cupep_val", {customer.validate()})
    }

    @Test
    fun `test abstract class`() {
        //val stored = StoredEntity();
        val stored = Employee()
    }

    @Test
    fun `test default implementation`() {
        val sql = SqlCustomerRepo();
        val result = sql.store();
        assert(result=="defaultnd", {result})
    }

    @Test
    fun `test default super implementation`() {
        val c = C();
        val result = c.a();
        assert(result=="Ba", {result})
    }








}
