package PatronDiseñoFabrica;

public class Fabrica {

	
	public Tipo getRaza (String raza) {
		
		
		if (raza == "golden") {
			
			return new Perro(); 
			
		}else if (raza == "borneo") {
			
			return new Gato(); 
		}
		
		return null; 
		
	}
	
	
	
}
