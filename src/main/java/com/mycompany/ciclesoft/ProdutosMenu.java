/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ciclesoft;

import java.util.Scanner;

/**
 *
 * @author mathy
 */
public class ProdutosMenu extends Produtos {

    private int opcaoClasses;
    private int informarID;

    public void menuProdutos(Scanner scanner, Produtos produto[], int tamanhoDoVetor) {
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
    }
}
