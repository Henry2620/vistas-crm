package com.example.crmtwo.repository

import ActivityView
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ActivityView : JpaRepository<ActivityView, Long>
