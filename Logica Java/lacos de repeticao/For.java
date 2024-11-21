package lacos.repeticao;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		   int numero, cont;

	        System.out.println("Digite o número desejado para calculo: ");
	        numero = scanner.nextInt();

	        for (cont = 1; cont <= 10; cont++) {
	            System.out.println(numero + " x " + cont + " = " + numero * cont);
		}
		
		scanner.close();
	}

}
