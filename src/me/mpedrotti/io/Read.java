package me.mpedrotti.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * java.io 
 */
public class Read {

	public static void main(String[] args) throws IOException {
		
		/**
		 * Streams lêem bytes...
		 * FileInputStream extends InputStream
		 */
		//FileInputStream file = new FileInputStream("read.txt");
		
		// Mais generico 
		InputStream file = new FileInputStream("read.txt");
		
		/**
		 * Readers lêem caracteres...
		 * InputStreamReader, BufferedStreamReader extends Reader
		 */
		InputStreamReader reader = new InputStreamReader(file);
		BufferedReader buffer = new BufferedReader(reader);
		
		
		String line;
				
		while((line = buffer.readLine()) != null){
			
			System.out.println(line);
		}
		
		// Já faz o close do stream
		buffer.close();		
	}
}
