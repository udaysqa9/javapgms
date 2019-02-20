package utitlites;

import java.io.File;
import java.nio.file.Files;
import java.util.HashMap;

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


}
