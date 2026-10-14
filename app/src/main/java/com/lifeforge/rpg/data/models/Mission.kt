package com.lifeforge.rpg.data.models

data class Mission(
    val id: Int,
    val name: String,
    val type: MissionType,
    val completed: Boolean = false,
    val xpReward: Int
)

enum class MissionType {
    DAILY,
    WEEKLY,
    SEASON
}
