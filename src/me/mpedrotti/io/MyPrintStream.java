package me.mpedrotti.io;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * java.io
 * PrintStream é mais antigo, antes das classes Readers e Writers
 * 
 *  @see MyFileWriter.java
 */
public class MyPrintStream {

	public static void main(String[] args) throws IOException {
		
		//PrintWriter writer = new PrintWriter("write.txt");
		PrintStream stream = new PrintStream("write.txt");
		
		stream.println("Hello World Again");	
		stream.close();
		
		
	}
}
