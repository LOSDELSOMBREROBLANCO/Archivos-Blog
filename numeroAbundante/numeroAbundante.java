package numeroAbundante;

import java.util.Scanner;

public class numeroAbundante {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int opc = 0;
		do {
			System.out.println(" B I E N V E N I D O / A");
			System.out.println(" 1.- Verificar si un n�mero es abundante");
			System.out.println(" 2.- Salir");
			System.out.println("Escoga una opci�n:");
			opc = t.nextInt();
			switch (opc) {
			case 1:
				try {
					System.out.print("Ingrese un n�mero:");
					int num = t.nextInt();
					int aux = 0;
					System.out.println("Los divisiores del n�mero son:");
					for (int i = 1; i < num; i++) {

						if (num % i == 0) {
							System.out.println(i);
							aux = aux + i;
						}
					}
					System.out.println("La suma de todos los divisores es:" + aux);
					if (aux > num) {
						System.out.println("Es un n�mero abundante");
						System.out.println();

					} else {
						System.out.println("No es un n�mero abundante");
						System.out.println();
					}
					break;
					
				} catch (Exception e) {
					System.out.println("El programa fall�");
				}

			case 2:
				System.out.println("Gracias por preferirnos");
				break;
			default:
				try {
					if (opc != 1 || opc != 2)
						System.out.println("OPCI�N INCORRECTA" + "---------" + "ESCOGA BIEN LA OPCI�N");
					System.out.println();
					break;
				}catch (Exception e) {
					System.out.println("El programa fall�");
				}
			}

		} while (opc != 2);

	}
}
