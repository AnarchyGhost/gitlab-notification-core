@file:UseSerializers(InstantSerializer::class)

package com.anarchyghost.models.domain.event.types

import com.anarchyghost.models.domain.event.*
import com.anarchyghost.utils.InstantSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
data class PipelineEvent(
    @SerialName(value = "object_kind") val objectKind: String? = null,
    @SerialName(value = "object_attributes") val objectAttributes: Pipeline? = null,
    //TODO mb MergeRequestShorten
    @SerialName(value = "merge_request") val mergeRequest: MergeRequest? = null,
    @SerialName(value = "user") val user: User? = null,
    @SerialName(value = "project") val project: Project? = null,
    @SerialName(value = "commit") val commit: Commit? = null,
    @SerialName(value = "builds") val builds: List<String>? = null,
) : BaseEvent