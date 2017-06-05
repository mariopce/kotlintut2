package eu.saramak.tut1

import org.junit.Test

/**
 * Created by saramakm on 04/06/2017.
 */


class HigherFunction{
    @Test
    fun `higher function inside fun`(){
        val result = operation(2, 2, HigherFunction::add);
        assert(result==4)

    }
    fun main(args: Array<String>){
        operation(2, 2, HigherFunction::add);
    }



    fun operation(x: Int,y:Int, op: (Int, Int) -> Int): Int {
        return op(x, y)
    }

    object HigherFunction{
        fun add(x:Int, y:Int) = x+y
    }

    @Test
    fun `lambda function inside fun`(){
        val result = unitaryOperation(2, {it * it});
        assert(result==4)

    }
    @Test
    fun `lambda function inside fun 2`(){
        val result = unitaryOperation(2)  {
            it + it
        }
        assert(result==4)

    }
    @Test
    fun `lambda function tran 2`(){
        val db = Database();
        val result = transaction(db)  {
            print("d")
        }
        assert(result is Unit)

    }

    private fun  unitaryOperation(i: Int, op: (Int) -> Int): Int {
        return op(i);
    }

    class Database(){
        fun commit(){}
    }

    fun transaction(db: Database,code : () -> Unit){
        try{
            db.commit()
        }catch (e:Throwable){
            println(e)
        }
        finally {
            db.commit()
        }
    }

}
