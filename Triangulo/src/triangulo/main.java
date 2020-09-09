package triangulo;

import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		
        Scanner s = new Scanner(System.in);
        System.out.println("T R I Á N G U L O");
        System.out.println("Ingrese el valor 1:");
        double num1  = Double.parseDouble(s.nextLine());
        System.out.println("Ingrese el valor 2:");
        double num2  = Double.parseDouble(s.nextLine());
        System.out.println("Ingrese el valor 3:");
        double num3  = Double.parseDouble(s.nextLine());
        Triangulo.triangulo(num1, num2, num3);
        
    }
  
	
}
