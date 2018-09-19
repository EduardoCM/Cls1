package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.SaludoSpring;

public class PruebaSpring {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		SaludoSpring holaMundo = (SaludoSpring) context.getBean("beanSpring");

		System.out.println(holaMundo.getMensaje());

	}

}
