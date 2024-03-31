package com.anarchyghost.models.json.configuration.events.senders

import kotlinx.serialization.Serializable

@Serializable
data class EventsSendersMessageConfiguration(
    val custom: EventsSendersMessageCustomConfiguration? = null,
    val discord: EventsSendersMessageDiscordConfiguration? = null,
    val text: EventsSendersMessageTextConfiguration? = null,
)
