package complex;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class FileReading {

	public static void main(String[] args) throws Exception {
		
	//	FileInputStream fis = new FileInputStream(".\\sample.txt");
		
		
		Scanner sin = new Scanner(new FileReader(".\\sample.txt"));
		
		StringBuilder sb = new StringBuilder();
		
		while(sin.hasNext()) {
			sb.append(sin.next());
		
	
		}
		sin.close();
		
		System.out.println(sb.toString());
	
		
		
		


	}
}
