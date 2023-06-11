package com.mycompany.ciclesoft;

import java.util.Scanner;

public class Ciclesoft {

    public static void main(String[] args) {
        int opcao = -1;
        int opcaoClasses;
        int tamanhoDoVetor = 5;
        Scanner scanner = new Scanner(System.in);
        int informarID;
        VendasMenu menu = new VendasMenu();
        ClienteMenu cliMenu = new ClienteMenu();
        FornecedoresMenu forneMenu = new FornecedoresMenu();
        FuncionariosMenu IniciarFuncionario = new FuncionariosMenu();
        ProdutosMenu prodMenu = new ProdutosMenu();

        Fornecedores[] fornecedor = new Fornecedores[tamanhoDoVetor];

        for (int i = 0; i < tamanhoDoVetor; i++) {

            fornecedor[i] = new Fornecedores();
        }

        Cliente[] cliente = new Cliente[tamanhoDoVetor];

        for (int i = 0; i < tamanhoDoVetor; i++) {

            cliente[i] = new Cliente();
        }

        Produtos[] produto = new Produtos[tamanhoDoVetor];

        for (int i = 0; i < tamanhoDoVetor; i++) {

            produto[i] = new Produtos(0, 0, 0, "", 0, "", "", "", "", "", "", "", "", 0, "", 0);
        }

        Vendas[] venda = new Vendas[tamanhoDoVetor];

        for (int i = 0; i < tamanhoDoVetor; i++) {

            venda[i] = new Vendas(0, 0, 0, "", 0, "", "", "", "", "", "", "", "", 0, "", 0, "", 0, 0, 0, 0, 0, 0, "", 0);
        }

        System.out.println("|Ciclesoft|-|Seja Bem-Vindo| - Através do Menu Escolha um módulo");

        do {
            System.out.println("xxxxxxxx MENU PRINCIPAL xxxxxxxx");
            System.out.println("[1]CLIENTE");
            System.out.println("[2]VENDAS");
            System.out.println("[3]PRODUTOS");
            System.out.println("[4]FORNECEDORES");
            System.out.println("[5]FUNCIONARIOS");
            System.out.println("[0]SAIR");
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

            while (!scanner.hasNextInt()) {
                System.out.print("Tente novamente escolhendo uma das opcoes acima");
                scanner.next();
            }
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    cliMenu.menuCliente(scanner, cliente, tamanhoDoVetor);
                    break;
                case 2:
                    menu.menuVendas(scanner, venda, tamanhoDoVetor);
                    break;
                case 3:
                    prodMenu.menuProdutos(scanner, produto, tamanhoDoVetor);
                    break;
                case 4:
                    forneMenu.menuFornecedores(scanner, fornecedor, tamanhoDoVetor);
                    break;
                case 5:
                    IniciarFuncionario.menuFuncionarios();
                    break;
            }

        } while (opcao != 0);

    }

}
