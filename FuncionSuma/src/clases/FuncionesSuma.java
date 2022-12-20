/** Crear una función con tres parámetros que sean números que se suman entre sí **/

package clases;

import java.util.Scanner;

public class FuncionesSuma {
	
	   public static double sumar(double num1, double num2, double num3) {
		      double resultado;
		      resultado = num1 + num2 + num3;
		      return resultado;
	}
	 
	     public static void main(String[] args) {
	    	 Scanner teclado = new Scanner(System.in);
	    	 double valor1, valor2, valor3, resultado;
	    	 
	    	 System.out.println("Introduce Un primer Valor");
	    	 valor1 = teclado.nextDouble();
	    	 
	    	 System.out.println("Introduce Un segundo Valor");
	    	 valor2 = teclado.nextDouble();
	    	 
	    	 System.out.println("Introduce Un tercer Valor");
	    	 valor3 = teclado.nextDouble();
	    	 
	    	 resultado = sumar ( valor1, valor2, valor3);
	    	 
	    	 System.out.println("El resultado de la suma Es: " + resultado);
	    	 	
		}
			
		}
