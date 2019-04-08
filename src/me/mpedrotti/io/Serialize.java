package me.mpedrotti.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import br.com.alura.ByteBank.Cliente;
import br.com.alura.ByteBank.ContaCorrente;

/**
 * Gravação/Leitura em modo binário de modos primitivos ou classes
 * java.io 
 * 
 * @see MyScanner.java
 */
public class Serialize {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		// HEAP ( memória de objetos )
		/*
		String str = "Nico Steppat";
		
		ObjectOutputStream os = new ObjectOutputStream(
			new FileOutputStream("file.bin")
		);
		
		os.writeObject(str);
		os.close();
		
		ObjectInputStream is = new ObjectInputStream(
			new FileInputStream("file.bin")
		);
		
		str = (String) is.readObject();
		
		is.close();
		
		System.out.println(str);
		*/
		//------------------------------------------------------------------------
		/*
		// private static final long serialVersionUID = 1L;
		// e toda modificação na estrutura da classe incrementar esse contador
		Cliente cliente = new Cliente();
		cliente.setNome("Nico");
		cliente.setProfissao("Dev");
		cliente.setCpf("222.333.444-55");
		
		ObjectOutputStream os = new ObjectOutputStream(
			new FileOutputStream("file.bin")
		);
			
		os.writeObject(cliente);
		os.close();
		
		
		ObjectInputStream is = new ObjectInputStream(
			new FileInputStream("file.bin")
		);
		Cliente cliente2 = (Cliente) is.readObject();	
				
		System.out.println(cliente.getCpf());
		*/
		
		Cliente cliente = new Cliente();
		cliente.setNome("Nico");
		cliente.setProfissao("Dev");
		cliente.setCpf("222.333.444-55");
		
		ContaCorrente cc = new ContaCorrente(2222, 555555);
		cc.setTitular(cliente);
		cc.deposita(222.3);
		
		ObjectOutputStream os = new ObjectOutputStream(
			new FileOutputStream("file.bin")
		);
		
		os.writeObject(cc);
		os.close();
		
		ObjectInputStream is = new ObjectInputStream(
			new FileInputStream("file.bin")
		);
		
		ContaCorrente cc2 = (ContaCorrente) is.readObject();
		is.close();
		
		System.out.format("Conta: %d %nSaldo: %f %nTítular: %s%n",
			cc2.getAgencia(),
			cc2.getSaldo(),
			cc2.getTitular().getNome()
		);
		
		// private transient Client titular
		// Escapa o atributo de ser serializado
		
	}
}
