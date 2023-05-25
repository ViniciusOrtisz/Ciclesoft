/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ciclesoft;

import java.util.Random;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

// Classe : Funcionários
// Analista Responsável: Erick
// Desenvolvedor: Vinicius
public class Funcionarios extends Pessoa {

    private int idFuncionario;
    private double salario;
    private String cargo;
    public String dataAdmissao;
    public double comissao;
    public String nCarteiraTrabalho;

    Random random = new Random();
    public Scanner Ler = new Scanner(System.in);

    List<Funcionarios> listaFuncionario = new ArrayList<>();

    public int opcaoWhile = -1;

    public Funcionarios(int idFuncionario, double salario, String cargo, String dataAdmissao, double comissao, String nCarteiraTrabalho, int idPessoa, String nome, String dataNascimento, String cpf, String cpfParaFormatar, String rgParaFormatar, String telefone, String email, String endereco, String bairro, String referencia, String cep, String cepParaFormatar, String cidade, String rg, String estado) {
        super(idPessoa, nome, dataNascimento, cpf, cpfParaFormatar, rgParaFormatar, telefone, email, endereco, bairro, referencia, cep, cepParaFormatar, cidade, rg, estado);
        this.idFuncionario = idFuncionario;
        this.salario = salario;
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
        this.comissao = comissao;
        this.nCarteiraTrabalho = nCarteiraTrabalho;
    }

    public Funcionarios() {
    }

