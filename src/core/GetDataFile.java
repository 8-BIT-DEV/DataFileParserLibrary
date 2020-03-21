package core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GetDataFile {
	
	public static String[] getData(String path) {
		
		String[] data = {""};
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(path + ".data"));
			
			String temp = "";
			String builder = "";
			
			while((temp = reader.readLine()) != null) {
				builder += temp;
			}
			
			data = builder.split("(?!^)");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return data;
		
	}
	
}
