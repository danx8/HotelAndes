package uniandes.edu.co.hotelandes;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import uniandes.edu.co.hotelandes.modelo.Habitacion;
import uniandes.edu.co.hotelandes.repositorio.HabitacionRepository;

@SpringBootApplication
public class HotelandesApplication implements CommandLineRunner{

	@Autowired
	private HabitacionRepository habitacionRepository;
	public static void main(String[] args) {
		SpringApplication.run(HotelandesApplication.class, args);
	}

	@Override 
	public void run(String... arg) {
		Collection<Habitacion> habitaciones = habitacionRepository.darHabitaciones();
		for (Habitacion hab: habitaciones) {
			System.out.println(hab);
		}
	}
}
