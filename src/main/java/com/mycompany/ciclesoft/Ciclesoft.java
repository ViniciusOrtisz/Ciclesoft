/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ciclesoft;

import java.util.Scanner;

public class Ciclesoft {

    

    public static void main(String[] args) {
        int opcao = -1;
        int opcaoClasses;
        int tamanhoDoVetor = 5;
        Scanner scanner = new Scanner(System.in);
        int informarID;

        Fornecedores[] fornecedor = new Fornecedores[tamanhoDoVetor];
        Produtos[] produto = new Produtos[tamanhoDoVetor];
        Funcionarios[] funcionario = new Funcionarios[tamanhoDoVetor];
        Cliente[] cliente = new Cliente[tamanhoDoVetor];
        Vendas[] venda = new Vendas[tamanhoDoVetor];
        Scanner Ler = new Scanner(System.in);

        for (int i = 0; i < tamanhoDoVetor; i++) {

            fornecedor[i] = new Fornecedores(0, "", 0, "", "", "", "", "", "");
            produto[i] = new Produtos(0, 0, 0, "", 0, "", "", "", "", "", "", "", "", 0, "", 0);
            funcionario[i] = new Funcionarios(0, "", "", "", 0, 0, "", "", "", "", "", "", "", "", "", "", "", "");
            cliente[i] = new Cliente(0, "", "", "", "", "", "", "", "");
            venda[i] = new Vendas(0, 0, 0, "", 0,
                    "", "", "", "", "", "", "", "", 0, "", 0, "",
                    0, 0, 0, 0, 0, 0,
                    "", 0);
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
                    System.out.println("xxxxxxxx MENU CLIENTE xxxxxxxx");

                    System.out.println("[1]CADASTRAR CLIENTE");
                    System.out.println("[2]EDITAR CLIENTE");
                    System.out.println("[3]EXCLUIR CLIENTE");
                    System.out.println("[0]VOLTAR");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Tente novamente escolhendo uma das opcoes acima");
                        scanner.next(); //
                    }
                    opcaoClasses = scanner.nextInt();
                    switch (opcaoClasses) {
                        case 1:
                            System.out.println("====CADASTRAR CLIENTE ====");

                            for (int i = 0; i < tamanhoDoVetor; i++) {

                                if (cliente[i].getIdCliente() == 0) {
                                    System.out.println("Vetor disponivel > " + i);
                                    cliente[i].CadastrarCliente();
                                    i = tamanhoDoVetor;
                                    

                                    break;

                                }
                            }
                            break;
                        case 2:
                            System.out.println("====EDITAR CLIENTE====");

                            System.out.println("LISTA DE CADASTRO");
                            for (int j = 0; j < tamanhoDoVetor; j++) {
                                System.out.println("NOME : " + cliente[j].getNome());
                                System.out.println("ID : " + cliente[j].getIdCliente());
                                System.out.println("==========================");
                            }
                            System.out.println("Infomre o ID do cliente :");
                            informarID = Ler.nextInt();

                            for (int i = 0; i < tamanhoDoVetor; i++) {

                                if (cliente[i].getIdCliente() == informarID) {

                                    cliente[i].AtualizarCliente();
                                    i = tamanhoDoVetor;
                                }

                            }

                            break;
                        case 3:
                            System.out.println("====EXCLUIR CLIENTE====");

                            System.out.println("LISTA DE CADASTRO");
                            for (int j = 0; j < tamanhoDoVetor; j++) {
                                System.out.println("NOME : " + cliente[j].getNome());
                                System.out.println("ID : " + cliente[j].getIdCliente());
                                System.out.println("==========================");
                            }
                            System.out.println("Infomre o ID do CLIENTE para excluir :");
                            informarID = Ler.nextInt();

                            for (int i = 0; i < tamanhoDoVetor; i++) {

                                if (cliente[i].getIdCliente() == informarID) {

                                    cliente[i].ExcluirCliente();
                                    i = tamanhoDoVetor;
                                }

                            }
                            break;

                        case 0:

                            break;

                    }
                    break;

                // VENDA // 
                case 2:
                    System.out.println("xxxxxxxx MENU VENDA xxxxxxxx");

                    System.out.println("[1]CADASTRAR NOVA VENDA");
                    System.out.println("[2]EDITAR VENDA");
                    System.out.println("[3]EXCLUIR VENDA");
                    System.out.println("[4]RELATORIO DE VENDAS");
                    System.out.println("[0]SAIR");

                    while (!scanner.hasNextInt()) {
                        System.out.print("Tente novamente escolhendo uma das opcoes acima");
                        scanner.next();
                    }
                    opcaoClasses = scanner.nextInt();
                    switch (opcaoClasses) {
                        case 1:
                            System.out.println("====CADASTRAR VENDA ====");

                            for (int i = 0; i < tamanhoDoVetor; i++) {

                                if (venda[i].getIdVenda() == 0) {
                                    System.out.println("Vetor disponivel > " + i);
                                    venda[i].CadastrarVenda();
                                    
                                    
                                    i = tamanhoDoVetor;
                                    break;

                                }
                            }
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
                    System.out.println("xxxxxxxx PRODUTOS xxxxxxxx");

                    System.out.println("[1]CADASTRAR PRODUTO");
                    System.out.println("[2]EDITAR PRODUTO");
                    System.out.println("[3]EXCLUIR PRODUTO");
                    System.out.println("[0]SAIR");

                    while (!scanner.hasNextInt()) {
                        System.out.print("Tente novamente escolhendo uma das opcoes acima");
                        scanner.next();
                    }
                    opcaoClasses = scanner.nextInt();
                    switch (opcaoClasses) {
                        case 1:
                            System.out.println("====CADASTRAR PRODUTO====");

                            for (int i = 0; i < tamanhoDoVetor; i++) {

                                if (produto[i].getIdProduto() == 0) {
                                    System.out.println("Vetor disponivel > " + i);
                                    produto[i].CadastrarProduto();
                                    i = tamanhoDoVetor;

                                    break;

                                }
                            }
                            break;
                        case 2:
                            System.out.println("====EDITAR PRODUTO====");

                            System.out.println("LISTA DE CADASTRO");
                            for (int j = 0; j < tamanhoDoVetor; j++) {
                                System.out.println("MODELO : " + produto[j].getModelo());
                                System.out.println("ID : " + produto[j].getIdProduto());
                                System.out.println("==========================");
                            }
                            System.out.println("Infomre o ID do Produto :");
                            informarID = Ler.nextInt();

                            for (int i = 0; i < tamanhoDoVetor; i++) {

                                if (produto[i].getIdProduto() == informarID) {

                                    produto[i].AtualizarProduto();
                                    i = tamanhoDoVetor;
                                }

                            }

                            break;
                        case 3:
                            System.out.println("====EXCLUIR PRODUTO====");

                            System.out.println("LISTA DE PRODUTOS");
                            for (int j = 0; j < tamanhoDoVetor; j++) {
                                System.out.println("MODELO : " + produto[j].getModelo());
                                System.out.println("ID : " + produto[j].getIdProduto());
                                System.out.println("==========================");
                            }
                            System.out.println("Infomre o ID do PRODUTO para excluir :");
                            informarID = Ler.nextInt();

                            for (int i = 0; i < tamanhoDoVetor; i++) {

                                if (cliente[i].getIdCliente() == informarID) {

                                    produto[i].ExcluirProduto();
                                    i = tamanhoDoVetor;
                                }

                            }
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
                        scanner.next();
                    }
                    opcaoClasses = scanner.nextInt();
                    switch (opcaoClasses) {
                        case 1:
                            System.out.println("====CADASTRAR FORNECEDOR ====");

                            for (int i = 0; i < tamanhoDoVetor; i++) {

                                if (fornecedor[i].getIdFornecedor() == 0) {
                                    System.out.println("Vetor disponivel > " + i);
                                    fornecedor[i].CadastrarFornecedor();
                                    i = tamanhoDoVetor;

                                    break;

                                }
                            }
                            break;
                        case 2:
                            System.out.println("====EDITAR FORNECEDOR====");

                            System.out.println("LISTA DE CADASTRO");
                            for (int j = 0; j < tamanhoDoVetor; j++) {
                                System.out.println("NOME : " + fornecedor[j].getNomeFornecedor());
                                System.out.println("ID : " + fornecedor[j].getIdFornecedor());
                                System.out.println("==========================");
                            }
                            System.out.println("Infomre o ID do FORNECEDOR :");
                            informarID = Ler.nextInt();

                            for (int i = 0; i < tamanhoDoVetor; i++) {

                                if (fornecedor[i].getIdFornecedor() == informarID) {

                                    fornecedor[i].AtualizarFornecedor();
                                    i = tamanhoDoVetor;
                                }

                            }

                            break;
                        case 3:
                            System.out.println("====EXCLUIR FORNECEDOR====");

                            System.out.println("LISTA DE FORNECEDORES");
                            for (int j = 0; j < tamanhoDoVetor; j++) {
                                System.out.println("NOME : " + fornecedor[j].getNomeFornecedor());
                                System.out.println("ID : " + fornecedor[j].getIdFornecedor());
                                System.out.println("==========================");
                            }
                            System.out.println("Infomre o ID do fornecedor para excluir :");
                            informarID = Ler.nextInt();

                            for (int i = 0; i < tamanhoDoVetor; i++) {

                                if (fornecedor[i].getIdFornecedor() == informarID) {

                                    fornecedor[i].ExcluirFornecedor();
                                    i = tamanhoDoVetor;
                                }

                            }
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
                        scanner.next();
                    }
                    opcaoClasses = scanner.nextInt();
                    switch (opcaoClasses) {
                        case 1:
                            System.out.println("====CADASTRAR FUNCINARIO====");

                            for (int i = 0; i < tamanhoDoVetor; i++) {

                                if (funcionario[i].getIdFuncionario() == 0) {
                                    System.out.println("Vetor disponivel > " + i);
                                    funcionario[i].CadastrarFuncionario();
                                    i = tamanhoDoVetor;

                                    break;

                                }
                            }
                            break;
                        case 2:
                            System.out.println("====EDITAR FUNCIONARIOS====");

                            System.out.println("LISTA DE FUNCIONARIOS");
                            for (int j = 0; j < tamanhoDoVetor; j++) {
                                System.out.println("NOME : " + funcionario[j].getNome());
                                System.out.println("ID : " + funcionario[j].getIdFuncionario());
                                System.out.println("==========================");
                            }
                            System.out.println("Infomre o ID do cliente :");
                            informarID = Ler.nextInt();

                            for (int i = 0; i < tamanhoDoVetor; i++) {

                                if (funcionario[i].getIdFuncionario() == informarID) {

                                    funcionario[i].AtualizarFuncionario();
                                    i = tamanhoDoVetor;
                                }

                            }

                            break;
                        case 3:
                            System.out.println("====EXCLUIR FORNECEDOR====");

                            System.out.println("LISTA DE FORNECEDORES");
                            for (int j = 0; j < tamanhoDoVetor; j++) {
                                System.out.println("NOME : " + funcionario[j].getNome());
                                System.out.println("ID : " + funcionario[j].getIdFuncionario());
                                System.out.println("==========================");
                            }
                            System.out.println("Infomre o ID do fornecedor para excluir :");
                            informarID = Ler.nextInt();

                            for (int i = 0; i < tamanhoDoVetor; i++) {

                                if (funcionario[i].getIdFuncionario() == informarID) {

                                    funcionario[i].ExcluirFuncionario();
                                    i = tamanhoDoVetor;
                                }

                            }
                            break;

                        case 0:

                            break;

                    }
                    break;

            }

        } while (opcao != 0);
    }

}
