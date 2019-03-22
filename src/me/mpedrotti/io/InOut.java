package me.mpedrotti.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * java.io 
 * 
 * Aguarda inputs da aba Console e retorna o próprio input como output.
 * 
 * @see Read.java and Write.java 
 */
public class InOut {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(
			new InputStreamReader(
				System.in
			)	
		);
		
		
		BufferedWriter writer = new BufferedWriter(
			new OutputStreamWriter(
				System.out
			)
		);
		
		String line;
				
		while((line = reader.readLine()) != null){
			
			writer.write(line);
			writer.newLine();
			writer.flush();
		}
		
		writer.close();	
		reader.close();		
	}
}
