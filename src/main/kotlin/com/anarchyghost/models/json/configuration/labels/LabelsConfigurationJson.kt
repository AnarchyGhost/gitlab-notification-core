package com.anarchyghost.models.json.configuration.labels

import kotlinx.serialization.Serializable

@Serializable
data class LabelsConfigurationJson(
    val gitlab: LabelsGitlabConfigurationJson,
    val discord: LabelsDiscordConfigurationJson = LabelsDiscordConfigurationJson(
        listOf()
    ),
    val additional: Map<String, String> = mapOf(),
)
