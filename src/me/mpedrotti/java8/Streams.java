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
		
		
		List<MyCurso> cursos = new ArrayList<MyCurso>();
		cursos.add(new MyCurso("Python", 45));
		cursos.add(new MyCurso("JavaScript", 150));
		cursos.add(new MyCurso("Java 8", 113));
		cursos.add(new MyCurso("C", 55));
		
		
		cursos.sort(Comparator.comparing( (MyCurso c) -> {
			return c.getAlunos();
		}));

		cursos.forEach( (MyCurso c) -> { 
			System.out.println(c.getNome());
		});
		
		//cursos.sort(Comparator.comparing(Curso::getAlunos));
		//cursos.forEach(System.out::println);
		
		System.out.println("----");
		
		// Quais cursos possuem mais de 100 alunos
		cursos.stream()
			.filter( (MyCurso c) -> { return c.getAlunos() >= 100; })
			.forEach( (MyCurso c) -> {  System.out.println(c.getNome()); });
		
		System.out.println("----");
		
		cursos.stream()
			.filter( (MyCurso c) -> { return c.getAlunos() >= 100; })
			.map( (MyCurso c) -> {  return c.getAlunos(); });
		
		System.out.println("----");
	}
}