package com.anarchyghost.processing.event.listener

import com.anarchyghost.models.domain.GitlabEvent

interface EventListener {
    suspend fun processEvent(event: GitlabEvent<*>)
}