package com.lifeforge.rpg.data.models

data class Item(
    val id: Int,
    val name: String,
    val type: ItemType,
    val effect: String,
    val consumable: Boolean
)

enum class ItemType {
    WEAPON,
    ARMOR,
    CONSUMABLE,
    ARTIFACT
}
