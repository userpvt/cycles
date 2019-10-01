package com.valery.test.listpower

fun main() {

    checkHero("Titan","Frenzy")
    allSkill()
}

private fun checkHero(
    hero: String,
    pressSkill: String
) {
    println("$hero $pressSkill")
}

private fun allSkill(){
    val skills = listOf("Rage", "Zealot", "Frenzy", "Guts")
    for (skill in skills) {
        println(skill)
    }
}
