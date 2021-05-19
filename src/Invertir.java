
public class Invertir {

	private String cadena;
	
	public  Invertir() {
		
	}
	
	public  Invertir(String cadena) {
		this.cadena = cadena;
	}
	public String devuCadena () {
		
		String cadenaFinal = "";
		
		if(cadena.equals("")) {
			System.out.println("Cadena vacia");
		}else {
			char []  caCarac = cadena.toCharArray();
			for (int i = caCarac.length-1; i>=0; i--){
				cadenaFinal = cadenaFinal + caCarac[i];
			}
		}
		
	return cadenaFinal;
	}
	
}
