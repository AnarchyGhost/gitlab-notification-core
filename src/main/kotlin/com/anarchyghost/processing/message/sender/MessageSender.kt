package com.anarchyghost.processing.message.sender

import com.anarchyghost.models.domain.message.Message

interface MessageSender {
    suspend fun send(message: Message)
}