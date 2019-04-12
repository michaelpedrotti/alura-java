package me.mpedrotti.java8;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import br.com.alura.CursosOnline.Aluno;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return this.nome;
    }

    public String getInstrutor() {
        return this.instrutor;
    }

    /**
     * 
     * Retorna uma cópia defensiva, inmutavel, somente para leitura, para adicionar e remover
     * tende a usar os métodos da prória classe
     */
    public List<Aula> getAll() {
        return Collections.unmodifiableList(this.aulas);
    }
    
    public void add(Aula a){
    	
    	this.aulas.add(a);
    }
    
    @Override
    public String toString() {
    	return String.format("{Curso:\"%s\", Tempo:\"%s\", aulas:%s}", 
    		this.nome, 
    		this.getTempoTotal(),
    		this.aulas
    	);
    }
    
    public int getTempoTotal(){
    	
    	return this.aulas.stream()
    		.mapToInt(Aula::getTempo)
    			.sum();
    }


    
}