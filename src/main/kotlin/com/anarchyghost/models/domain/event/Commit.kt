@file:UseSerializers(InstantSerializer::class)

package com.anarchyghost.models.domain.event

import com.anarchyghost.utils.InstantSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import java.time.Instant

@Serializable
data class Commit(
    @SerialName(value = "id") val id: String? = null,
    @SerialName(value = "message") val message: String? = null,
    @SerialName(value = "title") val title: String? = null,
    @SerialName(value = "timestamp") val timestamp: Instant? = null,
    @SerialName(value = "url") val url: String? = null,
    @SerialName(value = "author") val author: CommitAuthor? = null,
    @SerialName(value = "added") val added: List<String>? = null,
    @SerialName(value = "modified") val modified: List<String>? = null,
    @SerialName(value = "removed") val removed: List<String>? = null,
)