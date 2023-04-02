/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ciclesoft;

import java.util.Random;
import java.util.Scanner;


public class Produtos {

    Random random = new Random();
    public Scanner Ler = new Scanner(System.in);
    public Produtos produto[];
    public int idProduto;
    private double valorVenda;
    private double valorCusto;
    public String modelo;
    public int qntEstoque;
    public String pneu;
    public String freio;
    public String pedaleira;
    public String banco;
    public String guidao;
    public String quadro;
    public String raio;
    public String marcha;
    public double peso;
    public String cor;
    public int aro;

    public Produtos(int idProduto, double valorVenda, double valorCusto, String modelo, int qntEstoque, String pneu, String freio, String pedaleira, String banco, String guidao, String quadro, String raio, String marcha, double peso, String cor, int aro) {
        this.idProduto = idProduto;
        this.valorVenda = valorVenda;
        this.valorCusto = valorCusto;
        this.modelo = modelo;
        this.qntEstoque = qntEstoque;
        this.pneu = pneu;
        this.freio = freio;
        this.pedaleira = pedaleira;
        this.banco = banco;
        this.guidao = guidao;
        this.quadro = quadro;
        this.raio = raio;
        this.marcha = marcha;
        this.peso = peso;
        this.cor = cor;
        this.aro = aro;
        
    }

    

    public void CadastrarProduto() {
        System.out.println("O ID DO PRODUTO SERÁ :");
        this.idProduto = random.nextInt(1000);
        System.out.println(idProduto + "");


        System.out.println("INFORME O VALOR PARA VENDA");
        setValorVenda(Ler.nextDouble());
        

        System.out.println("INFORME O CUSTO : ");
        this.valorCusto = Ler.nextDouble();

        System.out.println("INFORME O MODELO : ");
        this.modelo = Ler.next();

        System.out.println("INFORME A QUANTIDADE EM ESTOQUE :");
        this.qntEstoque = Ler.nextInt();

        System.out.println("INFORME A DESCRIÇÃO DO PNEU :");
        this.pneu = Ler.next();

        System.out.println("INFORME A DESCRIÇÃO DO FREIO :");
        this.freio = Ler.next();

        System.out.println("INFORME A DESCRIÇÃO DO PEDALEIRA :");
        this.pedaleira = Ler.next();

        System.out.println("INFORME A DESCRIÇÃO DO BANCO :");
        this.banco = Ler.next();

        System.out.println("INFORME A DESCRIÇÃO DO GUIDAO :");
        this.guidao = Ler.next();

        System.out.println("INFORME A DESCRIÇÃO DO QUADRO :");
        this.quadro = Ler.next();

        System.out.println("INFORME A DESCRIÇÃO DO RAIO :");
        this.raio = Ler.next();

        System.out.println("INFORME A DESCRIÇÃO DA MARCHA :");
        this.marcha = Ler.next();

        System.out.println("INFORME O PESO :");
        this.peso = Ler.nextDouble();

        System.out.println("INFORME A COR :");
        this.cor = Ler.next();

        System.out.println("INFORME O TAMANHO DO ARO :");
        this.aro = Ler.nextInt();
        
       
    }

