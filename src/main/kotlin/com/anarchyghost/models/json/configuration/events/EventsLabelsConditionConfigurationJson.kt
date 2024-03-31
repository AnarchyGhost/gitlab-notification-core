package com.anarchyghost.models.json.configuration.events

import kotlinx.serialization.Serializable

@Serializable
data class EventsLabelsConditionConfigurationJson(
    val added: String? = null,
    val deleted: String? = null,
    val exists: String? = null,
)
