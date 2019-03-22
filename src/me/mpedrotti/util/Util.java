package me.mpedrotti.util;
public class Util {

	
	public static void main(String[] args){
		
		/*
		// char vazio não existe
		char letra = 'a';
		
		//System.out.println(letra);
		
		
		char valor = 66;
		
		//System.out.println(valor);
		
		valor = (char)(valor + 1);
		
		//System.out.println(valor);
		
		String palavra = "Copa do mundo de ";
		
		
		//System.out.println(palavra + 2020);
		*/
		//--------------------------------------------------------
		// Aula 06 - 01 Testes com IF
		//--------------------------------------------------------
		// sysout : template
		
		/*
		int idade = 16;
		int acompanhantes = 3;
		
		if(idade >= 18) {
			
			System.out.println("Pode entrar");
		}
		else if(acompanhantes >= 2){
			System.out.println("Pode entrar");
		}
		else {
			System.out.println("Não pode entrar");
		}
		*/
		//--------------------------------------------------------
		// Aula 06 - 04 Boolean conditions
		//--------------------------------------------------------
		/*
		int idade = 16;
		int acompanhantes = 3;
		boolean acompanhado = acompanhantes >= 2;
		
		System.out.println("Você esta acompanhado " + acompanhado);
		
		//if(idade >= 18 || acompanhantes >= 2) {
		if(idade >= 18 || acompanhado == true){
			System.out.println("Pode entrar");
		}
		else {
			System.out.println("Não pode entrar");
		}
		*/
		//--------------------------------------------------------
		// Aula 06 - 08 Escopo e inicialização de variáveis
		//--------------------------------------------------------
		/*
		int idade = 20;
		int acompanhantes = 3;
		boolean acompanhado = false;// morre com o { e }
		
		if(acompanhantes >= 2) {
			acompanhado = true;
		}

		System.out.println("Esta acompanhado " + acompanhado);
		*/
		//--------------------------------------------------------
		// Aula 06 - 11 Opcional: Alíquota com ifs
		//--------------------------------------------------------
		/*
		double salario = 3300.0;
		double reducao = 0;
		
		if(salario >= 1900.0 && salario <= 2800.0) {
			
			reducao = 142;
		}
		else if(salario >= 2800.1 && salario <= 3751.0) {
			reducao = 350;
		}
		else if(salario >= 3751.01 && salario <= 4664.00) {
			reducao = 636;
		}
		
		if(reducao > 0 ){
			System.out.println("Você teve uma redução de IR de R$ " + reducao);
		}
		else {
			System.out.println("Você não esta nas faixas de redução de IR");
		}
		*/
		//--------------------------------------------------------
		// Aula 07 - Laço com while
		//--------------------------------------------------------
		/*
		int count = 0;
		
		while(count <= 10) {
			
			System.out.println(count);
			count++;
			// ++count;
		}
		
		System.out.println(count);
		*/
		//--------------------------------------------------------
		// Aula 07 - Escopo nos laços
		//--------------------------------------------------------
		/*
		int count = 0;
		int total = 0;
		
		while(count <= 10) {
			
			total += count;
			
			System.out.println(total);
			
			++count;
		}*/
		//--------------------------------------------------------
		// Aula 07 - Laço com for
		//--------------------------------------------------------
		// inicializar; condicional; incrementar
		/*
		for(int count = 0; count <= 10; count++){
			
			System.out.println(count);
		}
		
		//System.out.println(count); não existe fora do for
		 */
		//--------------------------------------------------------
		// Aula 07 - Laços encadeados
		//--------------------------------------------------------
		/*
		for(int mult = 1; mult <= 10; mult++){
			
			System.out.println("Tabuada do " + mult);
			
			for(int count =1; count <= 10; count++){
				
				System.out.println(mult + " x " + count + " = " + (mult * count));
			}
			System.out.println();
		}*/	
		//--------------------------------------------------------
		// Aula 07 - Mais laços com break;
		//--------------------------------------------------------

		/*for(int linha = 0; linha < 10; linha++){
			
			for(int coluna = 0; coluna < 10; coluna++){
				
				if(linha == coluna) {

					break;
				}
				else {
					System.out.print('*');
				}
			}
			System.out.println();
		}*/
		
		/*for(int linha = 0; linha < 5; linha++){
			
			for(int coluna = 0; coluna < 5; coluna++){
				
				if(coluna > linha) {

					break;
				}
				else {
					System.out.print(coluna + 1);
				}
			}
			System.out.println();
		}*/
		
		//--------------------------------------------------------
		// Aula 07 - Múltiplos de 3
		//--------------------------------------------------------
		/*
		for(int i = 1; i <= 100; i++) {
			
			if(i % 3 == 0) {
				System.out.print(i + " ");
			}
		}*/
		
	}
}
