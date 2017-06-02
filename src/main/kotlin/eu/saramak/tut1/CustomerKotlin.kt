package eu.saramak.tut1

import java.io.IOException

/**
 * Created by saramakm on 01/06/2017.
 */
data class CustomerKotlin(var id: Int, var name:String, var email: String){
    @JvmField var someProperty:String ="value"

    @JvmName("change") @JvmOverloads fun changeStatus(status: Status = Status.Current): Status {
        return status;
    }

    @Throws(IOException::class) fun load(){
        throw IOException("ex");
    }

}

enum class Status {
    Current,
    Pass
}
