package org.jmonsalve;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	
	public static void main(String[] args) {
		/*//Haciendo uso del archivo xml de configuracion
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_config.xml");
		Administrador administrador = (Administrador) applicationContext.getBean("admin");
		System.out.println(administrador);
		administrador.imprimirDireccion();

		((ClassPathXmlApplicationContext)applicationContext).close();
		*/
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Administrador administrador = applicationContext.getBean(Administrador.class);
		System.out.println(administrador);
		administrador.imprimirDireccion();
		
		
		
	}


}
