package com.lifeforge.rpg.data.models

data class Boss(
    val id: Int,
    val name: String,
    val conditions: List<String>,
    val xpReward: Int,
    val defeated: Boolean = false
)
