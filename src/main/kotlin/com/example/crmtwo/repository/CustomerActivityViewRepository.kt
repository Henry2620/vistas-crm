package com.example.crmtwo.repository

import CustomerActivityView
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerActivityViewRepository : JpaRepository<CustomerActivityView, Long>
