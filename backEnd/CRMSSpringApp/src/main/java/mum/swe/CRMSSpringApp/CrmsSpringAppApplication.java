package mum.swe.CRMSSpringApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("mum.swe.CRMSSpringApp")
public class CrmsSpringAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrmsSpringAppApplication.class, args);
    }
}
