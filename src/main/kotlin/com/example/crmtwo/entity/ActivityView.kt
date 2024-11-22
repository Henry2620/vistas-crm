package com.example.crmtwo.entity
import jakarta.persistence.*
import java.time.LocalDateTime


@Entity
@Table(name = "activity_view")
class ActivityView {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val activityId: Long? = null
    val leadId: Long? = null
    val description: String? = null
    val activityType: String? = null
    val activityDate: LocalDateTime? = null
    val name: String? = null
}
