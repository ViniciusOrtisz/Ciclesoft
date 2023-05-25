/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ciclesoft;

import java.util.Scanner;
import java.util.Random;

//Analista: Maria
//Desenvolvedor: Willyan

public class Cliente extends Pessoa{

    Random random = new Random();
    public Scanner Ler = new Scanner(System.in);
    public Cliente cliente[];
    private int idCliente;

    public Cliente(Cliente[] cliente, int idCliente, int idPessoa, String nome, String dataNascimento, String cpf, String cpfParaFormatar, String rgParaFormatar, String telefone, String email, String endereco, String bairro, String referencia, String cep, String cepParaFormatar, String cidade, String rg, String estado) {
        super(idPessoa, nome, dataNascimento, cpf, cpfParaFormatar, rgParaFormatar, telefone, email, endereco, bairro, referencia, cep, cepParaFormatar, cidade, rg, estado);
        this.cliente = cliente;
        this.idCliente = idCliente;
    }
    

    public Cliente(){
    }

    public Cliente[] getCliente() {
        return cliente;
    }

    public void setCliente(Cliente[] cliente) {
        this.cliente = cliente;
    }

    public void AtualizarCliente() {

        System.out.println("[1]ID");
        System.out.println("[2]NOME");
        System.out.println("[3]CPF");
        System.out.println("[4]RG");
        System.out.println("[5]ENDEREÇO");
        System.out.println("[6]BAIRRO");
        System.out.println("[7]ESTADO");
        System.out.println("[8]CEP");
        System.out.println("[9]TELEFONE");
        while (!Ler.hasNextInt()) {
            System.out.print("Tente novamente escolhendo uma das opcoes acima");
            Ler.next(); //
        }

        int opcao = Ler.nextInt();
        switch (opcao) {

            case 1:
                System.out.println("INFORME O ID :" + "");
                this.idCliente = Ler.nextInt();
                break;
            case 2:
                System.out.println("INFORME O NOME : ");
                this.nome = Ler.next();
                break;
            case 3:
                System.out.println("INFORME O CPF ");
                this.cpf = Ler.next();
                break;
            case 4:
                System.out.println("INFORME O RG :");
                 String rg = Ler.next();
                 setRg(rg);
                break;
            case 5:
                System.out.println("INFORME O ENDEREÇO :");
                this.endereco = Ler.next();
                break;
            case 6:
                System.out.println("INFORME O BAIRRO :");
                this.bairro = Ler.next();
                break;
            case 7:
                System.out.println("INFORME O ESTADO :");
                this.estado = Ler.next();
                break;
            case 8:
                System.out.println("INFORME O CEP :");
                this.cep = Ler.next();
                break;
            case 9:
                System.out.println("INFORME O TELEFONE :");
                this.telefone = Ler.next();
                break;
            case 0:

                break;

        }

    }

    public void ExcluirCliente() {
        this.idCliente = 0;
        this.nome = "";
        this.cpf = "";
        setRg("");
        this.endereco = "";
                
        this.bairro = "";
        this.estado = "";
        this.cep = "";
        this.telefone = "";

        System.out.println("CLIENTE DELETADO");

    }

    public void CadastrarCliente() {
        System.out.println("O ID DO CLIENTE SERÁ:");
        this.idCliente = random.nextInt(1000);
        System.out.println(idCliente);

        System.out.println("INFORME O NOME DO " + "CLIENTE" + " :");
        this.nome = Ler.next();
        System.out.println("INFORME O CPF ");
        this.cpf = Ler.next();
        System.out.println("INFORME O RG :");
        this.rg = Ler.next();
        System.out.println("INFORME O ENDEREÇO :");
        this.endereco = Ler.next();
        System.out.println("INFORME O BAIRRO :");
        this.bairro = Ler.next();
        System.out.println("INFORME O ESTADO :");
        this.estado = Ler.next();
        System.out.println("INFORME O CEP :");
        this.cep = Ler.next();
        System.out.println("INFORME O TELEFONE :");
        this.telefone = Ler.next();

        System.out.println("CADASTRO REALIZADO COM SUCESSO");

    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
