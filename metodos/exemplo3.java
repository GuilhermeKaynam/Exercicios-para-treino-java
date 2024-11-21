package metodos;

import java.util.Scanner;

public class exemplo3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite sua idade (em anos ou meses): ");
		double idade = scanner.nextDouble();
		String classificacao = classificarIdade(idade);
		System.out.println(classificacao);
	}

	public static String classificarIdade(double idade) {
		if (idade <= 0) {
			return "Ainda não nasceu";
		} else if (idade > 0 && idade <= 1) {
			int meses = (int) (idade * 12); // Converte anos para meses
			if (meses == 1) {
				return "Bebê de 1 mês";
			} else {
				return "Bebê de " + meses + " meses";
			}
		} else if (idade < 13) { // De 1 a 12 anos
			return "Criança";
		} else if (idade < 18) { // De 13 a 17 anos
			return "Adolescente";
		} else if (idade < 65) { // De 18 a 64 anos
			return "Adulto";
		} else { // 65 anos ou mais
			return "Idoso";
		}
	}

}
