package com.anarchyghost.models.domain.event

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CommitAuthor(
    @SerialName(value = "name") val name: String? = null,
    @SerialName(value = "email") val email: String? = null,
)
