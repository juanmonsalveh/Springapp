package org.jmonsalve;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="org.jmonsalve")
public class AppConfig {
/* Basta con poner @Component en Administrador y el @ComponentScan lo identificara
	//Configurar los beansaca
	@Bean
	public Administrador getAdministrador() {
		Administrador administrador = new Administrador(1,"Juan");
		return administrador;
	}
	*/
	
}
