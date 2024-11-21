package com.example.crmtwo.controller

import com.example.crmtwo.dto.LeadDto
import com.example.crmtwo.service.LeadService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/leads")
class LeadController(private val leadService: LeadService) {

    @GetMapping
    fun getAllLeads(): List<LeadDto> {
        return leadService.getAllLeads()
    }

    @PostMapping
    fun createLead(@RequestBody leadDto: LeadDto): LeadDto {
        return leadService.createLead(leadDto)
    }

    @GetMapping("/{id}")
    fun getLead(@PathVariable id: Long): LeadDto {
        return leadService.getLeadById(id)
    }
}
