package br.com.alura.CursosOnline;

public class Aula extends Object implements Comparable<Aula>{

    private String titulo;
    private int tempo;

    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public int getTempo() {
        return this.tempo;
    }
    
    @Override
    public String toString() {
    
    	return String.format("[Aula:\"%s\", Tempo: %s]", this.titulo, this.tempo);
    }

	@Override
	public int compareTo(Aula o) {
		
		return this.titulo.compareTo(o.getTitulo());
	}
}