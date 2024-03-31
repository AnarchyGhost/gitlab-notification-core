package com.anarchyghost.models.domain.message.discord

import com.anarchyghost.models.common.DiscordEmbedType
import kotlinx.serialization.Serializable

@Serializable
data class DiscordEmbed(
    val title: String?,
    val description: String?,
    val type: DiscordEmbedType,
    val url: String?,
)