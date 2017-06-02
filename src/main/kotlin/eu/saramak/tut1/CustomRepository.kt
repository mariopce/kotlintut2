package eu.saramak.tut1

/**
 * Created by saramakm on 02/06/2017.
 */
interface CustomerRepository {

    val isEmpty : Boolean
        get() = true //U can have getters and setters.


    fun store() : String { // you can override default impl.
        println("default interface implementation")
        return "default";
    }
    fun getCusById(id:Int):Customer
}

interface EmployeeRepository {
    fun store() : String {
        return "emp"
    }
    fun getCusById(id:Int):Employee
}

interface Repository<T>{
    fun getCusById(id:Int):T
    fun getAll() : List<T>
}

interface Repo {
    fun <T> getCusById(id:Int):T
    fun <R> getAll() : List<R>
}

class MyRepo : Repo{
    override fun <T> getCusById(id: Int): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <R> getAll(): List<R> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
class GenericRepo<T> : Repository<T>{
    override fun getCusById(id: Int): T {

    }

    override fun getAll(): List<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

class SqlCustomerRepo : CustomerRepository {
    override fun store(): String {
        println("not default interface implementation")
        return super.store() + "nd"
    }
    override fun getCusById(id: Int): Customer {
        return Customer();
    }

}


interface A {
    fun a() : String{
        return "Aa"
    }
}

interface B {
    fun a() :String{
        return "Ba"
    }
}

class C : A, B{
    override fun a() : String{
        return super<B>.a()
    }
}

