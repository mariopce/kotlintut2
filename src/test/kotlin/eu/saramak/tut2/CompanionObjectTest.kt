package eu.saramak.tut2

import org.junit.Test
import java.io.File

/**
 * Created by saramakm on 13/06/2017.
 */

class Log private constructor(){
    var name = "";
    companion object Factory {
        @JvmStatic
        fun createFileLog(name: String) : Log{
            return Log(name);
        }
    }
    constructor(name : String):this() {
        this.name = name;
    }
}

class CompanionObjectTest{
    @Test
    fun `use companion objject`(){
        val file :Log= Log.createFileLog("a.txt")
        assert(file.name=="a.txt", {file.name})
    }
}