    public void menuFuncionario() {
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

    public void consultarTodos() {

        for (Funcionarios funcionarios : listaFuncionario) {
            System.out.println("ID : " + funcionarios.getIdFuncionario());
            System.out.println("NOME : " + funcionarios.getNome());
            System.out.println("CARGO : " + funcionarios.getCargo());
            System.out.println("DATA ADMISSÃO : " + funcionarios.getDataAdmissao());
            System.out.println("SALARIO : " + funcionarios.getSalario());
            System.out.println("COMISSÃO : " + funcionarios.getComissao());
            System.out.println("NUMERO DA CERTEIRA DE TRABALHO : " + funcionarios.getnCarteiraTrabalho());
            System.out.println("DATA DE NASCIMENTO : " + funcionarios.getDataNascimento());
            System.out.println("CPF : " + funcionarios.getCpf());
            System.out.println("RG : " + funcionarios.getRg());
            System.out.println("TELEFONE : " + funcionarios.getTelefone());
            System.out.println("EMAIL : " + funcionarios.getEmail());
            System.out.println("ENDEREÇO : " + funcionarios.getEndereco());
            System.out.println("BAIRRO : " + funcionarios.getBairro());
            System.out.println("REFERENCIA : " + funcionarios.getReferencia());
            System.out.println("CEP : " + funcionarios.getCep());
            System.out.println("CIDADE : " + funcionarios.getCidade());
            System.out.println("ESTADO : " + funcionarios.getEstado());

            System.out.println("========================");
        }
    }

    public void CadastrarFuncionario() {

        listaFuncionario.add(new Funcionarios());
        for (Funcionarios funcionarios : listaFuncionario) {
            if (funcionarios.getIdFuncionario() == 0) {

                funcionarios.setIdFuncionario(random.nextInt(1000));
                System.out.println("ID DO FUNCIONARIO SERA " + funcionarios.getIdFuncionario());

                System.out.println("INFORME O NOME DO FUNCIONARIO ");
                funcionarios.setNome(Ler.next());
                Ler.nextLine();
                System.out.println("INFORME O CARGO ");
                funcionarios.setCargo(Ler.nextLine());

                System.out.println("INFORME A DATA DE ADMISSÃO :");
                funcionarios.setDataAdmissao(Ler.nextLine());

                System.out.println("INFORME O SALARIO :");
                funcionarios.setSalario(Ler.nextDouble());

                System.out.println("INFORME A COMISSÃO :");
                funcionarios.setComissao(Ler.nextDouble());
                Ler.nextLine();
                System.out.println("INFORME O NUMERO DA CERTEIRA DE TRABALHO :");
                funcionarios.setnCarteiraTrabalho(Ler.nextLine());

                System.out.println("DATA DE NASCIMENTO :");
                funcionarios.setDataNascimento(Ler.next());

                Ler.nextLine();
                System.out.println("INFORME O CPF ( apenas numeros , 11 numeros):");
                funcionarios.setCpf(cpf_formatador(cpfParaFormatar = Ler.next()));
                System.out.println(funcionarios.getCpf());

                System.out.println("INFORME O RG ( apenas numeros, 10 numeros ):");
                funcionarios.setRg(rg_formatador(rgParaFormatar = Ler.next()));
                System.out.println(funcionarios.getRg());

                Ler.nextLine();

                System.out.println("INFORME O TELEFONE :");
                funcionarios.setTelefone(Ler.next());
                System.out.println("INFORME O EMAIL :");
                funcionarios.setEmail(Ler.next());
                Ler.nextLine();
                System.out.println("INFORME O ENDERECO :");
                funcionarios.setEndereco(Ler.next());
                Ler.nextLine();
                System.out.println("INFORME O BAIRRO :");
                funcionarios.setBairro(Ler.next());
                Ler.nextLine();
                System.out.println("INFORME ALGUMA REFERENCIA :");
                funcionarios.setReferencia(Ler.next());
                Ler.nextLine();

                System.out.println("INFORME O CEP (apenas numeros, 7 numeros):");
                funcionarios.setCep(cep_formatador(cepParaFormatar = Ler.next()));
                System.out.println(funcionarios.getCep());

                Ler.nextLine();

                System.out.println("INFORME A CIDADE :");
                funcionarios.setCidade(Ler.next());
                Ler.nextLine();
                System.out.println("INFORME O ESTADO :");
                funcionarios.setEstado(Ler.next());
                Ler.nextLine();
                System.out.println("CADASTRO REALIZADO COM SUCESSO");

                break;
            }
        }

    }

    public void AtualizarFuncionario() {
        System.out.println("INFORME O ID QUE SERA ATUALIZADO ");
        int buscarId = Ler.nextInt();
        for (Funcionarios funcionarios : listaFuncionario) {
            if (funcionarios.getIdFuncionario() == buscarId) {

                System.out.println("[1]ID");
                System.out.println("[2]NOME");
                System.out.println("[3]CARGO");
                System.out.println("[4]DATA ADMISSÃO");
                System.out.println("[5]SALARIO");
                System.out.println("[6]COMISSÃO");
                System.out.println("[7]NUMERO CARTEIRA DE TRABALHO");
                System.out.println("[8]DATA NASCIMENTO");
                System.out.println("[9]CPF");
                System.out.println("[10]RG");
                System.out.println("[11]TELEFONE");
                System.out.println("[12]E-MAIL");
                System.out.println("[13]ENDEREÇO");
                System.out.println("[14]BAIRRO");
                System.out.println("[15]REFERENCIA");
                System.out.println("[16]CEP");
                System.out.println("[17]CIDADE");
                System.out.println("[18]ESTADO");

                while (!Ler.hasNextInt()) {
                    System.out.print("Tente novamente escolhendo uma das opcoes acima");
                    Ler.next(); //
                }

                int opcao = Ler.nextInt();
                switch (opcao) {

                    case 1:
                        System.out.println("INFORME O ID ");
                        funcionarios.setIdFuncionario(Ler.nextInt());

                        System.out.println("==== CADASTRO ATUALIZADO ====");
                        break;

                    case 2:
                        System.out.println("INFORME O NOME DO FUNCIONARIO ");
                        funcionarios.setNome(Ler.nextLine());

                        System.out.println("==== CADASTRO ATUALIZADO ====");
                        break;

                    case 3:
                        System.out.println("INFORME O CARGO ");
                        funcionarios.setCargo(Ler.nextLine());

                        System.out.println("==== CADASTRO ATUALIZADO ====");
                        break;

                    case 4:
                        System.out.println("INFORME A DATA DE ADMISSÃO :");
                        funcionarios.setDataAdmissao(Ler.next());

                        System.out.println("==== CADASTRO ATUALIZADO ====");
                        break;

                    case 5:
                        System.out.println("INFORME O SALARIO :");
                        funcionarios.setSalario(Ler.nextDouble());

                        System.out.println("==== CADASTRO ATUALIZADO ====");
                        break;

                    case 6:
                        System.out.println("INFORME A COMISSÃO :");
                        funcionarios.setComissao(Ler.nextDouble());

                        System.out.println("==== CADASTRO ATUALIZADO ====");
                        break;

                    case 7:
                        System.out.println("INFORME O NUMERO DA CERTEIRA DE TRABALHO :");
                        funcionarios.setnCarteiraTrabalho(Ler.next());

                        System.out.println("==== CADASTRO ATUALIZADO ====");
                        break;

                    case 8:
                        System.out.println("DATA DE NASCIMENTO :");
                        funcionarios.setDataNascimento(Ler.next());

                        System.out.println("==== CADASTRO ATUALIZADO ====");
                        break;

                    case 9:
                        System.out.println("INFORME O CPF :");
                        funcionarios.setCpf(cpf_formatador(cpfParaFormatar = Ler.next()));
                        System.out.println(getCpf());
                        System.out.println("==== CADASTRO ATUALIZADO ====");
                        break;

                    case 10:
                        System.out.println("INFORME O RG :");
                        funcionarios.setRg(rg_formatador(rgParaFormatar = Ler.next()));
                        System.out.println(getRg());
                        System.out.println("==== CADASTRO ATUALIZADO ====");

                        break;

                    case 11:
                        System.out.println("INFORME O TELEFONE :");
                        funcionarios.setTelefone(Ler.next());

                        System.out.println("==== CADASTRO ATUALIZADO ====");
                        break;

                    case 12:
                        System.out.println("INFORME O EMAIL :");
                        funcionarios.setEmail(Ler.nextLine());

                        System.out.println("==== CADASTRO ATUALIZADO ====");
                        break;

                    case 13:
                        System.out.println("INFORME O ENDERECO :");
                        funcionarios.setEndereco(Ler.nextLine());

                        System.out.println("==== CADASTRO ATUALIZADO ====");
                        break;

                    case 14:
                        System.out.println("INFORME O BAIRRO :");
                        funcionarios.setBairro(Ler.next());

                        System.out.println("==== CADASTRO ATUALIZADO ====");
                        break;

                    case 15:
                        System.out.println("INFORME ALGUMA REFERENCIA :");
                        funcionarios.setReferencia(Ler.nextLine());

                        System.out.println("==== CADASTRO ATUALIZADO ====");
                        break;

                    case 16:
                        System.out.println("INFORME O CEP :");
                        funcionarios.setCep(cep_formatador(cepParaFormatar = Ler.next()));
                        System.out.println(getCep());

                        System.out.println("==== CADASTRO ATUALIZADO ====");
                        break;

                    case 17:
                        System.out.println("INFORME A CIDADE :");
                        funcionarios.setCidade(Ler.nextLine());
                        System.out.println("==== CADASTRO ATUALIZADO ====");

                        break;

                    case 18:
                        System.out.println("INFORME O ESTADO :");
                        funcionarios.setEstado(Ler.nextLine());
                        System.out.println("==== CADASTRO ATUALIZADO ====");

                        break;

                    case 0:
                        System.out.println("==== SAIR ====");
                        opcaoWhile = 0; //finaliza o metodod

                        break;

                }

            }

        }

    }

    public void ExcluirFuncionario() {
        for (int i = 0; i < listaFuncionario.size(); i++) {
            System.out.println("INFORME O ID PARA DELETAR");
            int idExcluir = Ler.nextInt();
            if (listaFuncionario.get(i).getIdFuncionario() == idExcluir) {

                listaFuncionario.remove(i);
                System.out.println("FUNCIONARIO EXCLUIDO");
                break;
            }

        }

    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public String getnCarteiraTrabalho() {
        return nCarteiraTrabalho;
    }

    public void setnCarteiraTrabalho(String nCarteiraTrabalho) {
        this.nCarteiraTrabalho = nCarteiraTrabalho;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String cpf_formatador(String cpf) {
        cpf = cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11);

        return cpf;

    }

    public String rg_formatador(String rg) {
        rg = rg.substring(0, 2) + "." + rg.substring(2, 5) + "." + rg.substring(5, 8) + "-" + rg.substring(8, 10);
        return rg;
    }

    public String cep_formatador(String cep) {
        cep = cep.substring(0, 5) + "-" + cep.substring(5, 8);
        return cep;
    }
}
