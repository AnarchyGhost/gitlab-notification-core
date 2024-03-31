@file:UseSerializers(InstantSerializer::class)

package com.anarchyghost.models.domain.event.types

import com.anarchyghost.models.domain.event.Commit
import com.anarchyghost.models.domain.event.Project
import com.anarchyghost.models.domain.event.Repository
import com.anarchyghost.models.domain.event.Runner
import com.anarchyghost.utils.InstantSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import java.time.Instant

@Serializable
data class JobEvent(
    @SerialName(value = "object_kind") val objectKind: String? = null,
    @SerialName(value = "ref") val ref: String? = null,
    @SerialName(value = "tag") val tag: Boolean? = null,
    @SerialName(value = "before_sha") val beforeSha: String? = null,
    @SerialName(value = "sha") val sha: String? = null,
    @SerialName(value = "retries_count") val retriesCount: Int? = null,
    @SerialName(value = "build_id") val buildId: Long? = null,
    @SerialName(value = "build_name") val buildName: String? = null,
    @SerialName(value = "build_stage") val buildStage: String? = null,
    @SerialName(value = "build_status") val buildStatus: String? = null,
    @SerialName(value = "build_created_at") val buildCreatedAt: Instant? = null,
    @SerialName(value = "build_started_at") val buildStartedAt: Instant? = null,
    @SerialName(value = "build_finished_at") val buildFinishedAt: Instant? = null,
    @SerialName(value = "build_duration") val buildDuration: Double? = null,
    @SerialName(value = "build_queued_duration") val buildQueuedDuration: Double? = null,
    @SerialName(value = "build_allow_failure") val buildAllowFailure: Boolean? = null,
    @SerialName(value = "build_failure_reason") val buildFailureReason: String? = null,
    @SerialName(value = "pipeline_id") val pipelineId: Long? = null,
    @SerialName(value = "runner") val runner: Runner? = null,
    @SerialName(value = "project_id") val projectId: Long? = null,
    @SerialName(value = "project_name") val projectName: String? = null,
    @SerialName(value = "project") val project: Project? = null,
    @SerialName(value = "repository") val repository: Repository? = null,
    @SerialName(value = "commit") val commit: Commit? = null,
    @SerialName(value = "environment") val environment: String? = null,
) : BaseEvent