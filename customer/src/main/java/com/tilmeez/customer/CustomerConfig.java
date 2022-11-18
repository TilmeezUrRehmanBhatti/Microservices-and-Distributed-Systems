/*
 *
 *create by TilmeezUrRehmanBhatti created on 17/11/2022
 */

package com.tilmeez.customer;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CustomerConfig
{
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate ()
    {
        return new RestTemplate();
    }

}
