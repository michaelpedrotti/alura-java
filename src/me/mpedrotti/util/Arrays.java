package me.mpedrotti.util;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.alura.ByteBank.*;
//import br.com.alura.Util.Json;


public class Arrays {
		
	public static void main(String[] args) {
		
				
		// Array do tipo primitivo
		int[] arr1 = new int[3];// Inicializa cada posição com 0
		
		for(int i = 0; i < arr1.length; i++){
			
			arr1[i] = i* i;
		}
		
		//System.out.println("Array primitivo: " + Json.encode(arr1));
		
		// Modo Literal
		int[] arr2 = {1, 2, 3};
		//System.out.println("Array Modo Literal: " + Json.encode(arr2));
		
		// Array
		// tem tamanho fixo
		// é uma estrutura
		// guarda referências ou tipos primitivos
		// Array primitivo inicializa em 0 e referências em NULL
		// Acessar posição inválida gere exception ArrayIndexOutOfBoundException
		
		
		
		// Array de referências 

		ContaCorrente[] arr3 = new ContaCorrente[3];
		
		arr3[0] = new ContaCorrente(296, 662323);
		arr3[1] = new ContaCorrente(297, 662424);
		arr3[2] = new ContaCorrente(298, 662525);
		 
		System.out.println("Nomero da conta: " + arr3[1].getNumero() );
		//System.out.println("Object to json: " + Json.encode(arr3[0]));
		
		//----------------------------------------------------------------------
		// Conhecendo o java.util Java parte 6: Conhecendo o java.util | AULA 02
		// cast implicito: Transforma a classe para forma mais primitiva
		Conta[] arr4 = {	
			new ContaCorrente(296, 662323),
			new ContaPoupanca(298, 662525)
		};
		
		// "Type Cast" feito pois o array é do tipo mais primitivo Conta
		// cast explícito: Transforma a classe para forma menos primitiva
		ContaCorrente cc = (ContaCorrente)arr4[0];
		
		// Em caso de "Type Cast" errado arremeça a java.lang.ClassCastException
		// ContaCorrente cp = (ContaCorrente)arr[1];
		
		System.out.println(arr4[0].getAgencia());
		
		
		Object[] arr5 = {
				
			new ContaCorrente(296, 662323),
			new ContaPoupanca(298, 662525),
			new Cliente(),
			new Gerente()
		};
		
		Cliente client = (Cliente)arr5[2];
		client.setNome("Michael");
		
		System.out.println(client.getNome());
		
		/*for(int i =0; i < args.length; i++){
			
			System.out.println(args[i]);
		}*/
		
		/*ContaCollection collection = new ContaCollection();
		collection.add(new ContaCorrente(296, 662323));
		collection.add(new ContaPoupanca(298, 662525));
		
		System.out.println(collection.count());
		
		System.out.println(collection.getAt(0).getAgencia());*/
		
		///----------------------------------------------------------------------
		// Lista generics
		/*
		ArrayList list = new ArrayList();
		
		list.add(new ContaCorrente(296, 662323));
		list.add(new ContaPoupanca(298, 662525));
		
		System.out.println(list.size());
			
		System.out.println( ((ContaCorrente)list.get(0)).getAgencia()  );
		
		//list.remove(0);
		
		for(Object o : list){
			System.out.println(o);
		}
		*/
		//----------------------------------------------------------------------
		// Lista tipada
		/*
		ArrayList<Conta> list2 = new ArrayList<Conta>();
		list2.add(new Cliente());
		*/
		//----------------------------------------------------------------------
		// Métodos
		/*
		ArrayList list = new ArrayList();
		
		ContaCorrente cc = new ContaCorrente(296, 662323);
		list.add(cc);
		
		
		System.out.println(list.contains(cc));
		
		
		ContaCorrente conta = new ContaCorrente(296, 662323);
		*/
		//----------------------------------------------------------------------		
		// java.util.List é uma interface para listas
		// java.util.Collection é uma interface para coleções 
		// Lista são sequencias e possuem índice
		// Já coleções não possuem índice
		
		// java.util.ArrayList
		// java.util.Vector - é um ArrayList threadsafe  - Compartilha entre duas pilhas a mesma lista
		// java.util.LinkedList
		
		LinkedList<Conta> list = new LinkedList<Conta>();
		
		ArrayList<String> names = new ArrayList<String>();

		Collection<Conta> list2 = new ArrayList<Conta>();
		
		List<Conta> list3 = new Vector<Conta>();
		
		Collection<Conta> list4 = new Vector<Conta>();
		
		
		//----------------------------------------------------------------------
		// Lista vs Primitivos
		//---------------------------------------------------------------------- 
		int idade = 29;
		
		List numbers = new ArrayList();
		numbers.add(idade);// Java transforma o primitivo no Object Java.lang.Integer
		numbers.add(new Integer(29));
		
		List<Integer> numbers2 = new ArrayList<Integer>();
		// Transformar um primitivo em Objeto é chamado de Autoboxing
		numbers2.add(30);
		numbers2.add(new Integer(30));
		
		// As classes que existem para cada tipo primitivo é chamada de Wrapper ( embrulhar )
		// Principal motivo é para poder trabalhar os primitivos em coleções
		// 
		// double = java.lang.Double
		// int = java.lang.Integer
		
		// Autoboxing
		Integer age = Integer.valueOf(25);// Retorna um objeto contruido sem usar o new
		
		// Unboxing
		System.out.println(age.intValue());
		

		

		
		//----------------------------------------------------------------------
		
	}
}
