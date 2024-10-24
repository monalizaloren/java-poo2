package com.example.springboot.models;

public class Impresso extends Livro {
    private double frete;
    private int estoque;

    // Construtor
    public Impresso(String titulo, String autores, String editora, double preco, double frete, int estoque) {
        super(titulo, autores, editora, preco);
        this.frete = frete;
        this.estoque = estoque;
    }

    public void atualizarEstoque() {
        estoque--;
    }

    @Override
    public String toString() {
        return String.format("Título: %s, Autores: %s, Editora: %s, Preço: %.2f, Frete: %.2f, Estoque: %d",
                titulo, autores, editora, preco, frete, estoque);
    }
}