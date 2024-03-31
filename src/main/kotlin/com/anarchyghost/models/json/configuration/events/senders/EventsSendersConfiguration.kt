package com.anarchyghost.models.json.configuration.events.senders

import kotlinx.serialization.Serializable

@Serializable
data class EventsSendersConfiguration(
    val id: String,
    val message: EventsSendersMessageConfiguration,
)
