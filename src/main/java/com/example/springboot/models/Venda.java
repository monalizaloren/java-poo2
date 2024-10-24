package com.example.springboot.models;

public class Venda {
    private static int numVendas = 0;
    private int numero;
    private Livro[] livros;
    private String cliente;
    private double valor;

    public Venda(Livro[] livros, String cliente) {
        this.numero = ++numVendas;
        this.livros = livros;
        this.cliente = cliente;
        calcularValor();
    }

    private void calcularValor() {
        for (Livro livro : livros) {
            valor += livro.preco;
        }
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println(livro.toString());
        }
    }
}
