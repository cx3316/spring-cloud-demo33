package cn.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MainProviderDept8001 {
    public static void main(String[] args) {
        SpringApplication.run(MainProviderDept8001.class,args);
    }
}
