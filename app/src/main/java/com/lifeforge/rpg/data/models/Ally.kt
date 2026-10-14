package com.lifeforge.rpg.data.models

data class Ally(
    val id: Int,
    val name: String,
    val passiveBonus: String,
    val activeBonus: String,
    val unlocked: Boolean = false
)
