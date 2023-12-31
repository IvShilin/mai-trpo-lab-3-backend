package ru.ivn_sln.data.response

import kotlinx.serialization.Serializable

@Serializable
data class OperationExtendedResponse(
    val operationId: Int,
    val date: String,
    val sum: Int,
    val category: OperationCategoryResponse,
    val type: OperationTypeResponse,
)