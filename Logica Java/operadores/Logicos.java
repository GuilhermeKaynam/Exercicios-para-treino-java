package operadores;

import java.util.Scanner;

public class Logicos {
	
	public static void main(String[] args) {
		
		  Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite o salário: ");
	        double salario = scanner.nextDouble();
	        
	        System.out.print("Digite o abono: ");
	        double abono = scanner.nextDouble();
	        
	        double novosalario = salario + abono;
	        
	        System.out.printf("O novo salário é: %.2f%n", novosalario);
	        
	        scanner.close();
	}

}