    public void AtualizarProduto() {

        System.out.println("[1]ID");
        System.out.println("[2]VALOR DE VENDA");
        System.out.println("[3]VALOR DE CUSTO");
        System.out.println("[4]MODELO");
        System.out.println("[5]QUANTIDADE EM ESTOQUE");
        System.out.println("[6]PNEU");
        System.out.println("[7]FREIO");
        System.out.println("[8]PEDALEIRA");
        System.out.println("[9]BANCO");
        System.out.println("[10]GUIDÃO");
        System.out.println("[11]QUADRO");
        System.out.println("[12]RAIO");
        System.out.println("[13]MARCHA");
        System.out.println("[14]PESO");
        System.out.println("[15]COR");
        System.out.println("[16]ARO");

        while (!Ler.hasNextInt()) {
            System.out.print("Tente novamente escolhendo uma das opcoes acima");
            Ler.next(); //
        }

        int opcao = Ler.nextInt();
        switch (opcao) {

            case 1:
                System.out.println("INFORME O ID : ");
                this.idProduto = Ler.nextInt();
                break;

            case 2:
                System.out.println("INFORME O VALOR DA VENDA : ");
                this.valorVenda = Ler.nextDouble();
                break;

            case 3:
                System.out.println("INFORME O CUSTO :");
                this.valorCusto = Ler.nextDouble();
                break;

            case 4:
                System.out.println("INFORME O MODELO :");
                this.modelo = Ler.next();
                break;

            case 5:
                System.out.println("INFORME A QUANTIDADE EM ESTOQUE :");
                this.qntEstoque = Ler.nextInt();
                break;

            case 6:
                System.out.println("INFORME O PNEU :");
                this.pneu = Ler.next();
                break;

            case 7:
                System.out.println("INFORME O FREIO :");
                this.freio = Ler.next();
                break;
            case 8:
                System.out.println("INFORME A PEDALEIRA :");
                this.pedaleira = Ler.next();
                break;

            case 9:
                System.out.println("INFORME O BANCO :");
                this.banco = Ler.next();
                break;

            case 10:
                System.out.println("INFORME O GUIDÃO :");
                this.guidao = Ler.next();
                break;

            case 11:
                System.out.println("INFORME O QUADRO :");
                this.quadro = Ler.next();
                break;

            case 12:
                System.out.println("INFORME O RAIO :");
                this.raio = Ler.next();
                break;

            case 13:
                System.out.println("INFORME O MARCHA :");
                this.marcha = Ler.next();
                break;

            case 14:
                System.out.println("INFORME O PESO :");
                this.peso = Ler.nextInt();
                break;

            case 15:
                System.out.println("INFORME A COR :");
                this.cor = Ler.next();
                break;
            case 16:
                System.out.println("INFORME O ARO :");
                this.aro = Ler.nextInt();
                break;
            case 0:

                break;

        }

    }
    
    public void ExcluirProduto() {
        this.idProduto = 0;
        this.valorVenda = 0;
        this.valorCusto = 0;
        this.modelo = "";
        this.qntEstoque = 0;
        this.pneu = "";
        this.freio = "";
        this.pedaleira = "";
        this.banco = "";
        this.guidao = "";
        this.quadro = "";
        this.raio = "";
        this.marcha = "";
        this.peso = 0;
        this.cor = "";
        this.aro = 0;

        System.out.println("PRODUTO DELETADO");

    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public double getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(double valorCusto) {
        this.valorCusto = valorCusto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQntEstoque() {
        return qntEstoque;
    }

    public void setQntEstoque(int qntEstoque) {
        this.qntEstoque = qntEstoque;
    }

    public String getPneu() {
        return pneu;
    }

    public void setPneu(String pneu) {
        this.pneu = pneu;
    }

    public String getFreio() {
        return freio;
    }

    public void setFreio(String freio) {
        this.freio = freio;
    }

    public String getPedaleira() {
        return pedaleira;
    }

    public void setPedaleira(String pedaleira) {
        this.pedaleira = pedaleira;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getGuidao() {
        return guidao;
    }

    public void setGuidao(String guidao) {
        this.guidao = guidao;
    }

    public String getQuadro() {
        return quadro;
    }

    public void setQuadro(String quadro) {
        this.quadro = quadro;
    }

    public String getRaio() {
        return raio;
    }

    public void setRaio(String raio) {
        this.raio = raio;
    }

    public String getMarcha() {
        return marcha;
    }

    public void setMarcha(int String) {
        this.marcha = marcha;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAro() {
        return aro;
    }

    public void setAro(int aro) {
        this.aro = aro;
    }

}
