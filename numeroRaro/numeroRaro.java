package numeroRaro;

import java.util.Scanner;

public class numeroRaro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner t = new Scanner(System.in);

		int opc, num, num2;
		do {
			System.out.println(" B I E N V E N I D O / A");

			System.out.println(" 1.- Buscar número raro");
			System.out.println(" 2.- Salir");

			System.out.println("Escoga una opción");
			opc = t.nextInt();
			switch (opc) {
			case 1:
				System.out.println(" *) Ingrese un número entero:");
				num = t.nextInt();

				System.out.println("**) Ingrese un número entero:");
				num2 = t.nextInt();
				raro(num, num2);
				break;
			case 2:
				System.out.println("Gracias por preferirnos");

				break;
			}

		} while (opc != 2);
	}

	public static int raro(int num, int num2) {
		int num3 = 3;

		int opc = num3 * (num) + num2;
		System.out.println("El número raro es:" + opc);
		return opc;
	}
}
