package co.com.ejercicio.spring.introduccion;

public class DirectorEmpleado implements Empleados {

	private CreacionInformes informeNuevo;
	
	//creacion de constructor que inyectala dependencia
	
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		
		
		this.informeNuevo=informeNuevo; 
		
	}
	
	@Override
	public String GetTareas() {
		// TODO Auto-generated method stub
		return "gestionar la Planilla de la empresa";
	}

	@Override
	public String GetInforme() {
		// TODO Auto-generated method stub
		return "Informe de Director" ;
	}

}
