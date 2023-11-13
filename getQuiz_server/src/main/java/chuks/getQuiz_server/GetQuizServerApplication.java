package chuks.getQuiz_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GetQuizServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetQuizServerApplication.class, args);
	}

}
