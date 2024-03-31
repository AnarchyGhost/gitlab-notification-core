package com.anarchyghost.processing.message.generator

import com.anarchyghost.models.domain.GitlabEvent
import com.anarchyghost.models.domain.message.Message

interface MessageGenerator {
    suspend fun generate(event: GitlabEvent<*>): Message
}