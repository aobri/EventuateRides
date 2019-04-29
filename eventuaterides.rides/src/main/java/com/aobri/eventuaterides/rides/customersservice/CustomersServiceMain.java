package com.aobri.eventuaterides.rides.customersservice;

import com.aobri.eventuaterides.rides.commonswagger.CommonSwaggerConfiguration;
import com.aobri.eventuaterides.rides.customersservice.web.CustomerWebConfiguration;
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
