package com.lifeforge.rpg.data.models

data class SkillNode(
    val id: Int,
    val name: String,
    val branch: SkillBranch,
    val unlocked: Boolean = false,
    val bonus: String
)

enum class SkillBranch {
    MORNING,
    AFTERNOON,
    NIGHT,
    GROWTH
}
