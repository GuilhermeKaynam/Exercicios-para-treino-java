package variaveis;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); // vai ter entrada de dados
		
		int idade;
		String nome;
		
		System.out.println("Entre com a sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Entre com a seu nome: ");
		leia.skip("\\r?");
		nome = leia.nextLine();
		
		System.out.println("Sua idade é: "+idade + "Seu nome é: "+nome + "seu nome é: "+nome.toUpperCase());
		
	}
}