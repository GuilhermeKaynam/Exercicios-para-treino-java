package collection2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		Collections.addAll(fila, "Gabriel","Priscila","Kaue");
		
		System.out.println(fila);
		
		System.out.println("\nAdiocionar novo Elemento:" + fila.add("Guilherme"));
		
		System.out.println(fila);
		
		System.out.println("\nExibir o primeiro Elemento da fila " + fila.peek());
		System.out.println(fila);
		
		System.out.println("\nRemove Elemento" + fila.remove());
		System.out.println(fila);
	}

}
