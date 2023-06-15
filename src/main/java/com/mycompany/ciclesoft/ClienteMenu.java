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
public class ClienteMenu {

    private int opcaoClasses;
    private int informarID;

    public void menuCliente(Scanner scanner, Cliente[] cliente, int tamanhoDoVetor) {
            System.out.println("╔═════════════════════   @Ciclesoft   ══════════════════════╗");
            System.out.println("╚═════════════════════  Menu Cliente  ══════════════════════╝");
            System.out.println("║                       [1]Cadastrar Cliente                ║");                         
            System.out.println("║                       [2]Editar Cliente                   ║"); 
            System.out.println("║                       [3]Excluir Cliente                  ║"); 
            System.out.println("║                       [0]Voltar                           ║"); 
            System.out.println("╚═══════════════════════════════════════════════════════════╝");
        while (!scanner.hasNextInt()) {
            System.out.print("Tente novamente escolhendo uma das opcoes acima");
            scanner.next(); //
        }
        opcaoClasses = scanner.nextInt();
        switch (opcaoClasses) {
            case 1:
                System.out.println("═══ Cadastar Cliente ═══");
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
                System.out.println("═══ Editar Cliente ═══");
                System.out.println("   Lista de clientes   ");
                for (int j = 0; j < tamanhoDoVetor; j++) {
                    System.out.println("Nome : " + cliente[j].getNome());
                    System.out.println("ID: " + cliente[j].getIdCliente());
                    System.out.println("══════════════════════════");
                }
                System.out.println("Informe o Código do Cliente:");
                informarID = scanner.nextInt();

                for (int i = 0; i < tamanhoDoVetor; i++) {

                    if (cliente[i].getIdCliente() == informarID) {

                        cliente[i].AtualizarCliente();
                        i = tamanhoDoVetor;
                    }

                }
                break;
            case 3:
                System.out.println("═══ Excluir Cliente ═══");
                System.out.println("   Lista de clientes   ");
                for (int j = 0; j < tamanhoDoVetor; j++) {
                    System.out.println("Nome : " + cliente[j].getNome());
                    System.out.println("ID : " + cliente[j].getIdCliente());
                    System.out.println("══════════════════════════");
                }
                System.out.println("Informe o Código do Cliente:");
                informarID = scanner.nextInt();
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
    }
}
