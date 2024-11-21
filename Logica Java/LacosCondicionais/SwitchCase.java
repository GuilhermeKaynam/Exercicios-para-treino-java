package LacosCondicionais;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		int opcao; 
		String nome;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
        System.out.println("\n--Digite 1 para ver Indicação de um Livro--");
        System.out.println("--Digite 2 para ler uma Frase Motivacional--");
        System.out.println("--Digite 3 para receber uma Indicação de música--");
        opcao = leia.nextInt();
        
        switch (opcao) {
        
        case 1:
        	
        	System.out.println("Digite um genero de filme: ");
        	String genero = leia.next().toUpperCase();

        	if (genero.equals("TERROR")) {
        	    System.out.println("Filme: O Iluminado");
        	} else if (genero.equals("COMEDIA")) {
        	    System.out.println("Filme: Se beber não case");
        	} else if (genero.equals("DRAMA")) {
        	    System.out.println("Filme: A procura da felicidade");
        	} else {
        	    System.out.println("Genero não encontrado");
        	}
        	break;

        	
        case 2: 
        	System.out.println("Livro: Senhor dos aneis");
        	break;
        	
        case 3:
        	System.out.println("Incicação de música: Só preciso de dinheiro pra comprar um mé");  
        	break;
        	
        	default:
        		System.out.println("Opção invalida");
        	break; 
        }   
	}
}
