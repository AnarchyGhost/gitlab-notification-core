package com.anarchyghost.models.json.configuration.users

import kotlinx.serialization.Serializable

@Serializable
data class UsersGitlabConfigurationJson(
    val id: Long,
    val username: String,
)
