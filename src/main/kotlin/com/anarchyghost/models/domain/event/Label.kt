@file:UseSerializers(InstantSerializer::class)

package com.anarchyghost.models.domain.event

import com.anarchyghost.utils.InstantSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import java.time.Instant

@Serializable
data class Label(
    @SerialName("id") val id: Long? = null,
    @SerialName("title") val title: String? = null,
    @SerialName("color") val color: String? = null,
    @SerialName("project_id") val projectId: Long? = null,
    @SerialName("created_at") val createdAt: Instant? = null,
    @SerialName("updated_at") val updatedAt: Instant? = null,
    @SerialName("template") val template: Boolean? = null,
    @SerialName("description") val description: String? = null,
    @SerialName("type") val type: String? = null,
    @SerialName("group_id") val groupId: Long? = null,
    @SerialName("lock_on_merge") val lockOnMerge: Boolean? = null,
)