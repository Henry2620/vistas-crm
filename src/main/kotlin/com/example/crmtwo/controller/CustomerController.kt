package com.example.crmtwo.controller

import com.example.crmtwo.entity.ActivityView
import com.example.crmtwo.dto.CustomerDto
import com.example.crmtwo.service.CustomerService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/customers")
class CustomerController(private val customerService: CustomerService) {

    @GetMapping
    fun getAllCustomers(): List<CustomerDto> {
        return customerService.getAllCustomers()
    }

    @PostMapping
    fun createCustomer(@RequestBody customerDto: CustomerDto): CustomerDto {
        return customerService.createCustomer(customerDto)
    }

    @GetMapping("/{id}")
    fun getCustomer(@PathVariable id: Long): CustomerDto {
        return customerService.getCustomerById(id)
    }

    // Nuevo endpoint para listar las actividades de los clientes desde la vista
    @GetMapping("/activities")
    fun listCustomerActivities(): List<ActivityView> {
        return customerService.listCustomerActivities()
    }
}
