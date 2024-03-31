@file:UseSerializers(InstantSerializer::class)

package com.anarchyghost.models.domain.event

import com.anarchyghost.utils.InstantSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import java.time.Instant

@Serializable
data class IssueChanges(
    @SerialName("id") val id: Changes<Long>? = null,
    @SerialName("title") val title: Changes<String>? = null,
    @SerialName("assignee_ids") val assigneeIds: Changes<List<Long>>? = null,
    @SerialName("assignee_id") val assigneeId: Changes<Long>? = null,
    @SerialName("author_id") val authorId: Changes<Long>? = null,
    @SerialName("closed_at") val closedAt: Changes<Instant>? = null,
    @SerialName("project_id") val projectId: Changes<Long>? = null,
    @SerialName("created_at") val createdAt: Changes<Instant>? = null,
    @SerialName("updated_at") val updatedAt: Changes<Instant>? = null,
    @SerialName("updated_by_id") val updatedById: Changes<Long>? = null,
    @SerialName("last_edited_at") val lastEditedAt: Changes<Instant>? = null,
    @SerialName("last_edited_by_id") val lastEditedById: Changes<Long>? = null,
    @SerialName("relative_position") val relativePosition: Changes<Int>? = null,
    @SerialName("description") val description: Changes<String>? = null,
    @SerialName("milestone_id") val milestoneId: Changes<Long>? = null,
    @SerialName("state_id") val stateId: Changes<Int>? = null,
    @SerialName("confidential") val confidential: Changes<Boolean>? = null,
    @SerialName("discussion_locked") val discussionLocked: Changes<Boolean>? = null,
    @SerialName("due_date") val dueDate: Changes<Instant>? = null,
    @SerialName("moved_to_id") val movedToId: Changes<Long>? = null,
    @SerialName("duplicated_to_id") val duplicatedToId: Changes<Long>? = null,
    @SerialName("time_estimate") val timeEstimate: Changes<Long>? = null,
    @SerialName("total_time_spent") val totalTimeSpent: Changes<Long>? = null,
    @SerialName("time_change") val timeChange: Changes<Long>? = null,
    @SerialName("human_total_time_spent") val humanTotalTimeSpent: Changes<Long>? = null,
    @SerialName("human_time_estimate") val humanTimeEstimate: Changes<Long>? = null,
    @SerialName("human_time_change") val humanTimeChange: Changes<Long>? = null,
    @SerialName("weight") val weight: Changes<Int>? = null,
    @SerialName("health_status") val healthStatus: Changes<String>? = null,
    @SerialName("iid") val iid: Changes<Long>? = null,
    @SerialName("url") val url: Changes<String>? = null,
    @SerialName("state") val state: Changes<String>? = null,
    @SerialName("action") val action: Changes<String>? = null,
    @SerialName("severity") val severity: Changes<String>? = null,
    @SerialName("escalation_status") val escalationStatus: Changes<String>? = null,
    @SerialName("escalation_policy") val escalationPolicy: Changes<EscalationPolicy>? = null,
    @SerialName("labels") val labels: Changes<List<Label>>? = null,
)