package com.sahilpc.stockmarketapp.domain.repository

import com.sahilpc.stockmarketapp.domain.model.CompanyInfo
import com.sahilpc.stockmarketapp.domain.model.CompanyListing
import com.sahilpc.stockmarketapp.domain.model.IntradayInfo
import com.sahilpc.stockmarketapp.utils.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {
    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>
    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>
}