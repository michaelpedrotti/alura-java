package me.mpedrotti.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * java.io 
 * 
 * @see MyScanner.java
 */
public class MyProperties {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Properties props = new Properties();        
		props.load(new FileReader("conf.properties"));

		System.out.format("Usuário: %s%nSenha: %s%nDomínio: %s%n", 
			props.getProperty("user"), 
			props.getProperty("pass"), 
			props.getProperty("domain")
		);
	}
}
