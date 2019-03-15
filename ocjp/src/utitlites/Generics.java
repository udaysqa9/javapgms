package utitlites;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import org.apache.commons.compress.compressors.FileNameUtil;

public class Generics {

	/**
	 * @author udaykumar.h
	 */
	public static String readFiles(String path) {

		File fis = new File(path);
		File[] lof = fis.listFiles();
		String files="";
		for(File f : lof) {
			files+=" "+f.getName();
		}

		return files;

	}
/**
 * 
 * @param fileNames
 * @return String of fileNames
 */
	public static HashMap<String,Integer>  getFileExtensions(String fileNames) {

		HashMap<String,Integer> hmap = new HashMap<String,Integer>();
		String[] x = fileNames.split(" ");

		for(String k : x) {
			String gem = k.split("\\.")[1];
			if(hmap.containsKey(gem)) {
				hmap.put(gem, hmap.get(gem)+1);
			}
			else {
				hmap.put(gem, 1);
			}
		}
		return hmap;
	}

	public static int findDifference(int a, int b) {
		int diff=0;
		if(a>b) {
			diff=a-b;
		}
		else {
			diff = b-a;
		}
		return diff;
	}

	public static int[] sortIntArray(int arr[]) {
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}

			}
		}

		return arr;

	}

	public static String getReverseWithSpchars(char[] a) {
		String revStr="";
		int l = 0;
		int r = a.length-1;
		while(l<r) {
			if(!Character.isAlphabetic(a[l])) {
				l++;
			}
			else if(!Character.isAlphabetic(a[r])) {
				r--;
			}
			else {
				char temp = a[l];
				a[l]=a[r];
				a[r]=temp;
				l++;
				r--;
			}
		}
		
		revStr = new String(a);

		
		return revStr;	
	}

	public static void startGame() {
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println("Guess a Number from 1-100");
		Scanner sn = new Scanner(System.in);
		int gn=sn.nextInt();
		int attempt=2;
		al.add(gn);
		Random rdn = new Random();
		int randomNum=rdn.nextInt(100);
		while(gn!=randomNum && attempt<=10){
			attempt++;
			System.out.println("PREVIOUS GUESSES: "+al);
			System.out.println(randomNum);
			if(findDifference(gn,randomNum)>20) {
				System.out.println("Wrong !! Last Guess was too low!");
			}
			else {
				System.out.println("Wrong !! Last Guess was too high");

			}
			System.out.println("Guess a Number from 1-100");
			sn = new Scanner(System.in);
			gn=sn.nextInt();
			al.add(gn);
		}
		if(gn==randomNum && attempt<=10) {
			System.out.println("PREVIOUS GUESSES: "+al);
			System.out.println("Congratulations !! You have guessED the correct number!!");
		}
		else if(attempt >= 10) {
			System.out.println("PREVIOUS GUESSES: "+al);
			System.out.println("New Game Started!!");
			startGame();
		}
	}

}
