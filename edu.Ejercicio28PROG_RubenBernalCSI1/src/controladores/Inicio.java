/**
 * Ruben Bernal Ramos, CSI1
 */

package controladores;

import java.util.Scanner;

/**
 * Clase controladora de la aplicacion
 * @author rbr - 221124
 *
 */
public class Inicio {

	/**
	 * Metodo de entrada de la aplicacion
	 * rbr - 221124
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		int numero, total;
		Scanner sc = new Scanner(System.in);
		
		//Solicito al usuario el numero entero
		System.out.println("Introduzca un número entero: ");
		numero = sc.nextInt();
		
		//Realizo la suma de sus digitos
		total = sumaDigitos(numero);
		
		//Muestro el resultado por consola
		System.out.println("La suma de los digitos del numero " + numero + " es: " + total);

	}
	
	/**
	 * Metodo recursivo que sumara los digitos de un numero entero
	 * rbr - 221124
	 * @param numero
	 * @return numero
	 */
	public static int sumaDigitos(int numero) {
		//Caso base
		if(numero < 10) {
			return numero;
		}else {//Caso recursivo
			return (numero % 10) + sumaDigitos(numero / 10);
		}
	}

}
