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
                // VENDA // 
                case 2:
                    
                    menu.menuVendas(scanner, venda, tamanhoDoVetor);
                
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
                                    produto[i].cadastrarProduto();
                                    i = tamanhoDoVetor;
                                    
                                    break;
                                    
                                }
                            }
                            break;
                        case 2:
                            System.out.println("====EDITAR PRODUTO====");
                            System.out.println("LISTA DE PRODUTOS");
                            
                            for (int j = 0; j < tamanhoDoVetor; j++) {
                                System.out.println("ID : " + produto[j].getIdProduto());
                                System.out.println("==========================");
                            }
                            System.out.println("Informe o Código do Produto:");
                            informarID = scanner.nextInt();
                            for (int i = 0; i < tamanhoDoVetor; i++) {
                                
                                if (produto[i].getIdProduto() == informarID) {
                                    
                                    produto[i].atualizarProduto();
                                    i = tamanhoDoVetor;
                                }
                                
                            }
                            break;
                        case 3:
                            System.out.println("====EXCLUIR PRODUTO====");
                            System.out.println("LISTA DE PRODUTOS");
                            for (int j = 0; j < tamanhoDoVetor; j++) {
                                System.out.println("ID : " + produto[j].getIdProduto());
                                System.out.println("==========================");
                            }
                            System.out.println("Informe o Código do Produto:");
                            informarID = scanner.nextInt();
                            for (int i = 0; i < tamanhoDoVetor; i++) {
                                
                                if (produto[i].getIdProduto() == informarID) {
                                    
                                    produto[i].excluirProduto();
                                    i = tamanhoDoVetor;
                                }
                                
                            }
                            break;
                        
                        case 0:
                            
                            break;
                        
                    }
                    
                    break;
                
                case 4:
                   //Fornecedores
                    forneMenu.menuFornecedores(scanner, fornecedor, tamanhoDoVetor);
                    
                case 5:
                    
                    IniciarFuncionario.menuFuncionarios();
                    
                    break;
                
            }
            
        } while (opcao != 0);
        
    }
    
}
