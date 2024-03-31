package com.anarchyghost.models.json.configuration.labels

import kotlinx.serialization.Serializable

@Serializable
data class LabelsDiscordConfigurationJson(
    val ids: List<String>
)
