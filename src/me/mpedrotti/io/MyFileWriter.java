package me.mpedrotti.io;

import java.io.FileWriter;
import java.io.IOException;


/**
 * java.io 
 */
public class MyFileWriter {

	public static void main(String[] args) throws IOException {
		
		FileWriter writer = new FileWriter("write.txt");

		writer.write("Teste" + System.lineSeparator());	
		writer.write("Teste2" + System.lineSeparator());
		
		writer.close();
	}
}
