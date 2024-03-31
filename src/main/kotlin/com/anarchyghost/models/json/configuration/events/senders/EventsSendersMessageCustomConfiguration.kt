package com.anarchyghost.models.json.configuration.events.senders

import kotlinx.serialization.Serializable

@Serializable
data class EventsSendersMessageCustomConfiguration(
    val clazz: String,
)
