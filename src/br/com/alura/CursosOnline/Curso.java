package br.com.alura.CursosOnline;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

    private String nome;
    private String instrutor;
    
    //private Set<Aluno> alunos = new HashSet<Aluno>();
    
    /**
     * Parecido com o HashSet porém mantem a ordem de inserção dos elementos
     */
    private Set<Aluno> alunos = new LinkedHashSet<Aluno>();
    
    private List<Aula> aulas = new LinkedList<Aula>(); 
    
    private Map<Integer, Aluno> matriculas = new LinkedHashMap<>();
    
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
    	return String.format("{Curso:\"%s\", Tempo:\"%s\", aulas:%s, alunos:%s}", 
    		this.nome, 
    		this.getTempoTotal(),
    		this.aulas,
    		this.alunos
    	);
    }
    
    public int getTempoTotal(){
    	return this.aulas.stream()
    		.mapToInt(Aula::getTempo)
    			.sum();
    }

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculas.put(aluno.getNumeroMatricula(), aluno);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(this.alunos);
	}

	public boolean isMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);		
	}

	public Aluno searchMatricula(int matricula) {
		
		if(!this.matriculas.containsKey(matricula)){
			throw new NoSuchElementException("Não encontrada");
		}
		
		return this.matriculas.get(matricula);
	}
}