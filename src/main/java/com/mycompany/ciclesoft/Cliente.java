/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ciclesoft;

import java.util.Scanner;
import java.util.Random;

public class Cliente extends Pessoa {

    Random random = new Random();
    public Scanner Ler = new Scanner(System.in);
    public Cliente cliente[];
    private int idCliente;

    public Cliente(Cliente[] cliente, int idCliente, int idPessoa, String nome, String dataNascimento, String cpf, String cpfParaFormatar, String rgParaFormatar, String telefone, String email, String endereco, String bairro, String referencia, String cep, String cepParaFormatar, String cidade, String rg, String estado) {
        super(idPessoa, nome, dataNascimento, cpf, cpfParaFormatar, rgParaFormatar, telefone, email, endereco, bairro, referencia, cep, cepParaFormatar, cidade, rg, estado);
        this.cliente = cliente;
        this.idCliente = idCliente;
    }

    public Cliente() {
    }

    public Cliente[] getCliente() {
        return cliente;
    }

    public void setCliente(Cliente[] cliente) {
        this.cliente = cliente;
    }

public void AtualizarCliente() {
    System.out.println("[1] ID");
    System.out.println("[2] Nome");
    System.out.println("[3] CPF");
    System.out.println("[4] RG");
    System.out.println("[5] Endereço");
    System.out.println("[6] Bairro");
    System.out.println("[7] Estado");
    System.out.println("[8] CEP");
    System.out.println("[9] Telefone");
    while (!Ler.hasNextInt()) {
        System.out.print("Tente novamente escolhendo uma das opções acima: ");
        Ler.next(); //
    }

           int opcao = Ler.nextInt();
    switch (opcao) {
        case 1:
            System.out.println("Informe o ID:");
            this.idCliente = Ler.nextInt();
            break;
        case 2:
            System.out.println("Informe o nome:");
            this.nome = Ler.next();
            break;
        case 3:
            System.out.println("Informe o CPF:");
            this.cpf = Ler.next();
            break;
        case 4:
            System.out.println("Informe o RG:");
            String rg = Ler.next();
            setRg(rg);
            break;
        case 5:
            System.out.println("Informe o endereço:");
            this.endereco = Ler.next();
            break;
        case 6:
            System.out.println("Informe o bairro:");
            this.bairro = Ler.next();
            break;
        case 7:
            System.out.println("Informe o estado:");
            this.estado = Ler.next();
            break;
        case 8:
            System.out.println("Informe o CEP:");
            this.cep = Ler.next();
            break;
        case 9:
            System.out.println("Informe o telefone:");
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
         System.out.println("Cliente deletado");
    }

        public void CadastrarCliente() {
        System.out.println("O ID do cliente será:");
        this.idCliente = random.nextInt(1000);
        System.out.println(idCliente);
        System.out.println("Informe o nome do cliente:");
        this.nome = Ler.next();
        System.out.println("Informe o CPF:");
        this.cpf = Ler.next();
        System.out.println("Informe o RG:");
        String rg = Ler.next();
        setRg(rg);
        System.out.println("Informe o endereço:");
        this.endereco = Ler.next();
        System.out.println("Informe o bairro:");
        this.bairro = Ler.next();
        System.out.println("Informe o estado:");
        this.estado = Ler.next();
        System.out.println("Informe o CEP:");
        this.cep = Ler.next();
        System.out.println("Informe o telefone:");
        this.telefone = Ler.next();
        System.out.println("Cadastro realizado com sucesso");
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getRg() {
        return getRg();
    }

    @Override
    public void setRg(String rg) {
        setRg(rg);
    }

    @Override
    public String getEndereco() {
        return endereco;
    }

    @Override
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String getBairro() {
        return bairro;
    }

    @Override
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public String getEstado() {
        return estado;
    }

    @Override
    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String getCep() {
        return cep;
    }

    @Override
    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
