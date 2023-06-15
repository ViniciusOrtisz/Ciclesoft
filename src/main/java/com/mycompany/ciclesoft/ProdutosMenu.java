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
     System.out.println("╔═════════════════════   @Ciclesoft   ══════════════════════╗");
     System.out.println("╚═════════════════════ Menu Produtos  ══════════════════════╝");
     System.out.println("║                       [1]Cadastrar Produto                ║");                         
     System.out.println("║                       [2]Editar Produto                   ║"); 
     System.out.println("║                       [3]Excluir Produto                  ║");
     System.out.println("║                       [0]Sair                             ║"); 
     System.out.println("╚═══════════════════════════════════════════════════════════╝");

        while (!scanner.hasNextInt()) {
            System.out.print("Tente novamente escolhendo uma das opcoes acima");
            scanner.next();
        }
        opcaoClasses = scanner.nextInt();
        switch (opcaoClasses) {
            case 1:
                System.out.println("═══ Cadastrar Produto ═══");
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
                System.out.println("═══ Editar Produto ═══");
                System.out.println("Lista de Produtos");

                for (int j = 0; j < tamanhoDoVetor; j++) {
                    System.out.println("ID : " + produto[j].getIdProduto());
                    System.out.println("═══════════════════════════");
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
                System.out.println("═══ Excluir Produto ═══");
                System.out.println("Lista de Produtos");
                for (int j = 0; j < tamanhoDoVetor; j++) {
                    System.out.println("ID : " + produto[j].getIdProduto());
                    System.out.println("═══════════════════════════");
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
