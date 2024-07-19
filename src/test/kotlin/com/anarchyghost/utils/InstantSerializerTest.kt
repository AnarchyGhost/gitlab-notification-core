package com.anarchyghost.utils

import io.mockk.every
import io.mockk.mockk
import kotlinx.serialization.encoding.Decoder
import org.junit.jupiter.api.Test


class InstantSerializerTest {
    @Test
    fun `all date formats should be parsed without exception`() {
        listOf("2024-07-19 21:59:27 +0300").forEach {
        val decoder = mockk<Decoder>(relaxed = true)
        every { decoder.decodeString() } returns it
            InstantSerializer.deserialize(decoder)
        }
    }
}