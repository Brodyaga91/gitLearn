package Pack1;

import java.util.ArrayList;
import java.util.HashMap;

public class Maps {
	public static void main(String[] args) {
		ArrayList<String> authorList=new ArrayList<>();
		authorList.add("Tolstoy");
		authorList.add("Chehov");
		authorList.add("Pushkin");
		System.out.println(authorList.get(1));
		HashMap<String, ArrayList> autor=new HashMap<>();
		autor.put("Autor", authorList);
		String a= autor.toString();
		System.out.println(autor.get("Autor").get(1));
	}

}

