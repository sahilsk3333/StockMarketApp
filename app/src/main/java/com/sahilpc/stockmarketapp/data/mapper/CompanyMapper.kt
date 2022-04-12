package com.sahilpc.stockmarketapp.data.mapper

import com.sahilpc.stockmarketapp.data.local.entity.CompanyListingEntity
import com.sahilpc.stockmarketapp.data.remote.dto.CompanyInfoDto
import com.sahilpc.stockmarketapp.domain.model.CompanyInfo
import com.sahilpc.stockmarketapp.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing():CompanyListing{
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyListing.toCompanyListingEntity():CompanyListingEntity{
    return CompanyListingEntity(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyInfoDto.toCompanyInfo(): CompanyInfo {
    return CompanyInfo(
        symbol = symbol ?: "",
        description = description ?: "",
        name = name ?: "",
        country = country ?: "",
        industry = industry ?: ""
    )
}