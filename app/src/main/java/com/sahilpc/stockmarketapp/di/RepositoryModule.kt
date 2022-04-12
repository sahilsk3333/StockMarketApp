package com.sahilpc.stockmarketapp.di

import com.sahilpc.stockmarketapp.data.csv.CSVParser
import com.sahilpc.stockmarketapp.data.csv.CompanyListingsParser
import com.sahilpc.stockmarketapp.data.csv.IntradayInfoParser
import com.sahilpc.stockmarketapp.data.repository.StockRepositoryImpl
import com.sahilpc.stockmarketapp.domain.model.CompanyListing
import com.sahilpc.stockmarketapp.domain.model.IntradayInfo
import com.sahilpc.stockmarketapp.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>


    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ): CSVParser<IntradayInfo>
}