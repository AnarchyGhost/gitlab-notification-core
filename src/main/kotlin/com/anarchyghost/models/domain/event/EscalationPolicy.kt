package com.anarchyghost.models.domain.event

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class EscalationPolicy(
    @SerialName("id") val id: Long? = null,
    @SerialName("name") val name: String? = null,
)
