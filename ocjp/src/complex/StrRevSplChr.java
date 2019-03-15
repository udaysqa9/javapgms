package complex;

import utitlites.Generics;

//Reverse a string without changing the order of special characters
public class StrRevSplChr {

	public static void main(String[] args) {

		String s= "hi,how are you?";
		
		System.out.println("******");
		System.out.println(Generics.getReverseWithSpchars(s.toCharArray()));

		
	}
		
	
}
