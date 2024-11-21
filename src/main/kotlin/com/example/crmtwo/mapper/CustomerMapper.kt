package com.example.crmtwo.mapper

import com.example.crmtwo.dto.CustomerDto
import com.example.crmtwo.entity.Customer

object CustomerMapper {


    fun toDto(customer: Customer): CustomerDto {
        return CustomerDto(
            id = customer.id,
            fullName = customer.fullName,
            email = customer.email,
            phone = customer.phone,
            address = customer.address
        )
    }

    // Convierte un DTO CustomerDto a una entidad Customer
    fun toEntity(customerDto: CustomerDto): Customer {
        return Customer(
            id = customerDto.id, // Usamos el id del DTO, el cual debería ser no nullable
            fullName = customerDto.fullName,
            email = customerDto.email,
            phone = customerDto.phone, // Puede ser nullable
            address = customerDto.address // Puede ser nullable
        )
    }
}
