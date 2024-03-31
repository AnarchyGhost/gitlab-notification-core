package com.anarchyghost.models.json.configuration.senders

import kotlinx.serialization.Serializable

@Serializable
data class SendersCustomConfigurationJson(
    val clazz: String,
)
