package com.anarchyghost.models.domain

import com.anarchyghost.models.common.EventType
import com.anarchyghost.models.domain.event.types.BaseEvent
import com.anarchyghost.models.json.configuration.labels.LabelsConfigurationJson
import com.anarchyghost.models.json.configuration.users.UsersConfigurationJson

data class GitlabEvent<T: BaseEvent>(
    val event: T,
    val projectId: String?,
    val groupId: String?,
    val labels: Set<String>,
    val addedLabels: Set<String>,
    val deletedLabels: Set<String>,
    val type: EventType,
    private val usersMapping: List<UsersConfigurationJson>,
    private val labelsMapping: List<LabelsConfigurationJson>,
) {

    //TODO think about nullsafety
    fun getUserById(id: Long): UsersConfigurationJson = usersMapping.first { it.gitlab.id == id }
    fun getUserByUsername(username: String): UsersConfigurationJson =
        usersMapping.first { it.gitlab.username == username }
    fun getLabelByName(name: String): LabelsConfigurationJson = labelsMapping.first { it.gitlab.name == name }
    fun getLabelsByName(labels: Set<String>): List<LabelsConfigurationJson> = labelsMapping.filter { it.gitlab.name in labels }
}