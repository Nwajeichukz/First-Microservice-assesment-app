package chuks.createQuiz_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CreateQuizServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreateQuizServerApplication.class, args);
	}

}
