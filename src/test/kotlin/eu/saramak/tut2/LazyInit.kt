package eu.saramak.tut2

import eu.saramak.tut1.Customer
import eu.saramak.tut1.Repo
import org.junit.Test

/**
 * Created by saramakm on 13/06/2017.
 */

interface Repository{
    fun getAll(): List<Customer>

}

class CustomerController{
    lateinit var repository: Repository
    fun index(key :String){
        repository.getAll().size;
    }
}

class MyRepository : Repository {
    override fun getAll(): List<Customer> {
        return emptyList();
    }

}

class LazyInit{

    @Test
    fun `test lazy init`(){
        val customer = CustomerController();
        customer.repository = MyRepository()
        customer.index("k")
    }


    @Test(expected = UninitializedPropertyAccessException::class)
    fun `test no lazy init`(){
        val customer = CustomerController();
        customer.index("k")
    }
}
