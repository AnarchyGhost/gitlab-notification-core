package com.anarchyghost.utils

import com.anarchyghost.models.common.DiscordEmbedType
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

object DiscordEmbedTypeSerializer : KSerializer<DiscordEmbedType> {
    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("com.anarchyghost.models.common.DiscordEmbedType", PrimitiveKind.STRING)
    override fun serialize(encoder: Encoder, value: DiscordEmbedType) = encoder.encodeString(value.value)
    override fun deserialize(decoder: Decoder): DiscordEmbedType {
        val string = decoder.decodeString()
        return DiscordEmbedType.getByValue(string)!!
    }
}