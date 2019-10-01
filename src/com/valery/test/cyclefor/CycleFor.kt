package com.valery.test.cyclefor

fun main() {

    allFruit()
    testNumber()
}

private fun allFruit() {
    val fruits = listOf("Apple", "Orange", "Cherry", "Banana", "Grapefruit", "Peach", "Pear", "Apricot", "Lemon")
    for (fruit in fruits) {
        println(fruit)
    }
}

private fun testNumber() {
    for (i in 0..9) {
        println(i)
    }
}


