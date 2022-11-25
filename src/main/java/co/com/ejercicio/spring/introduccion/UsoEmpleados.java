package co.com.ejercicio.spring.introduccion;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	
	public static void main(String[]args) {
	
		//leer el xml
	//ClassPathXmlApplicationContext Contexto = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	
	//leer el class de configuracion
		
		AnnotationConfigApplicationContext Contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		
		
	/*Empleados juan = Contexto.getBean("miEmpleado", Empleados.class);
	
	System.out.println(juan.GetTareas());
	
	System.out.println(juan.GetInforme());*/
		
		/*Empleados empleado = Contexto.getBean("DirectorFinanciero", Empleados.class);
		
		System.out.println(empleado.GetTareas());
		System.out.println(empleado.GetInforme());*/
		
		
		DirectorFinanciero empleado=Contexto.getBean("DirectorFinanciero", DirectorFinanciero.class);
		
		System.out.println("email del director: " + empleado.getEmail());
		
		System.out.println("Nombre empresa: " + empleado.getEmail());
		
	
	Contexto.close(); 
	
	
	
	}
	
	
}
