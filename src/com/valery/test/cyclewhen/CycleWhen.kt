package com.valery.test.cyclewhen

fun main() {


    println(pressSkill(5000))
    println(pressSkill(4000))
    println(pressSkill(3000))
    println(pressSkill(2000))
    println(pressSkill(1000))
    println(pressSkill(500))
    println(pressSkill(300))
    println(pressSkill(0))
}

private fun pressSkill(hp: Int) =
    when (hp) {
        5000 -> "bro,it's ok"
        in 4000 .. 4999 -> "just wait"
        in 3000 .. 3999 -> "wait wait"
        in 2000 .. 2999 -> "get ready , a little more"
        in 1000 .. 1999 -> "press the button"
        in 500 .. 999 -> if( hp <= 999) {
            "press auto-click"
        } else {
            "there is a chance to die"
        }
        in 1 .. 499 -> "hope for a critical strike"
        else -> "don't tilt"


    }
