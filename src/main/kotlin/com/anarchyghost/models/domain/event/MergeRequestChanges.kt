@file:UseSerializers(InstantSerializer::class)

package com.anarchyghost.models.domain.event

import com.anarchyghost.utils.InstantSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import java.time.Instant

@Serializable
data class MergeRequestChanges(
    @SerialName(value = "assignee_id") val assigneeId: Changes<Long>? = null,
    @SerialName(value = "author_id") val authorId: Changes<Long>? = null,
    @SerialName(value = "created_at") val createdAt: Changes<Instant>? = null,
    @SerialName(value = "description") val description: Changes<String>? = null,
    @SerialName(value = "draft") val draft: Changes<Boolean>? = null,
    @SerialName(value = "head_pipeline_id") val headPipelineId: Changes<Long>? = null,
    @SerialName(value = "id") val id: Changes<Long>? = null,
    @SerialName(value = "iid") val iid: Changes<Long>? = null,
    @SerialName(value = "last_edited_at") val lastEditedAt: Changes<Instant>? = null,
    @SerialName(value = "last_edited_by_id") val lastEditedById: Changes<Long>? = null,
    @SerialName(value = "merge_commit_sha") val mergeCommitSha: Changes<String>? = null,
    @SerialName(value = "merge_error") val mergeError: Changes<String>? = null,
    @SerialName(value = "merge_params") val mergeParams: Changes<Map<String, String>>? = null,
    @SerialName(value = "merge_status") val mergeStatus: Changes<String>? = null,
    @SerialName(value = "merge_user_id") val mergeUserId: Changes<Long>? = null,
    @SerialName(value = "merge_when_pipeline_succeeds") val mergeWhenPipelineSucceeds: Changes<Boolean>? = null,
    @SerialName(value = "milestone_id") val milestoneId: Changes<Long>? = null,
    @SerialName(value = "source_branch") val sourceBranch: Changes<String>? = null,
    @SerialName(value = "source_project_id") val sourceProjectId: Changes<Long>? = null,
    @SerialName(value = "state_id") val stateId: Changes<Long>? = null,
    @SerialName(value = "target_branch") val targetBranch: Changes<String>? = null,
    @SerialName(value = "target_project_id") val targetProjectId: Changes<Long>? = null,
    @SerialName(value = "time_estimate") val timeEstimate: Changes<Long>? = null,
    @SerialName(value = "title") val title: Changes<String>? = null,
    @SerialName(value = "updated_at") val updatedAt: Changes<Instant>? = null,
    @SerialName(value = "updated_by_id") val updatedById: Changes<Long>? = null,
    @SerialName(value = "prepared_at") val preparedAt: Changes<Instant>? = null,
    @SerialName(value = "url") val url: Changes<String>? = null,
    @SerialName(value = "source") val source: Changes<Branch>? = null,
    @SerialName(value = "target") val target: Changes<Branch>? = null,
    @SerialName(value = "last_commit") val lastCommit: Changes<Commit>? = null,
    @SerialName(value = "work_in_progress") val workInProgress: Changes<Boolean>? = null,
    @SerialName(value = "total_time_spent") val totalTimeSpent: Changes<Long>? = null,
    @SerialName(value = "time_change") val timeChange: Changes<Long>? = null,
    @SerialName(value = "human_total_time_spent") val humanTotalTimeSpent: Changes<String>? = null,
    @SerialName(value = "human_time_change") val humanTimeChange: Changes<String>? = null,
    @SerialName(value = "human_time_estimate") val humanTimeEstimate: Changes<String>? = null,
    @SerialName(value = "assignee_ids") val assigneeIds: Changes<List<Long>>? = null,
    @SerialName(value = "reviewer_ids") val reviewerIds: Changes<List<Long>>? = null,
    @SerialName(value = "labels") val labels: Changes<List<Label>>? = null,
    @SerialName(value = "state") val state: Changes<String>? = null,
    @SerialName(value = "blocking_discussions_resolved") val blockingDiscussionsResolved: Changes<Boolean>? = null,
    @SerialName(value = "first_contribution") val firstContribution: Changes<Boolean>? = null,
    @SerialName(value = "detailed_merge_status") val detailedMergeStatus: Changes<String>? = null,
)