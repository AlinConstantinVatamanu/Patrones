package com.nttdata.patrones;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.patrones.prototype.Casa;
import com.nttdata.patrones.prototype.CasaModificada;
import com.nttdata.patrones.singleton.Coche;


@SpringBootApplication
public class PatronesApplication implements CommandLineRunner {

	private Coche coche;
	
	public static void main(String[] args) {
		SpringApplication.run(PatronesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		//Patrón SINGLETON
		Coche instanciaCoche1 = coche.getInstance("2567DGH");
		System.out.println(instanciaCoche1.getMatricula());
		Coche instanciaCoche2 = coche.getInstance("4912LTW");
		System.out.println(instanciaCoche2.getMatricula());
		
		//Prototype
		Casa casa1 = new CasaModificada();
		casa1.setNumHabitaciones(3);
		casa1.setDireccion("Calle Larios, 2");
		casa1.setTamano(80);
		System.out.println(casa1.verCasa());
		
		Casa casa2 = casa1.clone();
		casa2.setNumHabitaciones(2);
		casa2.setDireccion("Calle principal, 15");
		casa2.setTamano(70);
		System.out.println(casa2.verCasa());
		
	}

}
