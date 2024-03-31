package com.anarchyghost.models.json.configuration

import com.anarchyghost.models.json.configuration.events.EventsConfigurationJson
import com.anarchyghost.models.json.configuration.labels.LabelsConfigurationJson
import com.anarchyghost.models.json.configuration.senders.SendersConfigurationJson
import com.anarchyghost.models.json.configuration.users.UsersConfigurationJson
import kotlinx.serialization.Serializable

@Serializable
data class ConfigurationJson(
    val plugins: List<String> = listOf(),
    val users: List<UsersConfigurationJson> = listOf(),
    val labels: List<LabelsConfigurationJson> = listOf(),
    val senders: List<SendersConfigurationJson>,
    val events: List<EventsConfigurationJson>,
)
