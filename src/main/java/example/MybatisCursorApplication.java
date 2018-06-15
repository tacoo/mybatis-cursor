package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MybatisCursorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MybatisCursorApplication.class, args);
	}

	@Autowired
	ARepository aRepository;

	@Override
	public void run(String... args) throws Exception {
		aRepository.whyCursorWhy();
	}

}
