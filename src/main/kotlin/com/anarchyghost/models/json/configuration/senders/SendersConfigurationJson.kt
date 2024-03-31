package com.anarchyghost.models.json.configuration.senders

import kotlinx.serialization.Serializable

@Serializable
data class SendersConfigurationJson(
    val id: String,
    val discord: SendersDiscordConfigurationJson? = null,
    val custom: SendersCustomConfigurationJson? = null,
)
