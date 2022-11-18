/*
 *
 *create by TilmeezUrRehmanBhatti created on 18/11/2022
 */

package com.tilmeez.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication
{
    public static void main (String[] args)
    {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
