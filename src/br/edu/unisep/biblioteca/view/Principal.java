package br.edu.unisep.biblioteca.view;

import br.edu.unisep.biblioteca.model.*;

import java.util.Calendar;

public class Principal {
    public static void main(String[] args) {
        Usuario user1 = new Usuario(1, "piola@hotmail.com", "1111", "Piola");

        Autor autor1 = new Autor(1, "Piola", "11111111111");

        Livro livro1 = new Livro(autor1, "Livro Legal", 1);

        Emprestimo emprestimo1 = new Emprestimo(1, "Emprestimo 1", Calendar.getInstance(), Calendar.getInstance(), livro1, user1);

        System.out.println("Oie " +  emprestimo1.getUsuario().getNome() + "\n" +
                "Seu emprestimo do livro "  + emprestimo1.getLivro().getTituloInicial() + " foi feito com sucesso!"+ "\n" +
                "Obrigado!"
        );
    }
}