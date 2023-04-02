/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ciclesoft;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nathan Graebin
 */
public class Fornecedores {

    Random random = new Random();
    public Scanner Ler = new Scanner(System.in);
    
    private int idFornecedor;
    public String nomeFornecedor;
    private int idProdutoFornecido;
    public String nomeProduto;
    public String cnpjFornecedor;
    public String notaFiscal;
    public String emailFornecedor;
    public String enderecoFornecedor;
    public String TelefoneFornecedor;

    public Fornecedores(int idFornecedor, String nomeFornecedor, int idProdutoFornecido, String nomeProduto, String cnpjFornecedor, String notaFiscal, String emailFornecedor, String enderecoFornecedor, String TelefoneFornecedor) {
        this.idFornecedor = idFornecedor;
        this.nomeFornecedor = nomeFornecedor;
        this.idProdutoFornecido = idProdutoFornecido;
        this.nomeProduto = nomeProduto;
        this.cnpjFornecedor = cnpjFornecedor;
        this.notaFiscal = notaFiscal;
        this.emailFornecedor = emailFornecedor;
        this.enderecoFornecedor = enderecoFornecedor;
        this.TelefoneFornecedor = TelefoneFornecedor;
    }

    public void ExcluirFornecedor() {
        this.idFornecedor = 0;
        this.nomeFornecedor = "";
        this.idProdutoFornecido = 0;
        this.nomeProduto = "";
        this.cnpjFornecedor = "";
        this.notaFiscal = "";
        this.emailFornecedor = "";
        this.enderecoFornecedor = "";
        this.TelefoneFornecedor = "";

        System.out.println("FORNECEDOR DELETADO");

    }

    public void AtualizarFornecedor() {

        System.out.println("[1]ID");
        System.out.println("[2]NOME");
        System.out.println("[3]ID PRODUTO FORNECIDO");
        System.out.println("[4]NOME DO PRODUTO FORNECIDO");
        System.out.println("[5]CNPJ");
        System.out.println("[6]NOTA FISCAL");
        System.out.println("[7]E-MAIL");
        System.out.println("[8]ENDEREÇO");
        System.out.println("[9]TELEFONE");
        while (!Ler.hasNextInt()) {
            System.out.print("Tente novamente escolhendo uma das opcoes acima");
            Ler.next(); //
        }

        int opcao = Ler.nextInt();
        switch (opcao) {

            case 1:
                System.out.println("INFORME O ID : ");
                this.idFornecedor = Ler.nextInt();
                break;
            case 2:
                System.out.println("INFORME O NOME : ");
                this.nomeFornecedor = Ler.next();
                break;
            case 3:
                System.out.println("INFORME O ID DO PRODUTO FORNECIDO ");
                this.idProdutoFornecido = Ler.nextInt();
                break;
            case 4:
                System.out.println("INFORME O NOME DO PRODUTO :");
                this.nomeProduto = Ler.next();
                break;
            case 5:
                System.out.println("INFORME O CNPJ :");
                this.cnpjFornecedor = Ler.next();
                break;
            case 6:
                System.out.println("INFORME A NOTA FISCAL :");
                this.notaFiscal = Ler.next();
                break;
            case 7:
                System.out.println("INFORME O E-MAIL :");
                this.emailFornecedor = Ler.next();
                break;
            case 8:
                System.out.println("INFORME O ENDEREÇO :");
                this.enderecoFornecedor = Ler.next();
                break;
            case 9:
                System.out.println("INFORME O TELEFONE :");
                this.TelefoneFornecedor = Ler.next();
                break;
            case 0:

                break;

        }

    }
    
    public void CadastrarFornecedor() {

        System.out.println("O ID DO FORNECEDOR SERÁ:");
        this.idFornecedor = random.nextInt(1000);
        System.out.println(idFornecedor);

        System.out.println("INFORME O NOME DO " + "FORNECEDOR" + " :");
        this.nomeFornecedor = Ler.next();

        System.out.println("INFORME O ID DO PRODUTO");
        this.idProdutoFornecido = Ler.nextInt();

        System.out.println("INFORME O NOME DO PRODUTO DO " + "FORNECEDOR" + " :");
        this.nomeProduto = Ler.next();

        System.out.println("INFORME O CNPJ " + "FORNECEDOR" + " :");
        this.cnpjFornecedor = Ler.next();

        System.out.println("INFORME O A NOTA FISCAL DO " + "FORNECEDOR" + " :");
        this.notaFiscal = Ler.next();

        System.out.println("INFORME O EMAIL DO " + "FORNECEDOR" + " :");
        this.emailFornecedor = Ler.next();

        System.out.println("INFORME O ENDERECO DO " + "FORNECEDOR" + " :");
        this.enderecoFornecedor = Ler.next();

        System.out.println("INFORME O TELEFONE DO " + "FORNECEDOR" + " :");
        this.TelefoneFornecedor = Ler.next();

        System.out.println("CADASTRO REALIZADO COM SUCESSO");
    }

    
    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public int getIdProduto() {
        return idProdutoFornecido;
    }

    public void setIdProduto(int idProdutoFornecido) {
        this.idProdutoFornecido = idProdutoFornecido;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getCnpjFornecedor() {
        return cnpjFornecedor;
    }

    public void setCnpjFornecedor(String cnpjFornecedor) {
        this.cnpjFornecedor = cnpjFornecedor;
    }

    public String getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(String notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public String getEmailFornecedor() {
        return emailFornecedor;
    }

    public void setEmailFornecedor(String emailFornecedor) {
        this.emailFornecedor = emailFornecedor;
    }

    public String getEnderecoFornecedor() {
        return enderecoFornecedor;
    }

    public void setEnderecoFornecedor(String enderecoFornecedor) {
        this.enderecoFornecedor = enderecoFornecedor;
    }

    public String getTelefoneFornecedor() {
        return TelefoneFornecedor;
    }

    public void setTelefoneFornecedor(String TelefoneFornecedor) {
        this.TelefoneFornecedor = TelefoneFornecedor;
    }

    

    
}
