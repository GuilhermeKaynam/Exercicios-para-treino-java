package objeto;

public class menu {

	public static void main(String[] args) {

		Gato gato1 = new Gato(); // criando um objeto
		Gato gato2 = new Gato();
		
		System.out.println("\nCadastre Seu Gato:");
		gato1.nome = "Mohamed"; // usando o objeto criado já
		gato1.idade = 1;
		gato1.raca = "Vira Lata";
		gato1.cor = "Colorido";

		gato1.Imprimir();
		
		System.out.println("\nO que o gato1 está fazendo? ");
		
		gato1.Dormir();
		
		// Gato 2
		
		System.out.println("\nCadastre Seu Gato:");
		gato2.nome = "Salut"; // usando o objeto criado já
		gato2.idade = 3;
		gato2.raca = "Pitbull";
		gato2.cor = "Verde";

		gato2.Imprimir();
		
		System.out.println("\nO que o gato2 está fazendo? ");
		
		gato2.Miar();
		gato2.Comer();

	}

}
