package com.anarchyghost.processing.condition.evaluator

import com.anarchyghost.models.domain.GitlabEvent

interface ConditionEvaluator {
    suspend fun evaluate(event: GitlabEvent<*>): Boolean
}