package academy.wakanda.wakacoop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class WakacoopApplication {

	@GetMapping
	public String testeHome() {
		return "Hello WakaCoop!";
	}

	public static void main(String[] args) {
		SpringApplication.run(WakacoopApplication.class, args);
	}

}