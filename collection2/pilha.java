package collection2;

import java.util.Iterator;
import java.util.Stack;

public class pilha {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<String>();

		pilha.push("Prato Verde");
		pilha.push("Prato Azul");
		pilha.push("Prato Branco");
		pilha.push("Prato Amarelo");
		pilha.push("Prato Vermelho");

		System.out.println("\nElemento da Pilha: " + pilha);

		System.out.println("\nRetirar elemento: " + pilha.pop());

		System.out.println("\nElemento da Pilha: " + pilha);
		
		pilha.push("Prato Roxo");
		
		System.out.println("\nElemento da pilha: " + pilha);
		
		Iterator<String> iterator = pilha.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}

	}

}
