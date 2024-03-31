package com.anarchyghost.models.domain.message.discord

import com.anarchyghost.models.domain.message.Message
import kotlinx.serialization.Serializable

@Serializable
data class DiscordMessage(
    val content: String,
    val embeds: List<DiscordEmbed>,
): Message
