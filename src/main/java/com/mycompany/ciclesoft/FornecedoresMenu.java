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
            System.out.println("╔═════════════════════    @Ciclesoft   ═════════════════════╗");
            System.out.println("╚═════════════════════ Menu Fornecedor ═════════════════════╝");
            System.out.println("║                       [1]Cadastrar Fornecedor             ║");                         
            System.out.println("║                       [2]Editar Fornecedor                ║"); 
            System.out.println("║                       [3]Excluir Fornecedor               ║"); 
            System.out.println("║                       [0]Sair                             ║"); 
            System.out.println("╚═══════════════════════════════════════════════════════════╝");
        
                    while (!scanner.hasNextInt()) {
                        System.out.print("Tente novamente escolhendo uma das opcoes acima");
                        scanner.next();
                    }
                    opcaoClasses = scanner.nextInt();
                    switch (opcaoClasses) {
                        case 1:
                            System.out.println("═══ Cadastrar Fornecedor ═══");
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
                            System.out.println("═══ Editar Fornecedor ═══");
                            
                            System.out.println("Lista de fornecedores");
                            for (int j = 0; j < tamanhoDoVetor; j++) {
                                System.out.println("Nome : " + fornecedor[j].getNomeFornecedor());
                                System.out.println("ID : " + fornecedor[j].getIdFornecedor());
                                System.out.println("══════════════════════════════");
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
                            System.out.println("═══ Excluir Fornecedor ═══");
                            
                            //EDITAR A LISTA DE FORNECEDORES UTILIZANDO o Método @Override toString() 'Que personaliza' o metodo de listar fornecedores
                            System.out.println("Lista de fornecedores");
                            for (int j = 0; j < tamanhoDoVetor; j++) {
                                System.out.println("NOME : " + fornecedor[j].getNomeFornecedor());
                                System.out.println("ID : " + fornecedor[j].getIdFornecedor());
                                System.out.println("══════════════════════════════");
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
