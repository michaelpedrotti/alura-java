package me.mpedrotti.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * java.io 
 * 
 * @see Read.java and Write.java
 */
public class Copy {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(
			new InputStreamReader(
				new FileInputStream("read.txt")
			)	
		);
		
		
		BufferedWriter writer = new BufferedWriter(
			new OutputStreamWriter(
				new FileOutputStream("write.txt")
			)
		);
		
		String line;
				
		while((line = reader.readLine()) != null){
			
			writer.write(line);
			writer.newLine();
		}
		
		writer.close();	
		reader.close();		
	}
}
