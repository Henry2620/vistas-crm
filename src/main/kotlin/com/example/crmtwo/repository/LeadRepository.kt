package com.example.crmtwo.repository

import com.example.crmtwo.entity.Lead
import org.springframework.data.jpa.repository.JpaRepository

interface LeadRepository : JpaRepository<Lead, Long>
