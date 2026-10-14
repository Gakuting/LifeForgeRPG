package com.lifeforge.rpg.data.models

data class PlayerClass(
    val id: Int,
    val name: String,
    val bonus: String,
    val specialMissions: List<String>
)
