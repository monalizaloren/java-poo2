package com.example.springboot.models;

import java.util.Scanner;

public class ConsoleInput {
    private Scanner scanner;

    public ConsoleInput() {
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        LivrariaVirtual livraria = new LivrariaVirtual();

        while (true) {
            exibirMenu();
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (escolha) {
                case 1:
                    livraria.cadastrarLivro(scanner);
                    break;
                case 2:
                    livraria.realizarVenda(scanner);
                    break;
                case 3:
                    livraria.listarLivros();
                    break;
                case 4:
                    livraria.listarVendas();
                    break;
                case 5:
                    System.out.println("Encerrando o programa.");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private void exibirMenu() {
        System.out.println("==== Menu ====");
        System.out.println("1. Cadastrar livro");
        System.out.println("2. Realizar uma venda");
        System.out.println("3. Listar livros");
        System.out.println("4. Listar vendas");
        System.out.println("5. Sair do programa");
        System.out.println("Escolha uma opção:");
    }

    public static void main(String[] args) {
        ConsoleInput consoleInput = new ConsoleInput();
        consoleInput.run();
    }
}
