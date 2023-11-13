package D.Discovery_quiz_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryQuizServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryQuizServerApplication.class, args);
	}

}
