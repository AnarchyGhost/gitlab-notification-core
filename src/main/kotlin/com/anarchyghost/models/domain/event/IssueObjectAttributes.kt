@file:UseSerializers(InstantSerializer::class)

package com.anarchyghost.models.domain.event

import com.anarchyghost.utils.InstantSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import java.time.Instant

@Serializable
data class IssueObjectAttributes(
    @SerialName("id") val id: Long? = null,
    @SerialName("title") val title: String? = null,
    @SerialName("assignee_ids") val assigneeIds: List<Long>? = null,
    @SerialName("assignee_id") val assigneeId: Long? = null,
    @SerialName("closed_at") val closedAt: Instant? = null,
    @SerialName("author_id") val authorId: Long? = null,
    @SerialName("project_id") val projectId: Long? = null,
    @SerialName("created_at") val createdAt: Instant? = null,
    @SerialName("updated_at") val updatedAt: Instant? = null,
    @SerialName("updated_by_id") val updatedById: Long? = null,
    @SerialName("last_edited_at") val lastEditedAt: Instant? = null,
    @SerialName("last_edited_by_id") val lastEditedById: Long? = null,
    @SerialName("relative_position") val relativePosition: Int? = null,
    @SerialName("description") val description: String? = null,
    @SerialName("milestone_id") val milestoneId: Long? = null,
    @SerialName("state_id") val stateId: Int? = null,
    @SerialName("confidential") val confidential: Boolean? = null,
    @SerialName("discussion_locked") val discussionLocked: Boolean? = null,
    @SerialName("due_date") val dueDate: Instant? = null,
    @SerialName("moved_to_id") val movedToId: Long? = null,
    @SerialName("duplicated_to_id") val duplicatedToId: Long? = null,
    @SerialName("time_estimate") val timeEstimate: Long? = null,
    @SerialName("total_time_spent") val totalTimeSpent: Long? = null,
    @SerialName("time_change") val timeChange: Long? = null,
    @SerialName("human_total_time_spent") val humanTotalTimeSpent: Long? = null,
    @SerialName("human_time_estimate") val humanTimeEstimate: Long? = null,
    @SerialName("human_time_change") val humanTimeChange: Long? = null,
    @SerialName("weight") val weight: Int? = null,
    @SerialName("health_status") val healthStatus: String? = null,
    @SerialName("iid") val iid: Long? = null,
    @SerialName("url") val url: String? = null,
    @SerialName("state") val state: String? = null,
    @SerialName("action") val action: String? = null,
    @SerialName("customer_relations_contacts") val customerRelationsContacts: List<String>? = null,
    @SerialName("severity") val severity: String? = null,
    @SerialName("escalation_status") val escalationStatus: String? = null,
    @SerialName("escalation_policy") val escalationPolicy: EscalationPolicy? = null,
    @SerialName("labels") val labels: List<Label>? = null,
)