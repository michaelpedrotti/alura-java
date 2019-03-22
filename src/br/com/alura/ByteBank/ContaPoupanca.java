package br.com.alura.ByteBank;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}
    
}
