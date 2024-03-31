@file:UseSerializers(InstantSerializer::class)

package com.anarchyghost.models.domain.event.types

import com.anarchyghost.models.domain.event.Project
import com.anarchyghost.models.domain.event.User
import com.anarchyghost.models.domain.event.Wiki
import com.anarchyghost.models.domain.event.WikiPage
import com.anarchyghost.utils.InstantSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
data class WikiPageEvent(
    @SerialName(value = "object_kind") val objectKind: String? = null,
    @SerialName(value = "event_type") val eventType: String? = null,
    @SerialName(value = "user") val user: User? = null,
    @SerialName(value = "project") val project: Project? = null,
    @SerialName(value = "object_attributes") val objectAttributes: WikiPage? = null,
    @SerialName(value = "wiki") val wiki: Wiki? = null,
) : BaseEvent




