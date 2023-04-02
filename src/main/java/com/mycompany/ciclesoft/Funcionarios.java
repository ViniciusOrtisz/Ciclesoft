/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ciclesoft;

import java.util.Random;
import java.util.Scanner;


public class Funcionarios {

    Random random = new Random();
    public Scanner Ler = new Scanner(System.in);

    private int idFuncionario;
    public String nome;
    public String cargo;
    public String dataAdmissao;
    private double salario;
    public double comissao;
    public String nCarteiraTrabalho;
    public String dataNascimento;
    public String cpf;
    public String rg;
    public String telefone;
    public String email;
    public String endereco;
    public String bairro;
    public String referencia;
    public String cep;
    public String cidade;
    public String estado;

    public Funcionarios(int idFuncionario, String nome, String cargo, String dataAdmissao, double salario, double comissao, String nCarteiraTrabalho, String dataNascimento, String cpf, String rg, String telefone, String email, String endereco, String bairro, String referencia, String cep, String cidade, String estado) {
        this.idFuncionario = idFuncionario;
        this.nome = nome;
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
        this.comissao = comissao;
        this.nCarteiraTrabalho = nCarteiraTrabalho;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.bairro = bairro;
        this.referencia = referencia;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }

    public void CadastrarFuncionario() {
        System.out.println("O ID DO FORNECEDOR SERÁ :" + "");
        this.idFuncionario = random.nextInt(1000);
        System.out.println(idFuncionario);

        System.out.println("INFORME O NOME DO " + "FUNCIONARIO" + " :");
        this.nome = Ler.next();
        System.out.println("INFORME O CARGO ");
        this.cargo = Ler.next();
        System.out.println("INFORME A DATA DE ADMISSÃO :");
        this.dataAdmissao = Ler.next();
        System.out.println("INFORME O SALARIO :");
        this.salario = Ler.nextDouble();
        System.out.println("INFORME A COMISSÃO :");
        this.comissao = Ler.nextDouble();
        System.out.println("INFORME O NUMERO DA CERTEIRA DE TRABALHO :");
        this.nCarteiraTrabalho = Ler.next();
        System.out.println("DATA DE NASCIMENTO :");
        this.dataNascimento = dataNascimento;
        System.out.println("INFORME O CPF :");
        this.cpf = Ler.next();
        System.out.println("INFORME O RG :");
        this.rg = Ler.next();
        System.out.println("INFORME O TELEFONE :");
        this.telefone = Ler.next();
        System.out.println("INFORME O EMAIL :");
        this.email = Ler.next();
        System.out.println("INFORME O ENDERECO :");
        this.endereco = Ler.next();
        System.out.println("INFORME O BAIRRO :");
        this.bairro = Ler.next();
        System.out.println("INFORME ALGUMA REFERENCIA :");
        this.referencia = Ler.next();
        System.out.println("INFORME O CEP :");
        this.cep = Ler.next();
        System.out.println("INFORME A CIDADE :");
        this.cidade = Ler.next();
        System.out.println("INFORME O ESTADO :");
        this.estado = Ler.next();

        System.out.println("CADASTRO REALIZADO COM SUCESSO");

    }

    public void AtualizarFuncionario() {

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
        System.out.println("[18]ESTAADO");

        while (!Ler.hasNextInt()) {
            System.out.print("Tente novamente escolhendo uma das opcoes acima");
            Ler.next(); //
        }

        int opcao = Ler.nextInt();
        switch (opcao) {

            case 1:
                System.out.println("INFORME O ID : ");
                this.idFuncionario = Ler.nextInt();
                break;
            case 2:
                System.out.println("INFORME O NOME : ");
                this.nome = Ler.next();
                break;
            case 3:
                System.out.println("INFORME O CARGO ");
                this.cargo = Ler.next();
                break;
            case 4:
                System.out.println("INFORME A DATA DE ADMISSÃO :");
                this.rg = Ler.next();
                break;
            case 5:
                System.out.println("INFORME O SALARIO :");
                this.salario = Ler.nextDouble();
                break;
            case 6:
                System.out.println("INFORME A COMISSÃO :");
                this.comissao = Ler.nextDouble();
                break;
            case 7:
                System.out.println("INFORME O NUMERO DA CERTEIRA DE TRABALHO :");
                this.nCarteiraTrabalho = Ler.next();
                break;

            case 8:
                System.out.println("DATA DE NASCIMENTO :");
                this.dataNascimento = Ler.next();

                break;
            case 9:
                System.out.println("INFORME O CPF :");
                this.cpf = Ler.next();
                break;
            case 10:
                System.out.println("INFORME O RG :");
                this.rg = Ler.next();
                break;
            case 11:
                System.out.println("INFORME O TELEFONE :");
                this.telefone = Ler.next();
                break;
            case 12:
                System.out.println("INFORME O EMAIL :");
                this.email = Ler.next();

                break;
            case 13:
                System.out.println("INFORME O ENDERECO :");
                this.endereco = Ler.next();
                break;
            case 14:
                System.out.println("INFORME O BAIRRO :");
                this.bairro = Ler.next();

                break;
            case 15:
                System.out.println("INFORME ALGUMA REFERENCIA :");
                this.referencia = Ler.next();
                break;
            case 16:
                System.out.println("INFORME O CEP :");
                this.cep = Ler.next();

                break;

            case 17:
                System.out.println("INFORME A CIDADE :");
                this.cidade = Ler.next();

                break;
            case 18:
                System.out.println("INFORME O ESTADO :");
                this.estado = Ler.next();
                break;
            case 0:

                break;

        }

    }

    public void ExcluirFuncionario() {
        this.idFuncionario = 0;
        this.nome = "";
        this.cargo = "";
        this.dataAdmissao = "";
        this.salario = 0;
        this.comissao = 0;
        this.nCarteiraTrabalho = "";
        this.dataNascimento = "";
        this.cpf = "";
        this.rg = "";
        this.telefone = "";
        this.email = "";
        this.endereco = "";
        this.bairro = "";
        this.referencia = "";
        this.cep = "";
        this.cidade = "";
        this.estado = "";

        System.out.println("FUNCIONARIO DELETADO");

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

}
