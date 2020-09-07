package Strings;

import java.text.Normalizer;
import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		String frase;
		System.out.println("\t\tLOS DEL SOMBRERO BLANCO ");
		System.out.println("\t\t*********************** ");
		System.out.println("Comprobar si una frase o palabra es un Palindromo");
		System.out.println("Ingrese el mensaje");
		frase = t.nextLine();
		frase = Normalizer.normalize(frase, Normalizer.Form.NFD);
		frase = frase.replaceAll("\\s","").toLowerCase().replaceAll("[\\W]|_", "");
		if(palindromo(frase))
			System.out.println("\n\tEl mensaje es un Palindromo");
		else
			System.out.println("\\n\tEl mensaje no es un Palindromo");
	
		}
	
	public static boolean palindromo(String frase) {
		int cont = frase.length()-1;
		for (int i = 0; i < frase.length(); i++) {
			char in = frase.charAt(i);
			char fn = frase.charAt(cont);
			if ( in != fn) {
				return false;
			}
			cont--;
		}
		return true;
	}

}
