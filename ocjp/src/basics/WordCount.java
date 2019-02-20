package basics;

import java.util.HashMap;

public class WordCount {
	
	public static void main(String[] args) {
		
		String s1="hi.txt hi.txt hi.pdf how.jpeg are.pdf you.txt hi.jpeg";
		String[] arr = s1.split(" ");
		for(String sg:arr) {
			System.out.println(sg);
			String[] kd = sg.split(".");
		}
		
		HashMap<String,Integer> hmap = new HashMap<String,Integer>();
		String x="";
		for(String s:arr) {
			
			if(hmap.containsKey(s)) {
			 x = s.split("\\.")[1];
				hmap.put(x, hmap.get(x)+1);
			}
			else {
				hmap.put(x,1);
			}
			
		}
		
		System.out.println(hmap);
		
	}
	
	
	
			

}
