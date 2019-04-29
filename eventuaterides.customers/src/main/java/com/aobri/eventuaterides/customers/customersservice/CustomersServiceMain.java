package com.aobri.eventuaterides.customers.customersservice;

import com.aobri.eventuaterides.customers.commonswagger.CommonSwaggerConfiguration;
import com.aobri.eventuaterides.customers.customersservice.web.CustomerWebConfiguration;
import io.eventuate.javaclient.driver.EventuateDriverConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
@Import({CustomerWebConfiguration.class,
        EventuateDriverConfiguration.class,
        CommonSwaggerConfiguration.class})
@SpringBootApplication
public class CustomersServiceMain {
    public static void main(String[] args) {
        SpringApplication.run(CustomersServiceMain.class, args);
    }
}
