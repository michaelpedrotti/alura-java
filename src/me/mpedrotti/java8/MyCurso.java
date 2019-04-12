package me.mpedrotti.java8;

public class MyCurso {
    private String nome;
    private int alunos;

    public MyCurso(String nome, int alunos) {
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