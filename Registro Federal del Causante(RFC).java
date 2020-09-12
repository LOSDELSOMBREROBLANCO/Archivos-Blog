package ejercicio_1;
import java.util.Scanner;
public class reg_fed_de_causantes {
public static String rfc;
public static void main (String[]arg) {
	Scanner t= new Scanner(System.in);
	String nombre, dia, mes, anio;
	System.out.println("\tLOS DEL SOMBRERO BLANCO\n");

System.out.println("Nombre Completo: ");
nombre=t.nextLine();
System.out.println("Dia de Nacimiento: ");
dia=t.nextLine();
System.out.println("Mes de Nacimiento: ");
mes=t.nextLine();
System.out.println("Año de Nacimiento");
anio=t.nextLine();
//Convierte a mayusculas el nombre nombre=nombre.toUpperCase();
nombre=nombre.toUpperCase();
separacadenas(nombre);
digitomes(mes);
digitosanio(anio);
digitodia(dia);
System.out.println("Registro Feferal del Causante(RFC): "+rfc);
t.close();
}
//Metodo para concatenar las primeras dos letras del primero apellido
static void delpaterno(String x) {
	rfc=x.substring(0,2);
}
//Metodo para concatenar la primera letra del segundo apellido
static void delmaterno(String x) {
	rfc=rfc.concat(x.substring(0,1));
}
//Metodo para concatenar la letra del primer o segundo nombre
static void letranombre(String x,String y) {
	if(y.contentEquals("")){
		rfc=rfc.concat(x.substring(0,1));
	}
	else {
		if(x.equals("JOSE")||x.equals("MARIA"))
			rfc=rfc.concat(y.substring(0,1));
		else
			rfc=rfc.concat(x.substring(0,1));
	}
}
//Metodo para separar apellidos y nombres
static void separacadenas(String x) {
		int pos, esp=0,longitud;
		int lim1=0,lim2=0;
		String paterno="",materno="",nom1="",nom2="";
		char letra;
		//cuenta los espacios para separar cadenas
		pos=0;
		longitud=x.length();
		while (pos<longitud) {
			letra=x.charAt(pos);
			if(letra==' ') {
				esp++;
				if(esp==1) {
					paterno=x.substring(0,pos);
					lim1=pos;
				}
				else if(esp==2) {
					materno=x.substring(lim1+1,pos);
					lim2=pos;
				}
				else if(esp==3) {
					nom1=x.substring(lim2+1,pos);
					nom2=x.substring(pos+1,longitud);
				}
			}
			pos++;
		}
		if(esp==2) {
			nom1=x.substring(lim2+1,longitud);
		}
		delpaterno(paterno);
		delmaterno(materno);
		letranombre(nom1,nom2);
	}
//metodo para concatenar os dos ultimos caracteres del año
static void digitosanio(String a) {
rfc=rfc.concat(a.substring(2,4));
}
//Metodo para concatenar los digitos del mes
static void digitomes(String m) {
	int longitud;
	longitud=m.length();
	if (longitud <2) {
	rfc=rfc.concat("0");//Concatenar el 0
	rfc=rfc.concat(m);//concatenar el numero del mes
	}
	else {
		//concatenas los dos digitos del mes
		rfc=rfc.concat(m);}
	}
//metodo para concatenar digitos del dia
	static void digitodia(String d) {
		int longitud;
		longitud=d.length();
		if(longitud<2) {
			rfc=rfc.concat("0");//concatena el 0
			rfc=rfc.concat(d);//conctena el numero del dia
		}
		else {
			rfc=rfc.concat(d);//concatena el numero del dia
		}	
	}
}
