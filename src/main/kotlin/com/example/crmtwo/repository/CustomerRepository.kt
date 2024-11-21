package com.example.crmtwo.repository

import com.example.crmtwo.entity.Customer
import org.springframework.data.jpa.repository.JpaRepository

interface CustomerRepository : JpaRepository<Customer, Long>
