package unico;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		final int TOPE = 100;
		int contador = 0;
		int mult = 0;
		
		while (contador < TOPE) {
			if (contador % 7 == 0) {
				System.out.print(contador);
			}
			contador++;
		}
		
}
}