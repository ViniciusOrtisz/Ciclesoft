/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ciclesoft;

import java.util.Scanner;

public class Ciclesoft {

    public static void main(String[] args) {

        Scanner Ler = new Scanner(System.in);
        int op = -1;

        System.out.println("|Ciclesoft|-|Seja Bem-Vindo| - Através do Menu Escolha um módulo");
        while (op != 0) {
            System.out.println("[0] Logout");
            System.out.println("[1] Clientes");
            System.out.println("[2] Produtos");
            System.out.println("[3] Funcionários");
            System.out.println("[4] Fornecedores");
            System.out.println("[5] Vendas");

            op = Ler.nextInt();

            switch (op) {
                
                case 1:
                    while (op != 0) {
                        System.out.println("Bem Vindo ao módulo de Clientes");
                        System.out.println("[1] Cadastro de Clientes");
                        System.out.println("[2] Atualizar Informações de Cliente");
                        System.out.println("[3] Consultar Informações de Cliente");
                        System.out.println("[4] Excluir Cliente");
                        
                        op = Ler.nextInt();

                        switch (op) {
                            
                            case 1:
                                System.out.println("Informe dados para cadastro do Cliente");
                                break;
                                

            }
        }
            }
            
        }
    }
}