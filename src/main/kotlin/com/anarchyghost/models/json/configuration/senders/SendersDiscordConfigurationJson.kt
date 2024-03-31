package com.anarchyghost.models.json.configuration.senders

import kotlinx.serialization.Serializable

@Serializable
data class SendersDiscordConfigurationJson(
    val link: String,
)
