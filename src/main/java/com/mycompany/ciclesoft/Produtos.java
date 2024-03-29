/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ciclesoft;

//Analista Vinicius
//Desenvolvedor: Erick
// Refatorado: Pedro Rodrigues
/**
 *
 * @author erick
 */
/*
 *
 */
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
    public int quantidadeEstoque;
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
    
    public Produtos(){
    
    }
    public Produtos(int idProduto, double valorVenda, double valorCusto, String modelo, int quantidadeEstoque, String pneu, String freio, String pedaleira, String banco, String guidao, String quadro, String raio, String marcha, double peso, String cor, int aro) {
        this.idProduto = idProduto;
        this.valorVenda = valorVenda;
        this.valorCusto = valorCusto;
        this.modelo = modelo;
        this.quantidadeEstoque = quantidadeEstoque;
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

    public void cadastrarProduto() {
        System.out.println("ID do produto a ser cadastrado :");
        this.idProduto = random.nextInt(1000);
        System.out.println(idProduto + "");
        System.out.println("Informe qual é o valor de venda do produto");
        setValorVenda(Ler.nextDouble());
        System.out.println("Informe qual é o custo do produto : ");
        this.valorCusto = Ler.nextDouble();
        System.out.println("Informe qual é o modelo do produto : ");
        this.modelo = Ler.next();
        System.out.println("Informe a quantidade em estoque :");
        this.quantidadeEstoque = Ler.nextInt();
        System.out.println("Informe qual a descrição do pneu :");
        this.pneu = Ler.next();
        System.out.println("Informe qual a descrição do freio :");
        this.freio = Ler.next();
        System.out.println("Informe qual a descrição da pedaleira :");
        this.pedaleira = Ler.next();
        System.out.println("Informe qual a descrição do banco :");
        this.banco = Ler.next();
        System.out.println("Informe qual a descrição do guidão :");
        this.guidao = Ler.next();
        System.out.println("Informe qual a descrição do quadro :");
        this.quadro = Ler.next();
        System.out.println("Informe qual a descrição do raio :");
        this.raio = Ler.next();
        System.out.println("Informe qual a descrição da marcha :");
        this.marcha = Ler.next();
        System.out.println("Informe o peso do produto :");
        this.peso = Ler.nextDouble();
        System.out.println("Informe a cor do Produto :");
        this.cor = Ler.next();
        System.out.println("Informe qual é o tamanho do aro :");
        this.aro = Ler.nextInt();
    }
    public void atualizacaoProtudo() {
         while (!Ler.hasNextInt()) {
            System.out.print("Tente novamente, selecionando umas das opções acima");
            Ler.next(); 
        }
    }

    public void textoAtualizarProduto() {
        System.out.println("-1- ID");
        System.out.println("-2- Valor de venda");
        System.out.println("-3- Valor de custo");
        System.out.println("-4- Modelo");
        System.out.println("-5- Quantidade em estoque");
        System.out.println("-6- Pneu");
        System.out.println("-7- Freio");
        System.out.println("-8- Pedaleira");
        System.out.println("-9- Banco");
        System.out.println("-10- Guidão");
        System.out.println("-11- Quadro");
        System.out.println("-12- Raio");
        System.out.println("-13- Marcha");
        System.out.println("-14- Peso");
        System.out.println("-15- Cor");
        System.out.println("-16- Aro");
    }

    public void atualizarProduto() {
        textoAtualizarProduto();
        atualizacaoProtudo();
        int opcao = Ler.nextInt();
        switch (opcao) {
            case 1 -> {System.out.println("Informe o ID : ");
                this.idProduto = Ler.nextInt();}
            case 2 -> {System.out.println("Informe o valor da venda : ");
                this.valorVenda = Ler.nextDouble();}
            case 3 -> {System.out.println("Informe o custo :");
                this.valorCusto = Ler.nextDouble();}
            case 4 -> {System.out.println("Informe o modelo :");
                this.modelo = Ler.next();}
            case 5 -> {System.out.println("Informe a quantidade em estoque :");
                this.quantidadeEstoque = Ler.nextInt();}
            case 6 -> {System.out.println("Informe o pneu :");
                this.pneu = Ler.next();}
            case 7 -> {System.out.println("Informe o freio :");
                this.freio = Ler.next();}
            case 8 -> {System.out.println("Informe a pedaleira :");
                this.pedaleira = Ler.next();}
            case 9 -> {System.out.println("Informe o banco :");
                this.banco = Ler.next();}
            case 10 -> {System.out.println("Informe o guidão :");
                this.guidao = Ler.next();}
            case 11 -> {System.out.println("Informe o quadro :");
                this.quadro = Ler.next();}
            case 12 -> {System.out.println("Informe o raio :");
                this.raio = Ler.next();}
            case 13 -> {System.out.println("Informe a marcha :");
                this.marcha = Ler.next();}
            case 14 -> {System.out.println("Informe o peso :");
                this.peso = Ler.nextInt();}
            case 15 -> {System.out.println("Informe a cor :");
                this.cor = Ler.next();}
            case 16 -> {System.out.println("Informe o aro :");
                this.aro = Ler.nextInt();}
            case 0 -> {
            }
        }
    }

    public void excluirProduto() {
        this.idProduto = 0;
        this.valorVenda = 0;
        this.valorCusto = 0;
        this.modelo = "";
        this.quantidadeEstoque = 0;
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
        System.out.println("Produto excluido com sucesso");
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

    public int getquantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
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
