/*
 *
 *create by TilmeezUrRehmanBhatti created on 18/11/2022
 */

package com.tilmeez.clients.fraud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        value = "fraud" ,
        path = "api/v1/fraud-check"  // or we can use other way by GetMapping same thing Hi
)
public interface FraudClient
{
    @GetMapping(path = "api/v1/fraud-check/{customerId}")
    FraudCheckResponse isFraudster (
            @PathVariable("customerId") Integer customerId);
}
