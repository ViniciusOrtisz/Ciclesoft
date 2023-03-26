/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ciclesoft;

import java.util.Scanner;

public class Ciclesoft {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("|Ciclesoft|-|Seja Bem-Vindo| - Através do Menu Escolha um módulo");

        do {
            System.out.println("xxxxxxxx MENU PRINCIPAL xxxxxxxx");
            System.out.println("[1]CLIENTE");
            System.out.println("[2]VENDAS");
            System.out.println("[3]PRODUTOS");
            System.out.println("[4]FORNECEDORES");
            System.out.println("[5]FUNCIONARIOS");
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

            while (!scanner.hasNextInt()) {
                System.out.print("Tente novamente escolhendo uma das opcoes acima");
                scanner.next();
            }
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("xxxxxxxx MENU CLIENTE xxxxxxxx");

                    System.out.println("[1]CADASTRAR CLIENTE");
                    System.out.println("[2]EDITAR CLIENTE");
                    System.out.println("[3]EXCLUIR CLIENTE");
                    System.out.println("[0]VOLTAR");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Tente novamente escolhendo uma das opcoes acima");
                        scanner.next(); // throw away
                    }
                    opcao = scanner.nextInt();
                    switch (opcao) {
                        case 1:
                            System.out.println("====CADASTRAR CLIENTE ====");
                            System.out.println("Nome : ");

                            break;

                        case 2:
                            System.out.println("====EDITAR CLIENTE====");

                            break;
                        case 3:
                            System.out.println("====EXCLUIR CLIENTE====");
                            break;

                        case 0:

                            break;

                    }
                    break;
                // VENDA // Nathan
                case 2:
                    System.out.println("xxxxxxxx MENU VENDA xxxxxxxx");

                    System.out.println("[1]CADASTRAR NOVA VENDA");
                    System.out.println("[2]EDITAR VENDA");
                    System.out.println("[3]EXCLUIR VENDA");
                    System.out.println("[4]RELATORIO DE VENDAS");
                    System.out.println("[0]SAIR");

                    while (!scanner.hasNextInt()) {
                        System.out.print("Tente novamente escolhendo uma das opcoes acima");
                        scanner.next(); // throw away
                    }
                    opcao = scanner.nextInt();
                    switch (opcao) {
                        case 1:
                            System.out.println("====CADASTRAR VENDA====");

                            break;

                        case 2:
                            System.out.println("====EDITAR VENDA====");
                            break;
                        case 3:
                            System.out.println("====EXCLUIR VENDA====");
                            break;
                        case 4:
                            System.out.println("====RELATORIO VENDA====");
                            break;
                        case 0:
                            System.out.println("====VOLTAR====");
                            break;
                    }
                    break;

                case 3:
                    System.out.println("xxxxxxxx MENU PRODUTOS xxxxxxxx");

                    System.out.println("[1]CADASTRAR PRODUTO");
                    System.out.println("[2]EDITAR PRODUTO");
                    System.out.println("[3]EXCLUIR PRODUTO");
                    System.out.println("[0]SAIR");

                    while (!scanner.hasNextInt()) {
                        System.out.print("Tente novamente escolhendo uma das opcoes acima");
                        scanner.next(); // throw away
                    }
                    opcao = scanner.nextInt();
                    switch (opcao) {
                        case 1:
                            System.out.println("====CADASTRAR PRODUTO====");
                            break;

                        case 2:
                            System.out.println("====EDITAR PRODUTO====");
                            break;

                        case 3:
                            System.out.println("====EXCLUIR PRODUTO====");
                            break;

                        case 0:
                            break;
                    }
                    break;

                case 4:
                    System.out.println("xxxxxxxx MENU FORNECEDOR xxxxxxxx");

                    System.out.println("[1]CADASTRAR FORNECEDOR");
                    System.out.println("[2]EDITAR FORNECEDOR");
                    System.out.println("[3]EXCLUIR FORNECEDOR");
                    System.out.println("[0]SAIR");

                    while (!scanner.hasNextInt()) {
                        System.out.print("Tente novamente escolhendo uma das opcoes acima");
                        scanner.next(); // throw away
                    }
                    opcao = scanner.nextInt();
                    switch (opcao) {
                        case 1:
                            System.out.println("====CADASTRAR FORNECEDOR====");

                            break;
                        case 2:
                            System.out.println("====EDITAR FORNECEDOR====");
                            break;
                        case 3:
                            System.out.println("====EXCLUIR FORNECEDOR====");
                            break;
                        case 0:
                            break;
                    }
                    break;
                case 5:
                    System.out.println("xxxxxxxx MENU FUNCIONARIO xxxxxxxx");

                    System.out.println("[1]CADASTRAR NOVO FUNCIONARIO");

                    System.out.println("[2]EDITAR FUNCIONARIO");

                    System.out.println("[3]EXCLUIR FUNCIONARIO");

                    System.out.println("[0]SAIR");

                    while (!scanner.hasNextInt()) {
                        System.out.print("Tente novamente escolhendo uma das opcoes acima");
                        scanner.next(); // throw away
                    }
                    opcao = scanner.nextInt();
                    switch (opcao) {
                        case 1:
                            System.out.println("====CADASTRAR FUNCINARIO====");

                            break;
                        case 2:
                            System.out.println("====EDITAR FUNCINARIO====");
                            break;

                        case 3:
                            System.out.println("====EXCLUIR FUNCINARIO====");
                            break;

                        case 0:
                            break;
                    }

                    break;

                case 0:

                    break;

            }

        } while (true);
    }

}
