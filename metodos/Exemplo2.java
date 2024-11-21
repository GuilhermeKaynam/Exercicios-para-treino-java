package metodos;

public class Exemplo2 {

	public static void main(String[] args) {
		int resul;
		mensagem();
		somarNumeros(5, 6);

	}

	public static void mensagem() {
		System.out.println("metodo sem retorno (void)");
	}

	public static void somarNumeros(int a, int b) {
		int resultado = a + b;
		System.out.println("a soma é: " + resultado);
	}

}
