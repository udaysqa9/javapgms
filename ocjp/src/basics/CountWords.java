package basics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountWords {

	public static void main(String[] args) {
		
		String s ="hi how are you sai hi uday";
		
		HashMap<String,Integer> hmap = new HashMap<String,Integer>();
		
		String[] wordsArr = s.split(" ");
		for(String g:wordsArr) {
			if(hmap.containsKey(g)) {
				hmap.put(g, hmap.get(g)+1);
			}
			else {
				hmap.put(g, 1);
			}
		}
		
//		System.out.println(hmap);
		
		 
		Iterator<Map.Entry<String, Integer>> itr =hmap.entrySet().iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String, Integer> x =itr.next();
			System.out.println(x.getKey());
			System.out.println(x.getValue());
			if(x.getKey().equals("uday")) {
				hmap.remove(x.getKey());
			}
		}
		
		
		
        
		
	}
}
