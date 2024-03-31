package com.anarchyghost.models.json.configuration.events.senders

import kotlinx.serialization.Serializable

@Serializable
data class EventsSendersMessageTextConfiguration(
    val content: String,
)
