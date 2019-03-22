package me.mpedrotti.io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * java.io 
 */
public class Write {

	public static void main(String[] args) throws IOException {
		
		/**
		 * Saída
		 * OutputStreamWriter, BufferWriter extends Writer
		 * 
		 */	
		FileOutputStream stream = new FileOutputStream("write.txt");

		/**
		 * Escrita
		 * FileOutputStream extends OutputStream
		 */	

		Writer writer = new OutputStreamWriter(stream);
		
		BufferedWriter buffer = new BufferedWriter(writer);
		
		buffer.write("Teste");
		buffer.newLine();
		buffer.write("Teste2");
		
		buffer.close();
	}
}
