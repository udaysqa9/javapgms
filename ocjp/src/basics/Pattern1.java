package basics;

import java.util.HashMap;

public class Pattern1 {

	public static void main(String[] args) {

	
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int k=6;k>1;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
