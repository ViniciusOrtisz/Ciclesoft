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
                System.out.println("LISTA DE CLIENTES");
                for (int j = 0; j < tamanhoDoVetor; j++) {
                    System.out.println("NOME : " + cliente[j].getNome());
                    System.out.println("ID : " + cliente[j].getIdCliente());
                    System.out.println("==========================");
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
                System.out.println("====EXCLUIR CLIENTE====");
                System.out.println("LISTA DE CLIENTES");
                for (int j = 0; j < tamanhoDoVetor; j++) {
                    System.out.println("NOME : " + cliente[j].getNome());
                    System.out.println("ID : " + cliente[j].getIdCliente());
                    System.out.println("==========================");
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
