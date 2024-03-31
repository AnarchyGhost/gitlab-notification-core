@file:UseSerializers(InstantSerializer::class)

package com.anarchyghost.models.domain.event

import com.anarchyghost.utils.InstantSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import java.time.Instant

@Serializable
data class Pipeline(
    @SerialName(value = "id") val id: Long? = null,
    @SerialName(value = "iid") val iid: Long? = null,
    @SerialName(value = "name") val name: String? = null,
    @SerialName(value = "ref") val ref: String? = null,
    @SerialName(value = "tag") val tag: Boolean? = null,
    @SerialName(value = "sha") val sha: String? = null,
    @SerialName(value = "before_sha") val beforeSha: String? = null,
    @SerialName(value = "source") val source: String? = null,
    @SerialName(value = "status") val status: String? = null,
    @SerialName(value = "detailed_status") val detailedStatus: String? = null,
    @SerialName(value = "stages") val stages: List<String>? = null,
    @SerialName(value = "created_at") val createdAt: Instant? = null,
    @SerialName(value = "finished_at") val finishedAt: Instant? = null,
    @SerialName(value = "duration") val duration: Double? = null,
    @SerialName(value = "queued_duration") val queuedDuration: Double? = null,
    @SerialName(value = "variables") val variables: List<String>? = null,
    @SerialName(value = "url") val url: String? = null,
)
