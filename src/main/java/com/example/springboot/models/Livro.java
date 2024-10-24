// Livro.java
package com.example.springboot.models;

public abstract class Livro {
    protected String titulo;
    protected String autores;
    protected String editora;
    protected double preco;

    public Livro(String titulo, String autores, String editora, double preco) {
        this.titulo = titulo;
        this.autores = autores;
        this.editora = editora;
        this.preco = preco;
    }

    public abstract String toString();
}