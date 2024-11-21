package LacosCondicionais;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		   float nota1, nota2, nota3, nota4, media;
	        
	        System.out.println("Nota 1: ");
	        nota1 = scanner.nextFloat();
	        
	        System.out.println("Nota 2: ");
	        nota2 = scanner.nextFloat();
	        
	        media = (nota1 + nota2);
	        
	        if (media >= 5) {
	        	System.out.println("parabens você foi aprovado!");
	        } else { 
	        	System.out.println("Reprovado, estude mais!");
	        }
	        System.out.println("media final: " + media);
	        
	        scanner.close();
	}

}
