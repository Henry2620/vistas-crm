package com.example.crmtwo.service

import CustomerActivityView
import com.example.crmtwo.dto.CustomerDto
import com.example.crmtwo.mapper.CustomerMapper
import com.example.crmtwo.repository.CustomerRepository
import com.example.crmtwo.repository.CustomerActivityViewRepository
import org.springframework.stereotype.Service

@Service
class CustomerService(
    private val customerRepository: CustomerRepository,
    private val customerActivityViewRepository: CustomerActivityViewRepository // Inyección del nuevo repositorio
) {

    fun getAllCustomers(): List<CustomerDto> {
        return customerRepository.findAll().map { CustomerMapper.toDto(it) }
    }

    fun createCustomer(customerDto: CustomerDto): CustomerDto {
        val customer = CustomerMapper.toEntity(customerDto)
        val savedCustomer = customerRepository.save(customer)
        return CustomerMapper.toDto(savedCustomer)
    }

    fun getCustomerById(id: Long): CustomerDto {
        val customer = customerRepository.findById(id).orElseThrow { Exception("Customer not found") }
        return CustomerMapper.toDto(customer)
    }

    fun listCustomerActivities(): List<CustomerActivityView> {
        return customerActivityViewRepository.findAll()
    }
}
