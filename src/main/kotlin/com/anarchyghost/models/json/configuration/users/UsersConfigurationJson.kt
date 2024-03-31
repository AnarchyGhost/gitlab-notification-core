package com.anarchyghost.models.json.configuration.users

import kotlinx.serialization.Serializable

@Serializable
data class UsersConfigurationJson(
    val gitlab: UsersGitlabConfigurationJson,
    val discord: UsersDiscordConfigurationJson? = null,
    val additional: Map<String, String> = mapOf(),
)
