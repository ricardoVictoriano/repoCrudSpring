package com.ricardovictoriano.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ricardovictoriano.entities.User;
import com.ricardovictoriano.repositories.UserRepository;

@SpringBootApplication
@ComponentScan(basePackages = {"hello","com.ricardovictoriano.controllers", "com.ricardovictoriano.entities"})
@EntityScan("com.ricardovictoriano.entities")
@EnableJpaRepositories("com.ricardovictoriano.repositories")
public class CrudSpringProjectApplication implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepo;
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringProjectApplication.class, args);
	}




	@Override
	public void run(String... args) throws Exception {
		
		//userRepo.findById((long) 4);
		userRepo.save(new User("RICARDO VICTORIANO", "AV DOS BONS AMIGOS 29", "rvictoriano@ual.pt", 870));
		userRepo.save(new User("PRISCILA MATOS", "RUA MOUZINHO DE ALBUQUERQUE 26", "priscila_matos@hotmail.com", 2650));
		userRepo.save(new User("SANDRA BAPTISTA", "RUA ELIAS GARCIA 12", "sbaptista@gmail.com", 4100));
		userRepo.save(new User("RAUL GOUVEIA", "AV DA CINTURA 4", "raul_gouveia@gmail.com", 680));
		userRepo.save(new User("MARIA SOARES", "RUA EUGENIO DE CASTRO 56", "maria_soares@hotmail.com", 1400));
		userRepo.save(new User("BRUNA DA SILVA", "RUA ANTÓNIO CASTILHO 11", "brsilva@hotmail.com", 940));
		userRepo.save(new User("TIAGO MANUEL", "RUA SANTA MARIA", "tmanuel@ual.pt", 490));
		
		
	}
}
