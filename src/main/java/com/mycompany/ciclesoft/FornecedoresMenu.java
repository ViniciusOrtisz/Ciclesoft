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
public class FornecedoresMenu extends Fornecedores{
    private int opcaoClasses;
    private int informarID;
    
    public void menuFornecedores(Scanner scanner, Fornecedores[] fornecedor, int tamanhoDoVetor){
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
                            for (int i = 0; i < tamanhoDoVetor; i++) {
                                
                                if (fornecedor[i].getIdFornecedor() == 0) {
                                    System.out.println("Vetor disponivel > " + i);
                                    fornecedor[i].cadastrarFornecedor();
                                    i = tamanhoDoVetor;
                                    
                                    break;
                                    
                                }
                            }
                            break;
                        case 2:
                            System.out.println("====EDITAR FORNECEDOR====");
                            
                            System.out.println("LISTA DE FORNECEDORES");
                            for (int j = 0; j < tamanhoDoVetor; j++) {
                                System.out.println("NOME : " + fornecedor[j].getNomeFornecedor());
                                System.out.println("ID : " + fornecedor[j].getIdFornecedor());
                                System.out.println("==========================");
                            }
                            System.out.println("Informe o Código do Fornecedor:");
                            informarID = scanner.nextInt();
                            
                            for (int i = 0; i < tamanhoDoVetor; i++) {
                                
                                if (fornecedor[i].getIdFornecedor() == informarID) {
                                    
                                    fornecedor[i].atualizarFornecedor();
                                    i = tamanhoDoVetor;
                                }
                                
                            }
                            break;
                        case 3:
                            System.out.println("====EXCLUIR FORNECEDOR====");
                            
                            System.out.println("LISTA DE FORNECEDORES");
                            for (int j = 0; j < tamanhoDoVetor; j++) {
                                System.out.println("NOME : " + fornecedor[j].getNomeFornecedor());
                                System.out.println("ID : " + fornecedor[j].getIdFornecedor());
                                System.out.println("==========================");
                            }
                            System.out.println("Informe o Código do Fornecedor:");
                            informarID = scanner.nextInt();
                            
                            for (int i = 0; i < tamanhoDoVetor; i++) {
                                
                                if (fornecedor[i].getIdFornecedor() == informarID) {
                                    
                                    fornecedor[i].excluirFornecedor();
                                    i = tamanhoDoVetor;
                                }
                                
                            }
                            break;
                        
                        case 0:
                            
                            break;
                        
                    }
    }
}