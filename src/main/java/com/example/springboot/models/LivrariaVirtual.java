package com.example.springboot.models;


import java.util.Scanner;

public class LivrariaVirtual {
    private static final int MAX_IMPRESSOS = 100;
    private static final int MAX_ELETRONICOS = 100;
    private static final int MAX_VENDAS = 100;

    private Impresso[] impressos = new Impresso[MAX_IMPRESSOS];
    private Eletronico[] eletronicos = new Eletronico[MAX_ELETRONICOS];
    private Venda[] vendas = new Venda[MAX_VENDAS];
    private int numImpressos = 0;
    private int numEletronicos = 0;
    private int numVendas = 0;

    public void cadastrarLivro(Scanner scanner) {
        System.out.println("Escolha o tipo de livro a ser cadastrado:");
        System.out.println("1. Impresso");
        System.out.println("2. Eletrônico");
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        if (escolha == 1) {
            cadastrarLivroImpresso(scanner);
        } else if (escolha == 2) {
            cadastrarLivroEletronico(scanner);
        } else {
            System.out.println("Opção inválida.");
        }
    }

    private void cadastrarLivroImpresso(Scanner scanner) {
        if (numImpressos >= MAX_IMPRESSOS) {
            System.out.println("Não é possível cadastrar mais livros impressos. Limite excedido.");
            return;
        }

        System.out.println("Digite o título do livro impresso:");
        String titulo = scanner.nextLine();
        System.out.println("Digite o nome do autor(es):");
        String autores = scanner.nextLine();
        System.out.println("Digite o nome da editora:");
        String editora = scanner.nextLine();
        System.out.println("Digite o preço do livro:");
        double preco = scanner.nextDouble();
        System.out.println("Digite o valor do frete:");
        double frete = scanner.nextDouble();
        System.out.println("Digite a quantidade em estoque:");
        int estoque = scanner.nextInt();

        Impresso livro = new Impresso(titulo, autores, editora, preco, frete, estoque);
        impressos[numImpressos++] = livro;
        System.out.println("Livro impresso cadastrado com sucesso.");
    }


    private void cadastrarLivroEletronico(Scanner scanner) {
        // Implemente a lógica para cadastrar um livro eletrônico de forma semelhante ao método anterior
    }

    public void realizarVenda(Scanner scanner) {
        // Implemente a lógica para realizar uma venda
    }

    public void listarLivros() {
        System.out.println("Livros Impressos:");
        for (int i = 0; i < numImpressos; i++) {
            System.out.println(impressos[i].toString());
        }

        System.out.println("Livros Eletrônicos:");
        // Faça o mesmo para listar os livros eletrônicos
    }

    public void listarVendas() {
        // Implemente a lógica para listar as vendas realizadas
    }
}