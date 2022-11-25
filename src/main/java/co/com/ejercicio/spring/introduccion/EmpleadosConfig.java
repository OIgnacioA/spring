package co.com.ejercicio.spring.introduccion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("co.com.ejercicio.spring.introduccion")
@PropertySource("classpath:datosEmpresa.propiedades")
public class EmpleadosConfig {


	// definir el bean para InformeFinancieroDptoCompras
	
	
	@Bean
	public CreacionInformeFinanciero informeFinancieroDeptoCompras() {//este es el id del bean (el nombre del bean)
		
		
		
		return new InformeFinancieroDptoCompras();
	}
	
	// definir el bean para Director e inyectar dependencias
	
	
	@Bean
	
	public Empleados DirectorFinanciero() {
		
		
		
		return new DirectorFinanciero(informeFinancieroDeptoCompras());
	}
	
	
}
