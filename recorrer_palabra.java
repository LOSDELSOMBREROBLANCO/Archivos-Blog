package SOMBRERO_BLACNO;
import java.util.Scanner;
public class Recorrer_palabras {
public static void main(String []args) {
	Scanner t =new Scanner(System.in);
	System.out.println("LOS DEL SOMBRERO BLANCO\n"
			+ "\n1) Recorrer palabra a la derecha\n"
			+ "2) Recorrer palabras a la izquierda\n"
			+ "3) Salir\n");
	
			char carac[]= {'P','R','O','G','R','A','M','A','C','I','O','N'},aux;
			int i, opc,longitud;
			longitud=carac.length;	
			do {
			System.out.println("La palabra es: ");
			for(i=0;i<longitud;i++)
				System.out.print(carac[i]+" ");
			System.out.println();
			System.out.println("Que deseas hacer: ");
			opc=t.nextInt();
			switch(opc) {
			case 1:
				//se respalda el ultimo caracter 
				aux=carac[longitud-1];
				for(i=longitud-1;i>0;i--)
					carac[i]=carac[i-1];
					//en la celda cero se coloca el caracter respaldo
					carac[0]=aux;
					break;
			case 2:
				//se respalda el primer caracter aux=cara[0]
				aux=carac[0];
				for(i=0;i<longitud-1;i++)
					carac[i]=carac[i+1];
					//en la ultima celda se coloca el caracter respaldo
					carac[longitud-1]=aux;
			}
			}while(opc!=3);
}}
