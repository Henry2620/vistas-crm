package com.example.crmtwo.repository

import com.example.crmtwo.entity.ActivityView
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerActivityViewRepository : JpaRepository<ActivityView, Long>
