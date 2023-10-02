package uniandes.edu.co.hotelandes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;


@SpringBootApplication
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class HotelandesApplication{

	public static void main(String[] args) {
		System.out.println("hola");
		SpringApplication.run(HotelandesApplication.class, args);
		System.out.println("holiwis");

	}
}
