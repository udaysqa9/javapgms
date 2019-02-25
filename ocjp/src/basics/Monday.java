package basics;

import java.util.Arrays;

import utitlites.Generics;

public class Monday {

	public static void main(String[] args) {
		
		String s ="hi this is osr";
		
		//Comple reverse
	  /*	StringBuilder sb = new StringBuilder(s);
		s=sb.reverse().toString();
        System.out.println(s);*/
		
		//Reverse the words 
		/*String[] sarr = s.split(" ");
		String s1="";
		for(int i=sarr.length-1;i>=0;i--)
		{
			s1+=sarr[i] +" ";
		}
		System.out.println(s1);*/
		
		int[] arr1 = {4,1,6,2,0,9,2,-1};
		System.out.println(Generics.sortIntArray(arr1));
		
	}
}
