package com.example.crmtwo.dto

data class CustomerDto(
    val id: Long,
    val fullName: String,
    val email: String,
    val phone: String? = null,
    val address: String? = null
)
