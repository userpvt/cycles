package com.valery.test.cyclewhile
//перебираю массив объектов String , прохожусь циклом по здоровью:)
fun main() {

    fruitName()
    hpCount()
}

private fun fruitName() {
    val names = arrayOf("Apple", "Orange", "Peach", "Cherry")
    var i = names.size

    while(i>0) {
        println(names[--i])
    }
}

private fun hpCount() {
    var hp = 1990
    while (hp < 2000) {
        println(hp)
        hp++
    }
}
