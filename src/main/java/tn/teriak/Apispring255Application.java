package tn.teriak;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import tn.teriak.model.ERole;
import tn.teriak.model.Role;
import tn.teriak.model.TypeAttestation;
import tn.teriak.repository.ITypeAttestation;
import tn.teriak.repository.RoleRepository;



@SpringBootApplication
public class Apispring255Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Apispring255Application.class, args);
	}
	 @Bean
	    public CommandLineRunner demoData(RoleRepository repo) {
	        return args -> {
	            repo.save(new Role(1, ERole.ROLE_ADMIN ));
	        };
	    }
	 @Bean
	    public CommandLineRunner demoDatatypeat(ITypeAttestation repo) {
	        return args -> {
	            repo.save(new TypeAttestation(1,"Stage" ));
	            repo.save(new TypeAttestation(2,"Travail" ));
	            repo.save(new TypeAttestation(3,"Titularisation" ));
	            repo.save(new TypeAttestation(4,"Salaire" ));
	            repo.save(new TypeAttestation(4,"Fiche de Paie" ));



	        };
	    }

}
