package com.anarchyghost.models.domain.event

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StDiff(
    @SerialName(value = "diff") val diff: String? = null,
    @SerialName(value = "new_path") val newPath: String? = null,
    @SerialName(value = "old_path") val oldPath: String? = null,
    @SerialName(value = "a_mode") val aMode: String? = null,
    @SerialName(value = "b_mode") val bMode: String? = null,
    @SerialName(value = "new_file") val newFile: Boolean? = null,
    @SerialName(value = "renamed_file") val renamedFile: Boolean? = null,
    @SerialName(value = "deleted_file") val deletedFile: Boolean? = null,
)