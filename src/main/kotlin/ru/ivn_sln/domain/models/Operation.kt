package ru.ivn_sln.domain.models

import kotlinx.serialization.Serializable

@Serializable
data class Operation(
    val operationId : Int,
    val date : String,
    val sum: Int,
)