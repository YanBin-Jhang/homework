package com.kotlin

import java.util.*


fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val box3 = Box3()
    val box5 = Box5()

    print("Please enter object's length: ")
    val length = scanner.nextFloat()
    print("Please enter object's width: ")
    val width = scanner.nextFloat()
    print("Please enter object's height: ")
    val height = scanner.nextInt()

    if (box3.validate(length, width, height))
        println("Recommend: Box3")
    else if (box5.validate(length, width, height))
        println("Recommend: Box5")
    else
        println("No box available")
}


open class Box(var maxLength:Float, var maxWidth:Float, var maxHeight:Int) {
    fun validate(length: Float, width: Float, height: Int) = length <= maxLength && width <= maxWidth && height <= maxHeight
}

class Box3 : Box(23f, 14f,13)
class Box5 : Box(39.5f, 27.5f, 23)