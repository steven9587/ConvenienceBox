package com.kotlin

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Please enter object's length:")
    val length = scanner.nextFloat()
    print("Please enter object's width:")
    val width = scanner.nextFloat()
    print("Please enter object's height:")
    val height = scanner.nextFloat()
    val box3 = Box3()
    val box5 = Box5()
    if (box3.validate(length, width, height)) {
        println("Box3")
    } else {
        if (box5.validate(length, width, height)) {
            println("Box5")
        } else {
            println("兩者都不符合!")
        }
    }
}

open class Box() {
    var length: Float = 0.0f
    var width: Float = 0.0f
    var height: Float = 0.0f
    open fun validate(length: Float, width: Float, height: Float) =
        if (length <= this.length && width <= this.width && height <= this.height) {
            true
        } else {
            false
        }
}


class Box3 : Box() {
    init {
        length = 23f
        width = 14f
        height = 13f
    }
}

class Box5 : Box() {
    init {
        length = 39.5f
        width = 27.5f
        height = 23f
    }
}