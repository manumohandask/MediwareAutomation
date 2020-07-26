package test1;

import java.io.IOException;

public class ReadSheetData {
	

	public static void main(String[] args) throws IOException {
		Excelread read = new Excelread();
		
		String val = read.getMapData("username");
		
		System.out.println("Value of the keyword (search) is- "+val);
 
	}

}
