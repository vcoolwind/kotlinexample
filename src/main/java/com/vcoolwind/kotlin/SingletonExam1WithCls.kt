package com.vcoolwind.kotlin

/**
 * Created by BlackStone on 2016/10/12.
 * 通过private constructor()设置类不能被初始化
 */
class SingletonExam1 private constructor() {
    companion object {
        fun info(msg: String) {
            println("[INFO] syslog:$msg")
        }

        fun warn(msg: String) {
            println("[WARN] syslog:$msg")
        }

        fun err(msg: String) {
            println("[ERROR] syslog:$msg")
        }
    }
}

fun main(args: Array<String>) {
    SingletonExam1.info("log info sth")
    SingletonExam1.warn("warn info sth")
    SingletonExam1.err("error info sth")

    // var single = SingletonExam1() //will throw errors
}