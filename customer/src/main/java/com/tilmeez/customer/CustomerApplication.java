/*
 *
 *create by TilmeezUrRehmanBhatti created on 09/11/2022
 */

package com.tilmeez.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(
        basePackages = "com.tilmeez.clients"
)
public class CustomerApplication {

    public static void main (String[] args) {

        SpringApplication.run(CustomerApplication.class, args);
    }

}
