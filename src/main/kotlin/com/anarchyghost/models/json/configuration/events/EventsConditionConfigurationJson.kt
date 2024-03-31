package com.anarchyghost.models.json.configuration.events

import kotlinx.serialization.Serializable

@Serializable
data class EventsConditionConfigurationJson(
    val text: String? = null,
    val labels: EventsLabelsConditionConfigurationJson? = null,
    val or: List<EventsConditionConfigurationJson>? = null,
    val and: List<EventsConditionConfigurationJson>? = null,
    val not: EventsConditionConfigurationJson? = null,
    val custom: EventsLabelsCustomConfigurationJson? = null,
)
