package com.lifeforge.rpg.data.models

data class Enemy(
    val id: Int,
    val name: String,
    val effect: String,
    val weakness: String,
    val defeated: Boolean = false
)
