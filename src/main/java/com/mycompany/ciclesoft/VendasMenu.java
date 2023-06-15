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
        super.CadastrarVenda();
    }
    
    public void CadastrarVenda(int index) {
        System.out.println("Nosso Cadastro - Número de Venda: " + index);
        super.CadastrarVenda();
    }
 
    public void menuVendas(Scanner scanner, Vendas[] venda, int tamanhoDoVetor) { 
     System.out.println("╔═════════════════════   @Ciclesoft   ══════════════════════╗");
     System.out.println("╚═════════════════════   Menu Venda   ══════════════════════╝");
     System.out.println("║                       [1]Cadastrar Nova Venda             ║");      
     System.out.println("║                       [1.1]Cadastrar Produto na Venda     ║");
     System.out.println("║                       [2]Editar Venda                     ║"); 
     System.out.println("║                       [3]Excluir Venda                    ║");
     System.out.println("║                       [4]Relatórios de Vendas             ║");
     System.out.println("║                       [5]Ver uma Venda                    ║");
     System.out.println("║                       [0]Sair                             ║"); 
     System.out.println("╚═══════════════════════════════════════════════════════════╝");


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
                System.out.println("════ Cadastrar Produto na Venda ════");
                for (int i = 0; i < tamanhoDoVetor; i++) {

                    if (venda[i].getIdVenda() == 0) {
                        System.out.println("Vetor disponivel > " + i);
                        venda[i].CadastrarProdVenda();
                        i = tamanhoDoVetor;
                    }
                }
                break;

            case 2:
                System.out.println("════ Editar Venda ════");
                System.out.println("Lista de vendas");

                for (int j = 0; j < tamanhoDoVetor; j++) {
                    System.out.println("ID Do Produto Vendido: " + venda[j].getIdProduto());
                    System.out.println("ID Da Venda Realizada: " + venda[j].getIdVenda());
                    System.out.println("════════════════════════════");
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
                System.out.println("════ Excluir Venda ════");
                System.out.println("Lista de vendas");

                for (int j = 0; j < tamanhoDoVetor; j++) {
                    System.out.println("ID Do Produto Vendido: " + venda[j].getIdProduto());
                    System.out.println("ID Da Venda Realizada: " + venda[j].getIdVenda());
                    System.out.println("════════════════════════════");
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
                System.out.println("════ Relatório de vendas ════");
                System.out.println("Lista de vendas");

                for (int j = 0; j < tamanhoDoVetor; j++) {
                    System.out.println("ID Do Produto Vendido: " + venda[j].getIdProduto());
                    System.out.println("ID Da Venda Realizada: " + venda[j].getIdVenda());
                    System.out.println("Quantidade Vendida: " + venda[j].getQuantidade());
                    System.out.println("Desconto aplicado: " + venda[j].getDesconto());
                    System.out.println("════════════════════════════");
                }
                break;

            case 5:
                System.out.println("════ Ver uma venda ════");
                System.out.println("Lista de vendas");

                for (int j = 0; j < tamanhoDoVetor; j++) {
                    System.out.println("ID Do Produto Vendido: " + venda[j].getIdProduto());
                    System.out.println("ID Da Venda Realizada: " + venda[j].getIdVenda());
                    System.out.println("════════════════════════════");
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
                System.out.println("════ Sair ════");
                break;
        }

    }
}
