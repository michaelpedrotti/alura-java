package br.com.alura.ByteBank;

import java.io.Serializable;

public class AutenticacaoUtil implements Serializable {
	
	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}


	public boolean autentica(int senha) {
		return (this.senha == senha);	
	}

}
