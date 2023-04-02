/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ciclesoft;

import java.util.Scanner;

import java.util.Random;

public class Vendas extends Produtos {

    Random random = new Random();
    public Scanner Ler = new Scanner(System.in);
    Produtos produto[];
    private String dataDaVenda;
    private int idCliente;
    
    private int quantidade;
    private double valorUnitario;
    public double desconto;
    public double valorTotalVenda;
    public int idFuncionario;
    public String formaDePagamento;
    public int idVenda;

    //public Vendas(int idProduto, double valorVenda, double valorCusto, String modelo, int qntEstoque, String pneu, String freio, String pedaleira, String banco, String guidao, String quadro, String raio, String marcha, double peso, String cor, int aro, int idProduto,) {
    public Vendas(int idProduto, double valorVenda, double valorCusto, String modelo, int qntEstoque, String pneu, String freio, String pedaleira, String banco, String guidao, String quadro, String raio, String marcha, double peso, String cor, int aro, String dataDaVenda, int idCliente, int quantidade, double valorUnitario, double desconto, double valorTotalVenda, int idFuncionario, String formaDePagamento, int idVenda) {
        super(idProduto, valorVenda, valorCusto, modelo, qntEstoque, pneu, freio, pedaleira, banco, guidao, quadro, raio, marcha, peso, cor, aro);

        this.dataDaVenda = dataDaVenda;
        this.idCliente = idCliente;

        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.desconto = desconto;
        this.valorTotalVenda = valorTotalVenda;
        this.idFuncionario = idFuncionario;
        this.formaDePagamento = formaDePagamento;
        this.idVenda = idVenda;
    }

    public void CadastrarVenda() {
        System.out.println("INFORME A DATA DA VENDA : ");
        this.dataDaVenda = Ler.next();

        System.out.println("INFORME O ID DO CLIENTE : ");
        this.idCliente = Ler.nextInt();

        System.out.println("INFORME O ID DO PRODUTO : ");
        this.idProduto = Ler.nextInt();
        
        System.out.println("INFORME A QUANTIDADE : ");
        this.quantidade = Ler.nextInt();

        System.out.println("INFORME O VALOR UNITARIO : ");
        this.valorUnitario = Ler.nextDouble();

        System.out.println("INFORME O DESCONTO : ");
        this.desconto = Ler.nextDouble();

        this.valorTotalVenda = (valorUnitario * quantidade) - desconto;
        System.out.println("VALOR TOTAL DA VENDA : " + valorTotalVenda);

        System.out.println("INFORME O ID DO FUNCIONARIO : ");
        this.idProduto = Ler.nextInt();

        System.out.println("INFORME A FORMA DE PAGAMENTO");
        this.formaDePagamento = Ler.next();

        System.out.println("ID DA VENDA :");
        this.idVenda = random.nextInt(1000);
        System.out.println(idVenda);

    }

    public String getDataDaVenda() {
        return dataDaVenda;
    }

    public void setDataDaVenda(String dataDaVenda) {
        this.dataDaVenda = dataDaVenda;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }



    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {

        this.quantidade = quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getValorTotalVenda() {
        return valorTotalVenda;
    }

    public void setValorTotalVenda(double valorTotalVenda) {
        this.valorTotalVenda = valorTotalVenda;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

}
