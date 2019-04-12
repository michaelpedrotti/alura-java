package me.mpedrotti.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyList {

	public static void main(String[] args) {
		
		/*List<String> list = new ArrayList<String>();
		list.add("Primeira");
		list.add("Segunda");
		list.add("Terceira");
		
		System.out.println(list);
		
		//list.remove(0);
		
		System.out.println(list);
		
		list.forEach((String str) -> {
			System.out.println(str);
		});
		
		//System.out.println(list.get(0));
		
		Collections.sort(list);
//		list.sort((String str1, String str2) -> {
//
//			return Integer.compare(str1.length(), str2.length());
//		});
		
		System.out.println(list);*/
		
        ArrayList<Aula> aulas = new ArrayList<Aula>();
        aulas.add(new Aula("ArrayLists", 21));
        aulas.add(new Aula("Lambdas", 20));
        aulas.add(new Aula("Collections", 15));

        
        System.out.println(aulas);
        // 1º Caso: implements Comparable
        // No caso de string internamento sort executa o String.compareTo()
        // No caso de Class te que informa que é um objeto comparavel através de uma
        // interface Comparable<Aula>, tera que implementar o compareTo
        Collections.sort(aulas);
        
        System.out.println(aulas);
        
        // 2º Caso: Comparator
        // Ordenando pelo tempo
        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
       
        System.out.println(aulas);
        
       // 3º Caso: Comparator interno em listas
        aulas.sort(Comparator.comparing(Aula::getTempo));
        
	}

}
