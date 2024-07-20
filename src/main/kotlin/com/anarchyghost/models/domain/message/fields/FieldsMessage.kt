package com.anarchyghost.models.domain.message.fields

import com.anarchyghost.models.domain.message.Message

class FieldsMessage(private val value: Map<String, String>): Message {
    operator fun get(key: String): String? = value[key]
}