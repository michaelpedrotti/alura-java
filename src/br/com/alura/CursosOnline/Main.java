package br.com.alura.CursosOnline;

import java.util.*;


public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		Curso c = new Curso("Java 8", "Paulo Silveira");
		
		c.add(new Aula("ArrayLists", 21));
        c.add(new Aula("Lambdas", 20));
        c.add(new Aula("Collections", 15));
		
		
		c.matricula(new Aluno("Rodrigo Turini", 1));
		c.matricula(new Aluno("Alberto Souza", 2));
		c.matricula(new Aluno("Nico Steppat", 3));
		c.matricula(new Aluno("Sergio Lopes", 4));
		c.matricula(new Aluno("Renan Saggio", 5));
		c.matricula(new Aluno("Mauricio Aniche", 6));
		
		/*
		c.getAlunos().forEach((Aluno a) -> {
			
			System.out.println(a);
		});
		
		System.out.println(c);*/
		
		
		//Set<String> collection = Collections.emptySet();
		//collection.add("Michael Pedrotti");
		
		//Collections.emptyList();
		//Collections.emptyMap();
		
		// isMatriculado executa contains dentro da collection que compara cada object, ou seja, 
		// nesse caso a posição de mémoria ( hashCode )
		// Então são dois objectos diferentes new Object() == new Object()
		// Para conseguirmos o contains executa o equals de cada Object. Esse por sua vez
		// executa o hashCode(), então modificamos para o Aluno.hashCode() pegar o 
		// String.hashCode() do atributo Aluno.nome
		/*
		Aluno a = new Aluno("Rodrigo Turini", 1);

		System.out.println(c.isMatriculado(a) ? "Sim" : "Não");
		
		// Java 5 - Iterators
		// Não existia o for ou forEach
		
		Iterator<Aluno> i = c.getAlunos().iterator();
		while(i.hasNext()){
			
			System.out.println(i.next());
		}
		*/
		
		Aluno a = c.searchMatricula(5);
		
		System.err.println(a);
		
	}
}