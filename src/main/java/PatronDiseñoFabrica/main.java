package PatronDiseñoFabrica;

public class main {

	public static void main(String[] args) {
		
		Fabrica fabrica = new Fabrica();
		
		Tipo Tip = fabrica.getRaza("golden");
	    
		Tip.Raza(); 
		

	}

}
