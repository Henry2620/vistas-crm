package com.example.crmtwo.repository

import com.example.crmtwo.entity.Activity
import org.springframework.data.jpa.repository.JpaRepository

interface ActivityRepository : JpaRepository<Activity, Long>
