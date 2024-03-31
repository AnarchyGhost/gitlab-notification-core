package com.anarchyghost.models.domain.event

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Runner(
    @SerialName(value = "id") val id: Long? = null,
    @SerialName(value = "description") val description: String? = null,
    @SerialName(value = "runner_type") val runnerType: String? = null,
    @SerialName(value = "active") val active: Boolean? = null,
    @SerialName(value = "is_shared") val isShared: Boolean? = null,
    @SerialName(value = "tags") val tags: List<String>? = null,
)
