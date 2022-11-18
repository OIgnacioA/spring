package co.com.ejercicio.spring.introduccion;

public class JefeEmpleado implements Empleados {
	
	
public JefeEmpleado(CreacionInformes informeNuevo) {
		InformeNuevo = informeNuevo;
	}

private CreacionInformes InformeNuevo; 
	
	@Override
	public String GetTareas() {
		// TODO Auto-generated method stub
		return "gestiono cosas de jefe";
	}

	@Override
	public String GetInforme() {
		// TODO Auto-generated method stub
		return "Informe presentado por el jefe con rectificaciones" + InformeNuevo.GetInforme();
	}

	
	
}
