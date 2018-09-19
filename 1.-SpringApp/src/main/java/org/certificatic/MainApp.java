package org.certificatic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
		
		Administrador administrador = (Administrador) applicationContext.getBean("adminGetSet");
		
		//administrador.imprimirDireccion();
		
		System.out.println(administrador);
		
	}

}
