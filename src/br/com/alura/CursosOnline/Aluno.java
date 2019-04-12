package br.com.alura.CursosOnline;

/**
 * 
 * Quick Access: ggas Generate Getters and Setters
 */
public class Aluno {

    private String nome;
    private int numeroMatricula;

    public Aluno(String nome, int numeroMatricula) {
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return this.nome;
    }

    public int getNumeroMatricula() {
        return this.numeroMatricula;
    }
    
    @Override
    public int hashCode() {
    	// Devolve o hashCode do Object String
    	return this.nome.hashCode();
    }
    
    @Override
    public boolean equals(Object obj) {
   
    	return this.nome.equals(((Aluno)obj).getNome());
    }
    
    @Override
    public String toString() {

    	return String.format("{nome:\"%s\", matricula:\"%s\"}", this.nome, this.numeroMatricula);
    }
}