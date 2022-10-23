package project.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories( basePackages = {"project.main.Repositories"})
public class MeuGerenciadorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeuGerenciadorApplication.class, args);
	}

}
