package com.anarchyghost.models.domain.event

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WikiPage(
    @SerialName(value = "content") val content: String? = null,
    @SerialName(value = "format") val format: String? = null,
    @SerialName(value = "message") val message: String? = null,
    @SerialName(value = "title") val title: String? = null,
    @SerialName(value = "slug") val slug: String? = null,
    @SerialName(value = "url") val url: String? = null,
    @SerialName(value = "action") val action: String? = null,
    @SerialName(value = "diff_url") val diffUrl: String? = null,
)