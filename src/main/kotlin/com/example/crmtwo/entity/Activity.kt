package com.example.crmtwo.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
data class Activity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val activityId: Long = 0,
    val leadId: Long,
    val description: String,
    val activityType: String? = null,
    val activityDate: LocalDateTime = LocalDateTime.now()
)
