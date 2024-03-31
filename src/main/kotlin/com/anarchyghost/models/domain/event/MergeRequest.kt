@file:UseSerializers(InstantSerializer::class)

package com.anarchyghost.models.domain.event

import com.anarchyghost.utils.InstantSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

import java.time.Instant

@Serializable
data class MergeRequest(
    @SerialName(value = "assignee_id") val assigneeId: Long? = null,
    @SerialName(value = "author_id") val authorId: Long? = null,
    @SerialName(value = "created_at") val createdAt: Instant? = null,
    @SerialName(value = "description") val description: String? = null,
    @SerialName(value = "draft") val draft: Boolean? = null,
    @SerialName(value = "head_pipeline_id") val headPipelineId: Long? = null,
    @SerialName(value = "id") val id: Long? = null,
    @SerialName(value = "iid") val iid: Long? = null,
    @SerialName(value = "last_edited_at") val lastEditedAt: Instant? = null,
    @SerialName(value = "last_edited_by_id") val lastEditedById: Long? = null,
    @SerialName(value = "merge_commit_sha") val mergeCommitSha: String? = null,
    @SerialName(value = "merge_error") val mergeError: String? = null,
    @SerialName(value = "merge_params") val mergeParams: Map<String, String>? = null,
    @SerialName(value = "merge_status") val mergeStatus: String? = null,
    @SerialName(value = "merge_user_id") val mergeUserId: Long? = null,
    @SerialName(value = "merge_when_pipeline_succeeds") val mergeWhenPipelineSucceeds: Boolean? = null,
    @SerialName(value = "milestone_id") val milestoneId: Long? = null,
    @SerialName(value = "source_branch") val sourceBranch: String? = null,
    @SerialName(value = "source_project_id") val sourceProjectId: Long? = null,
    @SerialName(value = "state_id") val stateId: Long? = null,
    @SerialName(value = "target_branch") val targetBranch: String? = null,
    @SerialName(value = "target_project_id") val targetProjectId: Long? = null,
    @SerialName(value = "time_estimate") val timeEstimate: Long? = null,
    @SerialName(value = "title") val title: String? = null,
    @SerialName(value = "updated_at") val updatedAt: Instant? = null,
    @SerialName(value = "updated_by_id") val updatedById: Long? = null,
    @SerialName(value = "prepared_at") val preparedAt: Instant? = null,
    @SerialName(value = "url") val url: String? = null,
    @SerialName(value = "source") val source: Branch? = null,
    @SerialName(value = "target") val target: Branch? = null,
    @SerialName(value = "last_commit") val lastCommit: Commit? = null,
    @SerialName(value = "work_in_progress") val workInProgress: Boolean? = null,
    @SerialName(value = "total_time_spent") val totalTimeSpent: Long? = null,
    @SerialName(value = "time_change") val timeChange: Long? = null,
    @SerialName(value = "human_total_time_spent") val humanTotalTimeSpent: String? = null,
    @SerialName(value = "human_time_change") val humanTimeChange: String? = null,
    @SerialName(value = "human_time_estimate") val humanTimeEstimate: String? = null,
    @SerialName(value = "assignee_ids") val assigneeIds: List<Long>? = null,
    @SerialName(value = "reviewer_ids") val reviewerIds: List<Long>? = null,
    @SerialName(value = "labels") val labels: List<Label>? = null,
    @SerialName(value = "state") val state: String? = null,
    @SerialName(value = "blocking_discussions_resolved") val blockingDiscussionsResolved: Boolean? = null,
    @SerialName(value = "first_contribution") val firstContribution: Boolean? = null,
    @SerialName(value = "detailed_merge_status") val detailedMergeStatus: String? = null,
    @SerialName(value = "action") val action: String? = null,
)
