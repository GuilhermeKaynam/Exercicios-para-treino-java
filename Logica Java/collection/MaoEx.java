package collection;

import java.util.HashMap;

public class MaoEx {

	public static void main(String[] args) {
	
		HashMap<Long , String> pessoa = new HashMap<>();
		
		pessoa.put(12345247890L, "Felipe");
		pessoa.put(1234367890L, "Guilherme");
		pessoa.put(1234567890L, "marco");
		
		System.out.println(pessoa);
		
		System.out.println(" " + pessoa.get(1234567890L));

	}

}
