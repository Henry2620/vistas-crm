package com.example.crmtwo.service

import com.example.crmtwo.dto.LeadDto
import com.example.crmtwo.mapper.LeadMapper
import com.example.crmtwo.repository.LeadRepository
import org.springframework.stereotype.Service

@Service
class LeadService(private val leadRepository: LeadRepository) {

    fun getAllLeads(): List<LeadDto> {
        return leadRepository.findAll().map { LeadMapper.toDto(it) }
    }

    fun createLead(leadDto: LeadDto): LeadDto {
        val lead = LeadMapper.toEntity(leadDto)
        val savedLead = leadRepository.save(lead)
        return LeadMapper.toDto(savedLead)
    }

    fun getLeadById(id: Long): LeadDto {
        val lead = leadRepository.findById(id).orElseThrow { Exception("Lead not found") }
        return LeadMapper.toDto(lead)
    }
}
