package com.anarchyghost.models.domain.event

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Branch(
    @SerialName(value = "id") val id: Long? = null,
    @SerialName(value = "name") val name: String? = null,
    @SerialName(value = "description") val description: String? = null,
    @SerialName(value = "web_url") val webUrl: String? = null,
    @SerialName(value = "avatar_url") val avatarUrl: String? = null,
    @SerialName(value = "git_ssh_url") val gitSshUrl: String? = null,
    @SerialName(value = "git_http_url") val gitHttpUrl: String? = null,
    @SerialName(value = "namespace") val namespace: String? = null,
    @SerialName(value = "visibility_level") val visibilityLevel: Long? = null,
    @SerialName(value = "path_with_namespace") val pathWithNamespace: String? = null,
    @SerialName(value = "default_branch") val defaultBranch: String? = null,
    @SerialName(value = "ci_config_path") val ciConfigPath: String? = null,
    @SerialName(value = "homepage") val homepage: String? = null,
    @SerialName(value = "url") val url: String? = null,
    @SerialName(value = "ssh_url") val sshUrl: String? = null,
    @SerialName(value = "http_url") val httpUrl: String? = null,
)