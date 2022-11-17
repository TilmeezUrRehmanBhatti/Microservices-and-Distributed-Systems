/*
*
*create by TilmeezUrRehmanBhatti created on 15/11/2022
*/
    
    package org.tilmeez.fraud;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public record FraudCheckService(FraudCheckHistoryRepository fraudCheckHistoryRepository)
{
    public boolean isFraudulentCustomer (Integer customerId)
    {
        fraudCheckHistoryRepository.save(
                FraudCheckHistory.builder()
                        .customerId(customerId)
                        .isFraudster(false)
                        .createdAt(LocalDateTime.now())
                        .build()
        );
        return false;
    }
}
