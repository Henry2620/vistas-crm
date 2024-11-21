package com.example.crmtwo.service

import com.example.crmtwo.dto.ActivityDto
import com.example.crmtwo.mapper.ActivityMapper
import com.example.crmtwo.repository.ActivityRepository
import org.springframework.stereotype.Service

@Service
class ActivityService(private val activityRepository: ActivityRepository) {

    fun getAllActivities(): List<ActivityDto> {
        return activityRepository.findAll().map { ActivityMapper.toDto(it) }
    }

    fun createActivity(activityDto: ActivityDto): ActivityDto {
        val activity = ActivityMapper.toEntity(activityDto)
        val savedActivity = activityRepository.save(activity)
        return ActivityMapper.toDto(savedActivity)
    }

    fun getActivityById(id: Long): ActivityDto {
        val activity = activityRepository.findById(id).orElseThrow { Exception("Activity not found") }
        return ActivityMapper.toDto(activity)
    }
}
