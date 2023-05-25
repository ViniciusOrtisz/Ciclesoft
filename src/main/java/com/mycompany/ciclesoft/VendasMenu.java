/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ciclesoft;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class VendasMenu extends Vendas {
    private int opcaoClasses;
    private int informarID;
    private int numVenda = 0;
    @Override
    public void CadastrarVenda() {
        super.CadastrarVenda(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    public void CadastrarVenda(int index) {
        System.out.println("NOSSO CADASTRO - Num.Venda: " + index);
        super.CadastrarVenda();
    }
    
    
    
    public void menuVendas(Scanner scanner, Vendas[] venda, int tamanhoDoVetor) {
        System.out.println("xxxxxxxx MENU VENDA xxxxxxxx");

        System.out.println("[1]CADASTRAR NOVA VENDA");
        System.out.println("[11]INFORMAR PRODUTO NA VENDA");
        System.out.println("[2]EDITAR VENDA");
        System.out.println("[3]EXCLUIR VENDA");
        System.out.println("[4]RELATORIO DE VENDAS");
        System.out.println("[4]VER UMA VENDA");
        System.out.println("[0]SAIR");

        while (!scanner.hasNextInt()) {
            System.out.print("Tente novamente escolhendo uma das opcoes acima");
            scanner.next();
        }
        opcaoClasses = scanner.nextInt();
        switch (opcaoClasses) {
            case 1:
                numVenda ++;
                CadastrarVenda(numVenda);
                break;

            case 11:
                System.out.println("====CADASTRAR PRODUTO NA VENDA ====");
                for (int i = 0; i < tamanhoDoVetor; i++) {

                    if (venda[i].getIdVenda() == 0) {
                        System.out.println("Vetor disponivel > " + i);
                        venda[i].CadastrarProdVenda();
                        i = tamanhoDoVetor;
                    }
                }
                break;

            case 2:
                System.out.println("====EDITAR VENDA====");
                System.out.println("LISTA DE VENDAS");

                for (int j = 0; j < tamanhoDoVetor; j++) {
                    System.out.println("ID Do Produto Vendido: " + venda[j].getIdProduto());
                    System.out.println("ID Da Venda Realizada: " + venda[j].getIdVenda());
                    System.out.println("==========================");
                }
                System.out.println("Informe o Código da Venda:");
                informarID = scanner.nextInt();
                for (int i = 0; i < tamanhoDoVetor; i++) {

                    if (venda[i].getIdVenda() == informarID) {

                        venda[i].AtualizarVenda();
                        i = tamanhoDoVetor;
                    }

                }
                break;

            case 3:
                System.out.println("==== EXCLUIR VENDA ====");
                System.out.println("LISTA DE VENDAS");

                for (int j = 0; j < tamanhoDoVetor; j++) {
                    System.out.println("ID Do Produto Vendido: " + venda[j].getIdProduto());
                    System.out.println("ID Da Venda Realizada: " + venda[j].getIdVenda());
                    System.out.println("==========================");
                }
                System.out.println("Informe o Código da Venda:");
                informarID = scanner.nextInt();
                for (int i = 0; i < tamanhoDoVetor; i++) {

                    if (venda[i].getIdVenda() == informarID) {

                        venda[i].ExcluirVenda();
                        i = tamanhoDoVetor;
                    }

                }
                break;
            case 4:
                System.out.println("==== RELATORIO DE VENDAS ====");
                System.out.println("LISTA DE VENDAS");

                for (int j = 0; j < tamanhoDoVetor; j++) {
                    System.out.println("ID Do Produto Vendido: " + venda[j].getIdProduto());
                    System.out.println("ID Da Venda Realizada: " + venda[j].getIdVenda());
                    System.out.println("Quantidade Vendida: " + venda[j].getQuantidade());
                    System.out.println("Desconto aplicado: " + venda[j].getDesconto());
                    System.out.println("==========================");
                }
                break;

            case 5:
                System.out.println("==== VER UMA VENDA ====");
                System.out.println("LISTA DE VENDAS");

                for (int j = 0; j < tamanhoDoVetor; j++) {
                    System.out.println("ID Do Produto Vendido: " + venda[j].getIdProduto());
                    System.out.println("ID Da Venda Realizada: " + venda[j].getIdVenda());
                    System.out.println("==========================");
                }
                System.out.println("Informe o Código da Venda:");
                informarID = scanner.nextInt();
                for (int i = 0; i < tamanhoDoVetor; i++) {

                    if (venda[i].getIdVenda() == informarID) {

                        venda[i].VerAVenda();
                        i = tamanhoDoVetor;
                    }

                }
                break;
            case 0:
                System.out.println("====VOLTAR====");
                break;
        }

    }
}
