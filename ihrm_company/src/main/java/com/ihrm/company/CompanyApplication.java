package com.ihrm.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @author qinshiji
 * @date 2020/1/9 17:49
 */
@SpringBootApplication(scanBasePackages = "com.ihrm.company")
@EntityScan(basePackages = "com.ihrm.domain")
public class CompanyApplication {
    public static void main(String[] args) {
        SpringApplication.run(CompanyApplication.class,args);
    }
}
