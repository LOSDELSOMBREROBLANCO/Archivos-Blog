package numeroRaro;

import java.util.Scanner;

public class numeroRaro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner t = new Scanner(System.in);

		int opc, num, num2;
		do {
			System.out.println(" B I E N V E N I D O / A");

			System.out.println(" 1.- Buscar n�mero raro");
			System.out.println(" 2.- Salir");

			System.out.println("Escoga una opci�n");
			opc = t.nextInt();
			switch (opc) {
			case 1:
				System.out.println(" *) Ingrese un n�mero entero:");
				num = t.nextInt();

				System.out.println("**) Ingrese un n�mero entero:");
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
		System.out.println("El n�mero raro es:" + opc);
		return opc;
	}
}
