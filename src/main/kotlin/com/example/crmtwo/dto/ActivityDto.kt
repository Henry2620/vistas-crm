package com.example.crmtwo.dto

data class ActivityDto(
    val activityId: Long = 0,
    val leadId: Long? = null,
    val description: String,
    val activityType: String?,
    val activityDate: String? = null
)
