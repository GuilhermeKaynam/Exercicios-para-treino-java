package metodos;

public class Exemplo1 {

	public static void main(String[] args) {
		
		int resul, soma=2;
		
		resul = somar(4,6);
		
		soma = soma + resul;
		
		System.out.println(resul);
		System.out.println("Soma do resultado de retorno: " + soma);
	}
	
	public static int somar(int numero1, int numero2) {
		return numero1 + numero2;
		
		
	}

}
