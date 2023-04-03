/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ciclesoft;

import java.util.Random;
import java.util.Scanner;


// Classe : Fornecedores
// Analista Responsável: Willyan
// Desenvolvedor: Vinicius


public class Fornecedores {

    Random random = new Random();
    public Scanner Ler = new Scanner(System.in);

    private int idFornecedor;
    public String nomeFornecedor;
    private int idProduto;
    public String nomeProduto;
    public String cnpjFornecedor;
    public String notaFiscal;
    public String emailFornecedor;
    public String enderecoFornecedor;
    public String telefoneFornecedor;
    public String origemProduto;

   

    public Fornecedores(int aidFornecedor, String anomeFornecedor, int aidProduto, String anomeProduto, String acnpjFornecedor, String anotaFiscal, String aemailFornecedor, String aenderecoFornecedor, String atelefoneFornecedor, String aorigemProduto) {
        this.idFornecedor = aidFornecedor;
        this.nomeFornecedor = anomeFornecedor;
        this.idProduto = aidProduto;
        this.nomeProduto = anomeProduto;
        this.cnpjFornecedor = acnpjFornecedor;
        this.notaFiscal = anotaFiscal;
        this.emailFornecedor = aemailFornecedor;
        this.enderecoFornecedor = aenderecoFornecedor;
        this.telefoneFornecedor = atelefoneFornecedor;
        this.origemProduto = aorigemProduto;
    }

    public void CadastrarFornecedor() {

        System.out.println("Código Identificador do Fornecedor:");
        this.idFornecedor = random.nextInt(1000);
        System.out.println(idFornecedor);

        System.out.println("Informe o nome do "  + "Fornecedor" + " : ");
        this.nomeFornecedor = Ler.next();

        System.out.println("Informe o Código do Produto");
        this.idProduto = Ler.nextInt();

        System.out.println("Informe o nome do Produto :");
        this.nomeProduto = Ler.next();

        System.out.println("Informe o CPNJ " + "do Fornecedor" + " :");
        this.cnpjFornecedor = Ler.next();

        System.out.println("Informe a Nota Fiscal :");
        this.notaFiscal = Ler.next();

        System.out.println("Informe o e-mail do " + "Fornecedor" + " :");
        this.emailFornecedor = Ler.next();

        System.out.println("Informe o endereco do " + "Fornecedor" + " :");
        this.enderecoFornecedor = Ler.next();

        System.out.println("Informe o Telefone do  " + "Fornecedor" + " :");
        this.telefoneFornecedor = Ler.next();
        
        System.out.println("Informe a Origem do Produto do " + "Fornecedor" + " :");
        this.origemProduto = Ler.next();

        System.out.println("Cadastro de Fornecedor Realizado");
    }

    public void AtualizarFornecedor() {

        System.out.println("[1]Código Fornecedor");
        
        System.out.println("[2]Nome Fornecedor");
        
        System.out.println("[3]Código do Produto");
        
        System.out.println("[4]Nome do Produto");
        
        System.out.println("[5]CNPJ");
        
        System.out.println("[6]Nota Fiscal");
        
        System.out.println("[7]e-mail");
        
        System.out.println("[8]Endereço do Fornecedor");
        
        System.out.println("[9]Telefone do Fornecedor");
        
        System.out.println("[10]Origem do Produto");
        
        while (!Ler.hasNextInt()) {
            System.out.print("Tente novamente escolhendo uma das opcoes acima");
            Ler.next(); //
        }

        int opcao = Ler.nextInt();
        switch (opcao) {

            case 1:
                System.out.println("Informe o Código do Fornecedor: ");
                this.idFornecedor = Ler.nextInt();
                break;
            case 2:
                System.out.println("Informe o nome do Fornecedor : ");
                this.nomeFornecedor = Ler.next();
                break;
            case 3:
                System.out.println("Informe o Código do Produto");
                this.idProduto = Ler.nextInt();
                break;
            case 4:
                System.out.println("Informe o nome do Produto :");
                this.nomeProduto = Ler.next();
                break;
            case 5:
                System.out.println("Informe o CNPJ do Fornecedor:");
                this.cnpjFornecedor = Ler.next();
                break;
            case 6:
                System.out.println("Informe a Nota Fiscal :");
                this.notaFiscal = Ler.next();
                break;
            case 7:
                System.out.println("Informe o e-mail do Fornecedor :");
                this.emailFornecedor = Ler.next();
                break;
            case 8:
                System.out.println("Informe o Endereço do Fornecedor :");
                this.enderecoFornecedor = Ler.next();
                break;
            case 9:
                System.out.println("Informe o Telefone do Fornecedor:");
                this.telefoneFornecedor = Ler.next();
                break;
            case 10:
                System.out.println("Informe a Origem do Produto :");
                this.origemProduto = Ler.next();
                break;
            case 0:

                break;

        }

    }

    public void ExcluirFornecedor() {
        this.idFornecedor = 0;
        this.nomeFornecedor = "";
        this.idProduto = 0;
        this.nomeProduto = "";
        this.cnpjFornecedor = "";
        this.notaFiscal = "";
        this.emailFornecedor = "";
        this.enderecoFornecedor = "";
        this.telefoneFornecedor = "";

        System.out.println("Registro de Fornecedor Apagado");

    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int aidFornecedor) {
        this.idFornecedor = aidFornecedor;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String anomeFornecedor) {
        this.nomeFornecedor = anomeFornecedor;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int aidProduto) {
        this.idProduto = aidProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String anomeProduto) {
        this.nomeProduto = anomeProduto;
    }

    public String getCnpjFornecedor() {
        return cnpjFornecedor;
    }

    public void setCnpjFornecedor(String acnpjFornecedor) {
        this.cnpjFornecedor = acnpjFornecedor;
    }

    public String getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(String anotaFiscal) {
        this.notaFiscal = anotaFiscal;
    }

    public String getEmailFornecedor() {
        return emailFornecedor;
    }

    public void setEmailFornecedor(String aemailFornecedor) {
        this.emailFornecedor = aemailFornecedor;
    }

    public String getEnderecoFornecedor() {
        return enderecoFornecedor;
    }

    public void setEnderecoFornecedor(String aenderecoFornecedor) {
        this.enderecoFornecedor = aenderecoFornecedor;
    }

    public String getTelefoneFornecedor() {
        return telefoneFornecedor;
    }

    public void setTelefoneFornecedor(String atelefoneFornecedor) {
        this.telefoneFornecedor = atelefoneFornecedor;
    }
    
    public String getOrigemProduto() {
        return telefoneFornecedor;
    }

    public void setOrigemProduto(String aorigemProduto) {
        this.origemProduto = aorigemProduto;
    }

}
