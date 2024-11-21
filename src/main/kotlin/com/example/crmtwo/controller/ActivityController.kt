package com.example.crmtwo.controller

import com.example.crmtwo.dto.ActivityDto
import com.example.crmtwo.service.ActivityService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/activities")
class ActivityController(private val activityService: ActivityService) {

    @GetMapping
    fun getAllActivities(): List<ActivityDto> {
        return activityService.getAllActivities()
    }

    @PostMapping
    fun createActivity(@RequestBody activityDto: ActivityDto): ActivityDto {
        return activityService.createActivity(activityDto)
    }

    @GetMapping("/{id}")
    fun getActivity(@PathVariable id: Long): ActivityDto {
        return activityService.getActivityById(id)
    }
}
