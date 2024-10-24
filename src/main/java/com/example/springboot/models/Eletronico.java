package com.example.springboot.models;

public class Eletronico extends Livro {
    private int tamanho;

    // Construtor que chama o construtor da superclasse (Livro)
    public Eletronico(String titulo, String autores, String editora, double preco, int tamanho) {
        super(titulo, autores, editora, preco);
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return String.format("Título: %s, Autores: %s, Editora: %s, Preço: %.2f, Tamanho: %d KB",
                titulo, autores, editora, preco, tamanho);
    }
}