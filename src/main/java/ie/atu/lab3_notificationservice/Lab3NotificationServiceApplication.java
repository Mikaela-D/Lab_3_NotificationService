package ie.atu.lab3_notificationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Lab3NotificationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab3NotificationServiceApplication.class, args);
    }

}
