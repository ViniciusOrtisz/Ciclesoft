/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ciclesoft;

/**
 *
 * @author aluno
 */
public class FuncionariosMenu extends Funcionarios{
        private int opcaoWhile;
        private int opcaoClasses;
        private int informarID;
    
      
        public void menuFuncionarios() {
        opcaoWhile = -1;
        while (opcaoWhile != 0) {      
            System.out.println("╔═════════════════════    @Ciclesoft    ════════════════════╗");
            System.out.println("╚═════════════════════ Menu Funcionário ════════════════════╝");
            System.out.println("║                      [1]Cadastrar Novo Funcionário        ║");                         
            System.out.println("║                      [2]Editar Funcionário                ║"); 
            System.out.println("║                      [3]Excluir Funcionário               ║"); 
            System.out.println("║                      [4]Consultar Todos                   ║");
            System.out.println("║                      [0]Sair                              ║"); 
            System.out.println("╚═══════════════════════════════════════════════════════════╝");

            while (!Ler.hasNextInt()) {
                System.out.print("Tente novamente escolhendo uma das opcoes acima");
                Ler.next();

            }

            int opcaoSwitch = Ler.nextInt();
            switch (opcaoSwitch) {

                case 1 ->
                    CadastrarFuncionario();

                case 2 ->
                    AtualizarFuncionario();

                case 3 ->
                    ExcluirFuncionario();

                case 4 ->
                    consultarTodos();

                case 0 ->
                    opcaoWhile = 0;

            }

        }
    }
}
