package me.mpedrotti.java8;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		
		Curso c = new Curso("Java 8", "Paulo Silveira");
		
		c.add(new Aula("ArrayLists", 21));
        c.add(new Aula("Lambdas", 20));
        c.add(new Aula("Collections", 15));
        
        
		System.out.println(c.getAll());
		
		System.out.println(c.getTempoTotal());
		
		System.out.println(c);
		
		// Colections:[set, list, queue, deque]
		
		
	}
}
