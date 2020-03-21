package data;

import java.util.ArrayList;

public class DataParser {
	
	public static ArrayList<Key> parseData(String[] data) {
		
		String tok = "";
		String currentData = "";
		int state = 0;
		boolean isNonStatement = false;
		
		Key keyBuilder = new Key();
		String keyName = "";
		ArrayList<Key> Keys = new ArrayList<Key>();
		
		for(int i = 0; i < data.length; i++) {
			
			tok += data[i];
			//System.out.println(tok);
			
			if(tok.equals("\n")) {
				tok = "";
			}
			
			if(tok.equals(" ") && state == 0 && isNonStatement == false) {
				tok = "";
			}
			
			if(tok.equals("@") && state == 0 && isNonStatement == false) {
				tok = "";
				state = 1;
			} else if(tok.equals(" ") && state == 1 && isNonStatement == false) {
				keyBuilder.setName(currentData);
				tok = "";
				currentData = "";
				state = 0;
			}
			
			if(tok.equals("\"") && isNonStatement == false && state == 0) {
				tok = "";
				isNonStatement = true;
			} else if(tok.equals("\"") && isNonStatement == true && state == 0) {
				keyBuilder.addValue(currentData);
				tok = "";
				currentData = "";
				isNonStatement = false;
			}
			
			if(state == 1 || isNonStatement == true) {
				currentData += tok;
				tok = "";
			}
			
			if(tok.equals(";") && state == 0 && isNonStatement == false) {
				Keys.add(keyBuilder);
				keyBuilder = new Key();
				tok = "";
			}
			
		}
		
		for(int i = 0; i < Keys.size(); i++) {
			System.out.println("Name:" + Keys.get(i).getName() + " Values:" + Keys.get(i).getValue());
		}
		
		return Keys;
		
	}
	
}
