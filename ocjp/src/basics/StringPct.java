package basics;

import java.util.HashMap;

public class StringPct {

	
	public static void main(String[] args) {
		
		HashMap<String,Integer> hmap = new HashMap<String,Integer>();
		
		
		String s1 ="hi.txt bye.txt abc.png bbc.png ccb.jpeg";
		
		
		
		String[] x = s1.split(" ");
		
		for(String k : x) {
			String gem = k.split("\\.")[1];
			if(hmap.containsKey(gem)) {
				hmap.put(gem, hmap.get(gem)+1);
			}
			else {
				hmap.put(gem, 1);
			}
		}
		
		System.out.println(hmap);
		
	}
}
