package com.anarchyghost.models.domain

import com.anarchyghost.models.common.EventType
import com.anarchyghost.models.domain.event.types.BaseEvent
import com.anarchyghost.models.json.configuration.labels.LabelsConfigurationJson
import com.anarchyghost.models.json.configuration.users.UsersConfigurationJson

class GitlabEvent<T: BaseEvent>(
    val event: T,
    val projectId: String?,
    val groupId: String?,
    val labels: Set<String>,
    val addedLabels: Set<String>,
    val deletedLabels: Set<String>,
    val type: EventType,
    val usersMapping: List<UsersConfigurationJson>,
    val labelsMapping: List<LabelsConfigurationJson>,
) {
    val usersById = usersMapping.associateBy { it.gitlab.id.toString() }
    val usersByUsername = usersMapping.associateBy { it.gitlab.username }
    val labelsByName = labelsMapping.associateBy { it.gitlab.name }

    fun getUserById(id: Long): UsersConfigurationJson? = usersById[id.toString()]
    fun getUserByUsername(username: String): UsersConfigurationJson? =
        usersByUsername[username]
    fun getLabelByName(name: String): LabelsConfigurationJson? = labelsByName[name]
    fun getLabelsByName(labels: Set<String>): List<LabelsConfigurationJson> = labelsMapping.filter { it.gitlab.name in labels }
}