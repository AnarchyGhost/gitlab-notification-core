@file:UseSerializers(InstantSerializer::class)

package com.anarchyghost.models.domain.event.types

import com.anarchyghost.models.domain.event.*
import com.anarchyghost.utils.InstantSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
data class CommentEvent(
    @SerialName(value = "object_kind") val objectKind: String? = null,
    @SerialName(value = "event_type") val eventType: String? = null,
    @SerialName(value = "event_name") val eventName: String? = null,
    @SerialName(value = "user") val user: User? = null,
    @SerialName(value = "project_id") val projectId: Long? = null,
    @SerialName(value = "project") val project: Project? = null,
    @SerialName(value = "repository") val repository: Repository? = null,
    @SerialName(value = "merge_request") val mergeRequest: MergeRequest? = null,
    @SerialName(value = "object_attributes") val objectAttributes: CommentObjectAttributes? = null,
    @SerialName(value = "commit") val commit: Commit? = null,
) : BaseEvent
