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
            System.out.println("xxxxxxxx MENU FUNCIONARIO xxxxxxxx");

            System.out.println("[1]CADASTRAR NOVO FUNCIONARIO");
            System.out.println("[2]EDITAR FUNCIONARIO");
            System.out.println("[3]EXCLUIR FUNCIONARIO");
            System.out.println("[4]CONSULTAR TODOS");
            System.out.println("[0]SAIR");

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
