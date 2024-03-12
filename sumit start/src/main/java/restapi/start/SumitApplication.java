package restapi.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SumitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SumitApplication.class, args);
		System.out.println("this is rest api");
	}

}

