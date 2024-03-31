package com.anarchyghost.models.json.configuration.events.senders

import kotlinx.serialization.Serializable

@Serializable
data class EventsSendersMessageDiscordEmbedsConfiguration(
    val type: String,
    val title: String? = null,
    val description: String? = null,
    val url: String? = null,
)
