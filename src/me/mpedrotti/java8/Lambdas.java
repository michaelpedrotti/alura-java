package me.mpedrotti.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;


/*class ComparatorBySize implements Comparator<String>{

	@Override
	public int compare(String str1, String str2) {
		
		if(str1.length() < str2.length()){
			return -1;
		}
		else if(str1.length() > str2.length()){
			return 1;
		}
		else {
			return 0;
		}
	}
}*/

/**
 * Implementação de Interfaces funcionais e Lambdas no Java 8
 * 
 * A interface funcional possui um único método abstrato. Pode possuir outros métodos
 * desde que sejam default ou static
 * 
 */
public class Lambdas {

	public static void main(String[] args) {
		
		List<String> words = new ArrayList<String>();
		
		words.add("Alura");
		words.add("Editora cada do código");
		words.add("Caelum");
		
		// Comparable ( A-Z )
		//Collections.sort(words);
		
		//Collections.sort(words, new ComparatorBySize());
		
		// Java 8
		// default method - Interfaces com corpo, ou seja, possuem métodos próprios
		//words.sort(new ComparatorBySize());
	
		// Java 8 - Lambdas - classe anônima
		/*
		words.sort(new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {				
				if(str1.length() < str2.length()) return -1;
				else if(str1.length() > str2.length()) return 1;
				else return 0;
			}
		});
		*/
		
		// Java 8 - Lambdas -função anônima
		// Inteface funcional = somente tem um método (Comparator)
		// Então, o compilador sabe que deve executar esse único método da interface
		// Lambda é convertido para uma interface funcional
		words.sort((String str1, String str2) -> {				
			return Integer.compare(str1.length(), str2.length());
		});
		
		/*
		// Lambda de uma só linha não precisa do return
		words.sort((String str1, String str2) ->
			Integer.compare(str1.length(), str2.length())
		);
		*/
		
		System.out.println(words);
		
		/*
		// Java 8 - Lambdas - classe anônima
		words.forEach(new Consumer<String>(){
			@Override
			public void accept(String word) {
				System.out.println(word);	
			}
		});
		*/
		
		// Java 8 - Lambdas - Interface funcional (java.util.function.Consumer)
		Consumer<String> consumer = (String str) -> { 
			System.out.println(str);
		};
		words.forEach(consumer);
		
		// Java 8 - Lambdas -função anônima
		words.forEach((String word) -> {
			System.out.println(word);
		});
		
		// Com somente uma linha pode remover as chaves
		//words.forEach((String word) -> System.out.println(word));
		
		
		// method reference - métodos auxiliares no java.util
		// metodos default pode ser estáticos
		// Comparador compara strings por tamanho
		/*
		Function<String, Integer> fn = (String str) -> { return str.length(); };
		words.sort(Comparator.comparing(fn));
		*/
		// Por lambda
		words.sort(Comparator.comparing( (String str) -> str.length()) );
		
		// lambda
		words.sort(Comparator.comparing(String::length));
		
		Consumer<String> print = System.out::println;
		words.forEach(print);
		
		words.forEach(System.out::println);
	}
}
