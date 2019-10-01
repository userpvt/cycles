package com.valery.test.mappower

fun main() {

    allFruit()

}

private fun allFruit() {
    var fruit = mutableMapOf<String, Set<String>>()
    fruit["Red"] = mutableSetOf("Apple", "Cherry")
    fruit["Orange"] = mutableSetOf("Orange", "Apricot", "Peach", "Grapefruit")
    fruit["Yellow"] = mutableSetOf("Lemon", "Banana")
    fruit["Green"] = mutableSetOf("Pear")


    for ((color, fruits) in fruit) {
        println(" $color: $fruits")
    }

    println(fruit.get("Red"))
    println(fruit.get("Orange"))
    println(fruit.get("Yellow"))
    println(fruit.get("Green"))

}