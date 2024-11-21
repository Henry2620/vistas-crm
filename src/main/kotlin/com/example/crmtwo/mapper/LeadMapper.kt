package com.example.crmtwo.mapper

import com.example.crmtwo.dto.LeadDto
import com.example.crmtwo.entity.Lead

object LeadMapper {
    fun toDto(lead: Lead): LeadDto {
        return LeadDto(
            leadId = lead.leadId,
            name = lead.name,
            email = lead.email,
            status = lead.status,
            createdAt = lead.createdAt.toString(),
            customerId = lead.customer?.id
        )
    }

    fun toEntity(leadDto: LeadDto): Lead {
        return Lead(
            leadId = leadDto.leadId,
            name = leadDto.name,
            email = leadDto.email,
            status = leadDto.status
        )
    }
}
