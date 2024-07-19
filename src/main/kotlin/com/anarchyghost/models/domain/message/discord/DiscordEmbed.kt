@file:UseSerializers(DiscordEmbedTypeSerializer::class)
package com.anarchyghost.models.domain.message.discord

import com.anarchyghost.models.common.DiscordEmbedType
import com.anarchyghost.utils.DiscordEmbedTypeSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
data class DiscordEmbed(
    val title: String?,
    val description: String?,
    val type: DiscordEmbedType,
    val url: String?,
)