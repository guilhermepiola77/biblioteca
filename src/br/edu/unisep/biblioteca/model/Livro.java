package br.edu.unisep.biblioteca.model;

public class Livro {
    private int id;
    private String tituloInicial;
    private Autor autorLivro;

    public Livro(Autor autorLivro, String tituloInicial, int id) {
        this.autorLivro = autorLivro;
        this.tituloInicial = tituloInicial;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTituloInicial() {
        return tituloInicial;
    }

    public void setTituloInicial(String tituloInicial) {
        this.tituloInicial = tituloInicial;
    }

    public Autor getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(Autor autorLivro) {
        this.autorLivro = autorLivro;
    }
}
