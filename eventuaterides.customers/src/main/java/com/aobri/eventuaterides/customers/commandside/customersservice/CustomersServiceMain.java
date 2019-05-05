package com.aobri.eventuaterides.customers.commandside.customersservice;

import com.aobri.eventuaterides.customers.commandside.commonswagger.CommonSwaggerConfiguration;
import com.aobri.eventuaterides.customers.commandside.customersservice.web.CustomerWebConfiguration;
import io.eventuate.javaclient.driver.EventuateDriverConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
