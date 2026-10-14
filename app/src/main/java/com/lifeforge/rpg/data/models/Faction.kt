package com.lifeforge.rpg.data.models

data class Faction(
    val id: Int,
    val name: String,
    val bonus: String,
    val monthlyGoal: String,
    val joined: Boolean = false
)
