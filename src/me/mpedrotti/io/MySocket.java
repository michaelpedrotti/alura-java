package me.mpedrotti.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * java.io 
 * 
 * Aguarda inputs da aba Console e retorna o próprio input como output.
 * 
 * @see InOut.js
 * @TODO Ainda não terminada
 */
public class MySocket {

	public static void main(String[] args) throws IOException {
		
		Socket socket = new Socket();
		
		BufferedReader reader = new BufferedReader(
			new InputStreamReader(
				socket.getInputStream()
			)	
		);
		
		BufferedWriter writer = new BufferedWriter(
			new OutputStreamWriter(
				socket.getOutputStream()
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
		
		 // long fim = System.currentTimeMillis();
	}
}
