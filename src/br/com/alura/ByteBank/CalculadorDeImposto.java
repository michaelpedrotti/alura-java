package br.com.alura.ByteBank;

public class CalculadorDeImposto {

	private double total;
	
	public void registra(Tributavel t){
		
		this.total += t.getValorImposto();
		
	}
	
	public double total(){
		
		return this.total;
	}
}
