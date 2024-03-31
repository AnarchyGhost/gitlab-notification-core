package com.anarchyghost.models.domain.event

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Wiki(
    @SerialName(value = "web_url") val webUrl: String? = null,
    @SerialName(value = "git_ssh_url") val gitSshUrl: String? = null,
    @SerialName(value = "git_http_url") val gitHttpUrl: String? = null,
    @SerialName(value = "path_with_namespace") val pathWithNamespace: String? = null,
    @SerialName(value = "default_branch") val defaultBranch: String? = null,
)