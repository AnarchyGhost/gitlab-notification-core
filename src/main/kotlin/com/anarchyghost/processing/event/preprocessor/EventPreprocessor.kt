package com.anarchyghost.processing.event.preprocessor

import com.anarchyghost.models.domain.GitlabEvent
import com.anarchyghost.models.domain.event.types.BaseEvent
import com.anarchyghost.models.json.configuration.labels.LabelsConfigurationJson
import com.anarchyghost.models.json.configuration.users.UsersConfigurationJson

interface EventPreprocessor {
    suspend fun preprocess(
        event: BaseEvent,
        labelsMapping: List<LabelsConfigurationJson>,
        usersMapping: List<UsersConfigurationJson>
    ): GitlabEvent<*>
}