package numeroAbundante;

import java.util.Scanner;

public class numeroAbundante {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int opc = 0;
		do {
			System.out.println(" B I E N V E N I D O / A");
			System.out.println(" 1.- Verificar si un número es abundante");
			System.out.println(" 2.- Salir");
			System.out.println("Escoga una opción:");
			opc = t.nextInt();
			switch (opc) {
			case 1:
				try {
					System.out.print("Ingrese un número:");
					int num = t.nextInt();
					int aux = 0;
					System.out.println("Los divisiores del número son:");
					for (int i = 1; i < num; i++) {

						if (num % i == 0) {
							System.out.println(i);
							aux = aux + i;
						}
					}
					System.out.println("La suma de todos los divisores es:" + aux);
					if (aux > num) {
						System.out.println("Es un número abundante");
						System.out.println();

					} else {
						System.out.println("No es un número abundante");
						System.out.println();
					}
					break;
					
				} catch (Exception e) {
					System.out.println("El programa falló");
				}

			case 2:
				System.out.println("Gracias por preferirnos");
				break;
			default:
				try {
					if (opc != 1 || opc != 2)
						System.out.println("OPCIÓN INCORRECTA" + "---------" + "ESCOGA BIEN LA OPCIÓN");
					System.out.println();
					break;
				}catch (Exception e) {
					System.out.println("El programa falló");
				}
			}

		} while (opc != 2);

	}
}
