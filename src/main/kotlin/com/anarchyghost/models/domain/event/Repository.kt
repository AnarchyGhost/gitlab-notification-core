package com.anarchyghost.models.domain.event

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Repository(
    @SerialName(value = "name") val name: String? = null,
    @SerialName(value = "url") val url: String? = null,
    @SerialName(value = "description") val description: String? = null,
    @SerialName(value = "homepage") val homepage: String? = null,
    @SerialName(value = "git_http_url") val gitHttpUrl: String? = null,
    @SerialName(value = "git_ssh_url") val gitSshUrl: String? = null,
    @SerialName(value = "visibility_level") val visibilityLevel: Int? = null,
)
