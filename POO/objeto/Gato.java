package objeto;

public class Gato {

	String nome;
	int idade;
	String cor;
	String raca;

	public void Miar() {
		System.out.println("Miauuuuuuu!!");
	}

	public void Comer() {
		System.out.println("Comento a ração Crec Crec Crec!!");
	}

	public void Dormir() {
		System.out.println("Dormindo ZzzZZzZzzZZ");
	}

	public void Imprimir() {
		System.out.println("\nNome: " + nome);
		System.out.println("\nIdade: " + idade);
		System.out.println("\nCor: " + cor);
		System.out.println("\nRaça: " + raca);
	}

}
