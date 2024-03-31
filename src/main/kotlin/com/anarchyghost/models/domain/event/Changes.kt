package com.anarchyghost.models.domain.event

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Changes<T>(
    @SerialName("previous") val previous: T? = null,
    @SerialName("current") val current: T? = null,
)