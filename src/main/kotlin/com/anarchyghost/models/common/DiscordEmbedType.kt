package com.anarchyghost.models.common

enum class DiscordEmbedType(val value: String) {
    RICH("rich"),
    LINK("link"),
    VIDEO("video");

    companion object {
        fun getByValue(value: String) = DiscordEmbedType.entries.find { it.value == value }
    }
}