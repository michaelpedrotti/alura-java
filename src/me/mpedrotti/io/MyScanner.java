package me.mpedrotti.io;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

/**
 * java.io 
 * 
 * @see MyPrintStream.java
 */
public class MyScanner {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(new File("contas.csv"));
		
		/*
		while(scanner.hasNextLine()){
			
			// NextLine retorna um String
			String[] columns = scanner.nextLine().split(",");
			System.out.println(Arrays.toString(columns));
		}
		*/
		
		/*
		// Interação por Lambda
		scanner.forEachRemaining( (String str) -> {
		
			String[] columns = scanner.nextLine().split(",");
			System.out.println(Arrays.toString(columns));
		});
		*/
		
		while(scanner.hasNextLine()){
			
			Scanner column = new Scanner(scanner.nextLine());
			// Máquina virtual leva em consideração o país, o separador do float esta em
			// padrão americano
			column.useLocale(Locale.US);
			column.useDelimiter(",");
					
			/* 
			 * String.format("%s", "Hello World"); 
			 * String.format(Locale.CANADA, "%f", 100.26);
			 * String.format(new Locale("pt", "BR"), "%f", 100.26);
			 */
			System.out.format("Tipo: %s, Agência: %04d, Conta: %08d, Nome: %s, Valor: %08.2f %n", 
				column.next(), 
				column.nextInt(), 
				column.nextInt(), 
				column.next(), 
				column.nextFloat()
			);

			column.close();
		}
		
				
		scanner.close();
	}
}