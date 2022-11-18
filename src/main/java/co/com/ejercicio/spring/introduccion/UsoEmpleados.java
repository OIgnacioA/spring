package co.com.ejercicio.spring.introduccion;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	
	public static void main(String[]args) {
	
	ClassPathXmlApplicationContext Contexto = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	
	
	Empleados juan = Contexto.getBean("miEmpleado", Empleados.class);
	
	System.out.println(juan.GetTareas());
	
	System.out.println(juan.GetInforme());
	
	Contexto.close(); 
	
	
	
	}
	
	
}
