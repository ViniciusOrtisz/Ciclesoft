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

            System.out.println("[1]CLIENTE");
            System.out.println("[2]VENDAS");
            System.out.println("[3]PRODUTOS");
            System.out.println("[4]FORNECEDORES");
            System.out.println("[5]FUNCIONARIOS");
            System.out.println("[0]SAIR");

            // enquanto a proxima leitura for DIFERENTE de um INT 
            while (!scanner.hasNextInt()) {
                System.out.print("Try again: Invalid character");
                scanner.next(); // throw away
            }
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:

                    System.out.println("ENTROU NA OPCÃO CLIENTE");
                    System.out.println("[1]CADASTRAR CLIENTE");
                    System.out.println("[2]EDITAR CLIENTE");
                    System.out.println("[3]EXCLUIR CLIENTE");
                    System.out.println("[0]VOLTAR");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Try again: Invalid character");
                        scanner.next(); // throw away
                    }
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Nome : ");
                            
                            break;

                        case 2:
                            System.out.println("EDITAR CLIENTE");
                            break;
                        case 3:
                            System.out.println("EXCLUIR CLIENTE");
                            break;

                        case 0:

                            break;

                    }
                    break;

                case 2:
                    System.out.println("OPCAO2");

                    break;
                case 3:
                    System.out.println("OPCAO3");

                    break;
                case 4:
                    System.out.println("OPCAO4");

                    break;
                case 5:
                    System.out.println("OPCAO5");

                    break;

                case 0:

                    break;

            }

        } while (true);
    }

}
