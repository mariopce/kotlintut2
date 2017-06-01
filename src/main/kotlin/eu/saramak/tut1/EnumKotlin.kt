package eu.saramak.tut1

/**
 * Created by saramakm on 01/06/2017.
 */
enum class EnumKotlin {
    NORMAL {
        override fun test() {
            print("nor")
        }
    },
    PRIOR {
        override fun test() {
            print("pri")
        }
    };
    abstract fun test();
}