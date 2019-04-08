package me.mpedrotti.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Filtragem de lita por Interface Stream
 *  
 */
public class Streams {

	public static void main(String[] args) {
		
		
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		
		cursos.sort(Comparator.comparing( (Curso c) -> {
			return c.getAlunos();
		}));

		cursos.forEach( (Curso c) -> { 
			System.out.println(c.getNome());
		});
		
		//cursos.sort(Comparator.comparing(Curso::getAlunos));
		//cursos.forEach(System.out::println);
		
		System.out.println("----");
		
		// Quais cursos possuem mais de 100 alunos
		cursos.stream()
			.filter( (Curso c) -> { return c.getAlunos() >= 100; })
			.forEach( (Curso c) -> {  System.out.println(c.getNome()); });
		
		System.out.println("----");
		
		cursos.stream()
			.filter( (Curso c) -> { return c.getAlunos() >= 100; })
			.map( (Curso c) -> {  return c.getAlunos(); });
		
		System.out.println("----");
	}
}