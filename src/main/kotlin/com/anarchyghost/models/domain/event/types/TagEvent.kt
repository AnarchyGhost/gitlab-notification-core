@file:UseSerializers(InstantSerializer::class)

package com.anarchyghost.models.domain.event.types

import com.anarchyghost.models.domain.event.Commit
import com.anarchyghost.models.domain.event.Project
import com.anarchyghost.models.domain.event.Repository
import com.anarchyghost.utils.InstantSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import kotlinx.serialization.json.JsonElement

@Serializable
data class TagEvent(
    @SerialName(value = "object_kind") val objectKind: String? = null,
    @SerialName(value = "event_name") val eventName: String? = null,
    @SerialName(value = "before") val before: String? = null,
    @SerialName(value = "after") val after: String? = null,
    @SerialName(value = "ref") val ref: String? = null,
    @SerialName(value = "ref_protected") val refProtected: Boolean? = null,
    @SerialName(value = "checkout_sha") val checkoutSha: String? = null,
    @SerialName(value = "message") val message: String? = null,
    @SerialName(value = "user_id") val userId: Long? = null,
    @SerialName(value = "user_name") val userName: String? = null,
    @SerialName(value = "user_username") val userUsername: String? = null,
    @SerialName(value = "user_email") val userEmail: String? = null,
    @SerialName(value = "user_avatar") val userAvatar: String? = null,
    @SerialName(value = "project_id") val projectId: Long? = null,
    @SerialName(value = "project") val project: Project? = null,
    @SerialName(value = "repository") val repository: Repository? = null,
    @SerialName(value = "commits") val commits: List<Commit>? = null,
    @SerialName(value = "total_commits_count") val totalCommitsCount: Int? = null,
    @SerialName(value = "push_options") val pushOptions: JsonElement? = null,
) : BaseEvent
