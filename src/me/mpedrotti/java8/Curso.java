package me.mpedrotti.java8;

public class Curso {
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return this.nome;
    }

    public int getAlunos() {
        return this.alunos;
    }
}