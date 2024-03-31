package com.anarchyghost.models.domain.message.text

import com.anarchyghost.models.domain.message.Message
import kotlinx.serialization.Serializable

@Serializable
data class TextMessage(
    val content: String,
): Message
