package ru.ivn_sln.data.data_source

import ru.ivn_sln.data.response.OperationExtendedResponse
import ru.ivn_sln.data.response.OperationResponse
import ru.ivn_sln.data.response.RegUser
import ru.ivn_sln.data.response.ReportInfo
import ru.ivn_sln.domain.models.OperationInsert
import ru.ivn_sln.domain.models.OperationUpdate
import java.time.Instant

interface RenderDataSource {
    suspend fun fetchOperations(token : String) : List<OperationResponse>

    suspend fun fetchOperationsData(operationId : Int) : OperationExtendedResponse

    suspend fun deleteOperation(operationId: Int)

    suspend fun insertNewOperation(
        token: String,
        operationInsert: OperationInsert,
    )

    suspend fun changeOperation(
        operationId : Int,
        operationUpdate: OperationUpdate,
    )

    suspend fun regUser(
        token: String,
        user: RegUser,
    )

    suspend fun createReportFromType(
        token: String,
        typeId: Int,
        fromDate: Instant,
        toDate: Instant,
    ) : ReportInfo

    suspend fun createReportFromCategory(
        token: String,
        categoryId: Int,
        fromDate: Instant,
        toDate: Instant,
    ) : ReportInfo

    suspend fun fetchReports(
        token : String,
    ) : List<ReportInfo>
}