package com.anarchyghost.models.json.configuration.events

import com.anarchyghost.models.common.EventType
import com.anarchyghost.models.json.configuration.events.senders.EventsSendersConfiguration
import kotlinx.serialization.Serializable

@Serializable
data class EventsConfigurationJson(
    val type: EventType,
    val projectIds: List<String>? = null,
    val groupIds: List<String>? = null,
    val senders: List<EventsSendersConfiguration>,
    val condition: EventsConditionConfigurationJson,
)
