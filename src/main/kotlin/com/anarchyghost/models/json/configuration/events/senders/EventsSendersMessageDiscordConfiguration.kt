package com.anarchyghost.models.json.configuration.events.senders

import kotlinx.serialization.Serializable

@Serializable
data class EventsSendersMessageDiscordConfiguration(
    val content: String,
    val embeds: List<EventsSendersMessageDiscordEmbedsConfiguration> = listOf(),
)
