package com.example.crmtwo.dto

data class LeadDto(
    val leadId: Long,
    val name: String,
    val email: String,
    val status: String = "active",
    val createdAt: String? = null,
    val customerId: Long? = null
)
