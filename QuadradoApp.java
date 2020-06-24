package matematicaBasica;

import java.util.Scanner;

public class QuadradoApp {

	public static void main(String[] args) {
		
		Scanner sr= new Scanner(System.in);
		System.out.print("Digite um numero para calcular a area do quadrado");
		int teclado= sr.nextInt();
		
		String pontinhos = "*        *";
		for (int i = 0; i < teclado; i++) {
			if (i == 0) {
				System.out.println("**********");

			} else if (i == teclado) {
				System.out.print("**********");

			} else {
				System.out.println(pontinhos.substring(0));
			}

		}

		
		
		System.out.print("Area do quadrado = b*b = " + teclado*teclado);
	}

}
