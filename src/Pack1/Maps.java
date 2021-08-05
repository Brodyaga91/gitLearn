package Pack1;

import java.util.HashMap;

public class Maps {
	public static void main(String[] args) {
		HashMap<Integer, String> autor=new HashMap<>();
		autor.put(1, "Tolstoy");
		autor.put(2, "Chehov");
		autor.put(3, "Pushkin");
		System.out.println(autor.get(2));
	}

}

