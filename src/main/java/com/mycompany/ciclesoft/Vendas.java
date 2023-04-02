/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ciclesoft;

import java.util.Scanner;

public class Vendas {
    
    
    public Scanner Ler = new Scanner(System.in);
    

    private String dataDaVenda;
    private int idCliente;
    private int idProduto;
    private int quantidade;
    private double valorUnitario;
    public double desconto;
    public double valorTotalVenda;
    public int idFuncionario;
    public String formaDePagamento;
    public int idVenda;
    
    public Vendas(String dataDaVenda, int idCliente, int idProduto, int quantidade, double valorUnitario, double desconto, double valorTotalVenda, int idFuncionario, String formaDePagamento, int idVenda) {
        this.dataDaVenda = dataDaVenda;
        this.idCliente = idCliente;
        this.idProduto = idProduto;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.desconto = desconto;
        this.valorTotalVenda = valorTotalVenda;
        this.idFuncionario = idFuncionario;
        this.formaDePagamento = formaDePagamento;
        this.idVenda = idVenda;
    }
   
    public void CadastrarVenda(){
    
    
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

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
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