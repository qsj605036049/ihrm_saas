package com.ihrm.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @author qinshiji
 * @date 2020/1/9 17:51
 */
@SpringBootApplication(scanBasePackages = "com.ihrm.system")
@EntityScan(basePackages = "com.ihrm.domain")
public class SystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(SystemApplication.class,args);
    }
}
