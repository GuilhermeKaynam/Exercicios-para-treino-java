package LacosCondicionais;

import java.util.Scanner;

public class IfEncadeado {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		   float nota1, nota2, nota3, nota4, media;
	        
	        System.out.println("Nota 1: ");
	        nota1 = scanner.nextFloat();
	        
	        System.out.println("Nota 2: ");
	        nota2 = scanner.nextFloat();
	        
	        media = (nota1 + nota2) /2;
	        
	        if (media >= 6) {
	        	System.out.printf("parabens você foi aprovado!  %.2f" , media);
	        } else if (media >= 5) {
	        	System.out.printf("você ficou de recuperação! %.2f" , media);
	        }  
	        else { 
	        	System.out.println("Reprovado, estude mais!" + media);
	        }
	        
	        scanner.close();
	}

}

