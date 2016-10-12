package com.vcoolwind.kotlin

import kotlin.properties.Delegates

/**
 * Created by BlackStone on 2016/10/11.
 */

class DelegateSample(val map: Map<String, Any?>) {

    val lazy: String by lazy {
        println("action by lazy")
        "lazy value"
    }

    var observ: String by Delegates.observable("[no value]") {
        d, new, old ->
        println("$new --> $old")
    }

    var addr: String by Delegates.notNull()

    val name: String by map;
    val age: Int by map;

    fun initAddr(addr: String) {
        this.addr = addr
    }
}


fun getNull(v: String): String {
    return v
}

fun main(args: Array<String>) {
    var d = DelegateSample(mapOf("name" to "zhangsan", "age" to 13))
    println("d.lazy = ${d.lazy}")
    d.observ = "chang1"
    d.observ = "chang2"
    try {
        println("d.addr = ${d.addr}")
    } catch (e: Exception) {
        e.printStackTrace()
    }
    d.initAddr("shenzhen")
    println("d.addr = ${d.addr}")



    println("d.name = ${d.name}")
    println("d.age = ${d.age}")

//    var d2=DelegateSample()
//
//    println("d2.lazy = ${d2.lazy}")
//    println("d2.lazy = ${d2.lazy}")
//
//    d2.observ="chang1"
//    d2.observ="chang2"


}

