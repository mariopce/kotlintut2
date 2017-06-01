package eu.saramak.tut1

import org.junit.Test

/**
 * Created by saramakm on 31/05/2017.
 */
class ClassesTest {


    @Test
    fun `Test first class`() {
        val customer = Customer()
        assert(customer is Customer)
    }

    @Test
    fun `Test first class with var`() {
        val customer = Customer2()
        customer.id=2
        customer.name="Mario"
        assert(customer is Customer2)
        assert(customer.id==2)
    }

    @Test
    fun `Test first class with var and vals`() {
        val customer = CustomerNoInit("Mariusz", "M")
        customer.id=2
        customer.name="Mario"
        //customer.sex="M"
        assert(customer is CustomerNoInit)
        assert(customer.name=="Mario")
    }

    @Test
    fun `Test first class with init block`() {
        val customer = CustomerInit("Mariusz", "M")
        customer.id++
        assert(customer is CustomerInit)
        assert(customer.id==2)
        assert(customer.name=="MARIUSZ")
    }

    @Test
    fun `Test first class with 2constructor`() {
        val customer = Customer2ndCons("mariopce@gmail.com")
        customer.id++
        assert(customer is Customer2ndCons)
        assert(customer.id==2)
        assert(customer.name=="mario", {"name is ${customer.name}"})
    }

    @Test
    fun `Test with params`() {
        val customer = CustomerAge(1985)

        assert(customer is CustomerAge)
        assert(customer.age==32)
    }

    @Test(expected = IllegalAccessError::class)
    fun `Test with setters`() {
        val customer = CustomerAge(1985)
        customer.socialSecurityNumber="232"
        assert(customer is CustomerAge)
    }

    @Test()
    fun `Test with setters `() {
        val customer = CustomerAge(1985)
        customer.socialSecurityNumber="SN232"
        assert(customer.socialSecurityNumber == "SN232")
    }

    @Test()
    fun `Test with custom toString `() {
        val customer = CustomerAge(1985)
        customer.socialSecurityNumber="SN232"
        assert(customer.customerAsString() == "age 32 year 1985", {customer.customerAsString()})
    }


    @Test()
    fun `Test with data customer `() {
        val customer = CustomerKotlin(1, "Mariusz", "mariopce@gmail.com") //data class
        assert(customer.toString() == "CustomerKotlin(id=1, name=Mariusz, email=mariopce@gmail.com)", {customer.toString()})
    }



}


