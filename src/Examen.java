import java.util.*;
public class Examen {
static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		
		System.out.println("Haber guapo que cadena quieres");
		String palabra = sc.next();
		
		Invertir pedir = new Invertir (palabra);
		
		System.out.println(pedir.devuCadena());
		
		
		
	}

}

