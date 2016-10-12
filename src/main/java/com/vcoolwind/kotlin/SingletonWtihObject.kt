package com.vcoolwind.kotlin

/**
 * Created by BlackStone on 2016/10/12.
 */
object  SingletonWtihObject {
    var info="[INFO]"
    var warn="[WARN]"
    var err="[ERROR"

    fun info(msg: String) {
        println("${info} syslog:$msg")
    }
    fun warn(msg: String) {
        println("${warn} syslog:$msg")
    }
    fun err(msg: String) {
        println("${err} syslog:$msg")
    }
}


fun main(args: Array<String>) {
    SingletonWtihObject.info("log info sth")
    SingletonWtihObject.warn("warn info sth")
    SingletonWtihObject.err("error info sth")

    // var single = SingletonWtihObject() //will throws errors


}