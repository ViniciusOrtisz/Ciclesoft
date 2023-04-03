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

        Funcionarios[] funcionario = new Funcionarios[tamanhoDoVetor];

        for (int i = 0; i < tamanhoDoVetor; i++) {

            funcionario[i] = new Funcionarios(0, "", "", "", 0, 0, "", "", "", "", "", "", "", "", "", "", "", "");

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

                            break;
                        case 2:
                            System.out.println("====EDITAR CLIENTE====");

                            break;
                        case 3:
                            System.out.println("====EXCLUIR CLIENTE====");

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

                            break;

                        case 2:
                            System.out.println("====EDITAR VENDA====");

                            break;

                        case 3:
                            System.out.println("==== EXCLUIR VENDA ====");

                            break;
                        case 4:
                            System.out.println("==== RELATORIO DE VENDAS ====");

                            break;

                        case 5:
                            System.out.println("==== VER UMA VENDA ====");

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

                            break;
                        case 2:
                            System.out.println("====EDITAR PRODUTO====");

                            break;
                        case 3:
                            System.out.println("====EXCLUIR PRODUTO====");

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

                            break;
                        case 2:
                            System.out.println("====EDITAR FORNECEDOR====");

                            break;
                        case 3:
                            System.out.println("====EXCLUIR FORNECEDOR====");

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
                            System.out.println("====EDITAR FUNCINARIO====");

                            System.out.println("LISTA DE FUNCIONARIOS");
                            for (int j = 0; j < tamanhoDoVetor; j++) {
                                System.out.println("NOME : " + funcionario[j].getNome());
                                System.out.println("ID : " + funcionario[j].getIdFuncionario());
                                System.out.println("==========================");
                            }
                            System.out.println("Infomre o ID do FUNCINARIO :");
                            informarID = scanner.nextInt();

                            for (int i = 0; i < tamanhoDoVetor; i++) {

                                if (funcionario[i].getIdFuncionario() == informarID) {

                                    funcionario[i].AtualizarFuncionario();
                                    i = tamanhoDoVetor;
                                }

                            }

                            break;
                        case 3:
                            System.out.println("====EXCLUIR FUNCINARIO====");

                            System.out.println("LISTA DE FUNCINARIO");
                            for (int j = 0; j < tamanhoDoVetor; j++) {
                                System.out.println("NOME : " + funcionario[j].getNome());
                                System.out.println("ID : " + funcionario[j].getIdFuncionario());
                                System.out.println("==========================");
                            }
                            System.out.println("Infomre o ID do FUNCINARIO para excluir :");
                            informarID = scanner.nextInt();

                            for (int i = 0; i < tamanhoDoVetor; i++) {

                                if (funcionario[i].getIdFuncionario() == informarID) {

                                    funcionario[i].ExcluirFuncionario();
                                    i = tamanhoDoVetor;
                                }

                            }
                            break;
                            
                            
                        case 4: 
                            System.out.println("====RELATORIO FUNCINARIO====");

                            System.out.println("LISTA DE FUNCINARIO");
                            for (int j = 0; j < tamanhoDoVetor; j++) {
                                System.out.println("ID : " + funcionario[j].getIdFuncionario());
                                System.out.println("NOME : " + funcionario[j].getNome());
                                System.out.println("CARGO : " + funcionario[j].getCargo());
                                System.out.println("DATA ADMISSÃO : " + funcionario[j].getDataAdmissao());
                                System.out.println("SÁLARIO : " + funcionario[j].getSalario());
                                System.out.println("COMISSÃO : " + funcionario[j].getComissao());
                                System.out.println("NUMERO DA CARTEIRA DE TRABALHO : " + funcionario[j].getnCarteiraTrabalho());
                                System.out.println("DATA DE NASCIMENTO : " + funcionario[j].getDataNascimento());
                                System.out.println("CPF : " + funcionario[j].getCpf());
                                System.out.println("RG : " + funcionario[j].getRg());
                                System.out.println("TELEFONE : " + funcionario[j].getTelefone());
                                System.out.println("E-MAIL : " + funcionario[j].getEmail());
                                System.out.println("ENDEREÇO : " + funcionario[j].getEndereco());
                                System.out.println("BAIRRO : " + funcionario[j].getBairro());
                                System.out.println("REFERENCIA : " + funcionario[j].getReferencia());
                                System.out.println("CEP : " + funcionario[j].getCep());
                                System.out.println("ESTADO : " + funcionario[j].getEstado());
                                
                                
                                System.out.println("==========================");
                            }
                            
                            break;

                        case 0:

                            break;

                    }
                    break;

            }

        } while (opcao
                != 0);
    }

}
