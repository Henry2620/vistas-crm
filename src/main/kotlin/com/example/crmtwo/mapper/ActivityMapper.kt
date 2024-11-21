package com.example.crmtwo.mapper

import com.example.crmtwo.dto.ActivityDto
import com.example.crmtwo.entity.Activity
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object ActivityMapper {

    private val formatter = DateTimeFormatter.ISO_DATE_TIME

    fun toDto(activity: Activity): ActivityDto {
        return ActivityDto(
            activityId = activity.activityId,
            leadId = activity.leadId,
            description = activity.description,
            activityType = activity.activityType,
            activityDate = activity.activityDate.format(formatter)
        )
    }

    fun toEntity(activityDto: ActivityDto): Activity {
        return Activity(
            activityId = activityDto.activityId,
            leadId = activityDto.leadId ?: 0L,
            description = activityDto.description,
            activityType = activityDto.activityType,
            activityDate = activityDto.activityDate?.let {
                LocalDateTime.parse(it, formatter)
            } ?: LocalDateTime.now()
        )
    }
}
