package me.mpedrotti.java8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Java: Dominando as Collections
 * Aula: 05
 */
public class MyHashSet {

	public static void main(String[] args) {
		
		// Conjuntos não são sequenciais, diferente das listas
		Set<String> collection = new HashSet<String>();
		
		// CTRL + SHIFT + I
		//Collection<String> hash = HashSet<String>(); 	
		
		collection.add("Rodrigo Turini");
		collection.add("Alberto Souza");
		collection.add("Nico Steppat");
		collection.add("Sergio Lopes");
		collection.add("Renan Saggio");
		collection.add("Mauricio Aniche");
        
        
        System.out.println(collection);
        
        // Conjunto não aceitam elementos repetidos
        collection.add("Alberto Souza");
        
        collection.forEach((String name) -> {
        	System.out.println(name);
        });
        
        
        System.out.println(collection.contains("Paulo Silveira") ? "Sim" : "Não");
        
        collection.remove("Sergio Lopes");
        
        List<String> list = new ArrayList<String>(collection);
        
        
        System.out.println(list);
        

	}
}