package triangulo;

public class Triangulo {
	public static void triangulo (double a, double b , double c){
	       
	       if (Math.round(c*100d) >= (Math.round(a*100d)+Math.round(b*100d))){
	           System.out.println("NO ES UN TRIÁNGULO.");
	       }
	       else if ((Math.pow(Math.round(c*100d), 2))== (Math.pow(Math.round(a*100d), 2)+ Math.pow(Math.round(b*100d), 2))){
	           System.out.println("ES UN TRIÁNGULO RECTANGULO.");
	       }
	       else if((Math.pow(Math.round(c*100d), 2))>(Math.pow(Math.round(a*100d), 2)+Math.pow(Math.round(b*100d), 2))){
	           System.out.println("ES UN TRIÁNGULO OBTUSÁNGULO.");
	       }
	       else if ((Math.pow(Math.round(c*100d), 2))<(Math.pow(Math.round(a*100d), 2)+Math.pow(Math.round(b*100d), 2))){
	            System.out.println("ES UN TRIÁNGULO ACUTÁNGULO.");
	       }
	       
	   }
}
