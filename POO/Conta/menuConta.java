package Conta;

public class menuConta {

	public static void main(String[] args) {
	//	titular | numero_conta | agencia | tipo | saldo
		
		Conta conta = new Conta();
		
		Conta conta2 = new Conta();
		
		conta.setTitular("Guilherme");
		
		System.out.println("Guilherme");
		
		conta.Imprimir();
		conta2.Imprimir();
		
	
	}

}
