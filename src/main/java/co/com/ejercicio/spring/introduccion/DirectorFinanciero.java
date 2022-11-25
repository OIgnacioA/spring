package co.com.ejercicio.spring.introduccion;

import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleados {

	
	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
		InformeFinanciero = informeFinanciero;
	}


	public String getEmail() {
		return Email;
	}


	public String getNombreEmpresa() {
		return nombreEmpresa;
	}






	@Override
	public String GetTareas() {
		// TODO Auto-generated method stub
		return "gestion y direccion de operaciones financieras de una empresa";
	}

	@Override
	public String GetInforme() {
		// TODO Auto-generated method stub
		return InformeFinanciero.getInformeFinanciero();
	}

	private CreacionInformeFinanciero InformeFinanciero;
	
	@Value("${email}")
	private String Email;
	
	@Value("${nombreEmpresa}")
	private String nombreEmpresa;
	
}
