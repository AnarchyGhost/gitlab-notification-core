@file:UseSerializers(InstantSerializer::class)

package com.anarchyghost.models.domain.event

import com.anarchyghost.utils.InstantSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import java.time.Instant

@Serializable
data class CommentObjectAttributes(
    @SerialName(value = "id") val id: Long? = null,
    @SerialName(value = "note") val note: String? = null,
    @SerialName(value = "type") val type: String? = null,
    @SerialName(value = "description") val description: String? = null,
    @SerialName(value = "noteable_type") val noteableType: String? = null,
    @SerialName(value = "author_id") val authorId: Long? = null,
    @SerialName(value = "change_position") val changePosition: String? = null,
    @SerialName(value = "created_at") val createdAt: Instant? = null,
    @SerialName(value = "discussion_id") val discussionId: String? = null,
    @SerialName(value = "updated_at") val updatedAt: Instant? = null,
    @SerialName(value = "updated_by_id") val updatedById: String? = null,
    @SerialName(value = "project_id") val projectId: Long? = null,
    @SerialName(value = "attachment") val attachment: String? = null,
    @SerialName(value = "line_code") val lineCode: String? = null,
    @SerialName(value = "commit_id") val commitId: String? = null,
    @SerialName(value = "noteable_id") val noteableId: Long? = null,
    @SerialName(value = "original_position") val originalPosition: Long? = null,
    @SerialName(value = "position") val position: Long? = null,
    @SerialName(value = "system") val system: Boolean? = null,
    @SerialName(value = "st_diff") val stDiff: StDiff? = null,
    @SerialName(value = "url") val url: String? = null,
    @SerialName(value = "resolved_at") val resolvedAt: Instant? = null,
    @SerialName(value = "resolved_by_id") val resolvedById: Long? = null,
    @SerialName(value = "resolved_by_push") val resolvedByPush: String? = null,
)