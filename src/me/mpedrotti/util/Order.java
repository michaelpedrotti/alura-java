package me.mpedrotti.util;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import br.com.alura.ByteBank.*;


public class Order {

	public static void main(String[] args) {
		
		 Conta cc1 = new ContaCorrente(22, 33);
         cc1.deposita(333.0);

         Conta cc2 = new ContaPoupanca(22, 44);
         cc2.deposita(444.0);

         Conta cc3 = new ContaCorrente(22, 11);
         cc3.deposita(111.0);

         Conta cc4 = new ContaPoupanca(22, 22);
         cc4.deposita(222.0);

         List<Conta> lista = new ArrayList<>();
         lista.add(cc1);
         lista.add(cc2);
         lista.add(cc3);
         lista.add(cc4);
		
		for (Conta conta : lista) {
            System.out.println(conta.getNumero());
		}
		
//		/* Lambdas ( Classe anonima ) */
//		lista.sort(new Comparator<Conta>(){
//			
//			public int compare(Conta c1, Conta c2){
//				return Integer.compare(c1.getNumero(), c2.getNumero());
//			}
//		});
		
//		/* Lambdas ( Função anonima ) */
//		lista.sort( (Conta c1, Conta c2) -> {
//			return Integer.compare(c1.getNumero(), c2.getNumero());
//		});
		
		/* Lambda quando o código somente tem uma linha ( retira as chaves ) */
		lista.sort( (Conta c1, Conta c2) -> Integer.compare(c1.getNumero(), c2.getNumero()) );
		
		// Instância de uma lambda
		Comparator<Conta> comparator = (Conta c1, Conta c2) -> {
			return Integer.compare(c1.getNumero(), c2.getNumero());
		};
		
		System.out.println("---------");
		
		/* Lambda de função anônima */
		lista.forEach( (Conta c) -> System.out.println(c.getNumero()) );
	}
}






