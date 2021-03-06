package cc.openhome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
    scanBasePackages={
        "cc.openhome",
        "cc.openhome.controller",
        "cc.openhome.model"
    }
)
public class ToyApplication {
    public static void main(String[] args) {
        SpringApplication.run(ToyApplication.class, args);
    }
}