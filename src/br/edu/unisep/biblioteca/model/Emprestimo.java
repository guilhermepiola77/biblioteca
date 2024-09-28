package br.edu.unisep.biblioteca.model;

import java.util.Calendar;

public class Emprestimo {
    private int id;
    private String descricao;
    private Calendar dataDoInicio;
    private Calendar dataDoFim;
    private Livro livro;
    private Usuario usuario;

    public Emprestimo(int id, String descricao, Calendar dataDoInicio, Calendar dataDoFim, Livro livro, Usuario usuario) {
        this.id = id;
        this.descricao = descricao;
        this.dataDoInicio = dataDoInicio;
        this.dataDoFim = dataDoFim;
        this.livro = livro;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Calendar getDataDoInicio() {
        return dataDoInicio;
    }

    public void setDataDoInicio(Calendar dataDoInicio) {
        this.dataDoInicio = dataDoInicio;
    }

    public Calendar getDataDoFim() {
        return dataDoFim;
    }

    public void setDataDoFim(Calendar dataDoFim) {
        this.dataDoFim = dataDoFim;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
