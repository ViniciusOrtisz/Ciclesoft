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

    //public Vendas(int idProduto, double valorVenda, double valorCusto, String modelo, int qntEstoque, String pneu, String freio, String pedaleira, String banco, String guidao, String quadro, String raio, String marcha, double peso, String cor, int aro, int idProduto,) {
    public Vendas(int idProduto, double valorVenda, double valorCusto, String modelo, int qntEstoque, String pneu, String freio, String pedaleira, String banco, String guidao, String quadro, String raio, String marcha, double peso, String cor, int aro, String dataDaVenda, int idCliente, int quantidade, double valorUnitario, double desconto, double valorTotalVenda, int idFuncionario, String formaDePagamento, int idVenda) {
        super(idProduto, valorVenda, valorCusto, modelo, qntEstoque, pneu, freio, pedaleira, banco, guidao, quadro, raio, marcha, peso, cor, aro);

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

    public void AtualizarVenda() {

        System.out.println("[1]DATA DA VENDA");
        System.out.println("[2]ID DO CLIENTE");
        System.out.println("[3]ID DO PRODUTO");
        System.out.println("[4]QUANTIDADE");
        System.out.println("[5]VALOR UNITARIO");
        System.out.println("[6]DESCONTO");
        System.out.println("[7]ID FUNCIONARIO");
        System.out.println("[8]FORMA DE PAGAMENTO");
        System.out.println("[9]ID DA VENDA");
        while (!Ler.hasNextInt()) {
            System.out.print("Tente novamente escolhendo uma das opcoes acima");
            Ler.next(); //
        }

        int opcao = Ler.nextInt();
        switch (opcao) {

            case 1:
                System.out.println("INFORME A DATA DA VENDA : ");
                this.dataDaVenda = Ler.next();
                break;
            case 2:
                System.out.println("INFORME O ID DO CLIENTE : ");
                this.idCliente = Ler.nextInt();
                break;
            case 3:
                System.out.println("INFORME O ID DO PRODUTO : ");
                this.idProduto = Ler.nextInt();
                break;
            case 4:
                System.out.println("INFORME A QUANTIDADE : ");
                this.quantidade = Ler.nextInt();
                break;
            case 5:
                System.out.println("INFORME O VALOR UNITARIO : ");
                this.valorUnitario = Ler.nextDouble();
                break;
            case 6:
                System.out.println("INFORME O DESCONTO : ");
                this.desconto = Ler.nextDouble();
                break;
            case 7:
                System.out.println("INFORME O ID DO FUNCIONARIO : ");
                this.idFuncionario = Ler.nextInt();
                break;
            case 8:
                System.out.println("INFORME A FORMA DE PAGAMENTO");
                this.formaDePagamento = Ler.next();
                break;
            case 9:
                System.out.println("ID DA VENDA :");
                this.idVenda = Ler.nextInt();
                break;
            case 0:

                break;

        }

    }

    public void ExcluirVenda() {
        this.dataDaVenda = "";
        this.idCliente = 0;
        this.idProduto = 0;
        this.quantidade = 0;
        this.valorUnitario = 0;
        this.desconto = 0;
        this.valorTotalVenda = 0;
        this.idFuncionario = 0;
        this.formaDePagamento = "";
        this.idVenda = 0;

        System.out.println("VENDA DELETADA");

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

    public void relatorioVendas() {
        System.out.println("ID DA VENDA : " + getIdVenda());
        System.out.println("DATA DA VENDA : " + getDataDaVenda());
        System.out.println("ID CLIENTE : " + getIdCliente());
        System.out.println("QUANTIDAD DE ITENS : " + getQuantidade());
        System.out.println("VALOR UNITARIO: " + getValorUnitario());
        System.out.println("DESCONTO : " + getDesconto());
        System.out.println("VALOR TOTAL DA VENDA : " + getValorTotalVenda());
        System.out.println("ID DO FUNCIONARIO : " + getIdFuncionario());
        System.out.println("FORMA DE PAGAMENTO : " + getFormaDePagamento());

        System.out.println("======================");

    }

    public void relatodiosDeVendas() {
        System.out.println("ID DA VENDA : " + getIdVenda());
        System.out.println("DATA DA VENDA : " + getDataDaVenda());
        System.out.println("ID CLIENTE : " + getIdCliente());
        System.out.println("QUANTIDAD DE ITENS : " + getQuantidade());
        System.out.println("VALOR UNITARIO: " + getValorUnitario());
        System.out.println("DESCONTO : " + getDesconto());
        System.out.println("VALOR TOTAL DA VENDA : " + getValorTotalVenda());
        System.out.println("ID DO FUNCIONARIO : " + getIdFuncionario());
        System.out.println("FORMA DE PAGAMENTO : " + getFormaDePagamento());

        System.out.println("======================");

    }

    public void relatorioUmaVenda() {
        System.out.println("ID DA VENDA : " + getIdVenda());
        System.out.println("DATA DA VENDA : " + getDataDaVenda());
        System.out.println("ID CLIENTE : " + getIdCliente());
        System.out.println("QUANTIDAD DE ITENS : " + getQuantidade());
        System.out.println("VALOR UNITARIO: " + getValorUnitario());
        System.out.println("DESCONTO : " + getDesconto());
        System.out.println("VALOR TOTAL DA VENDA : " + getValorTotalVenda());
        System.out.println("ID DO FUNCIONARIO : " + getIdFuncionario());
        System.out.println("FORMA DE PAGAMENTO : " + getFormaDePagamento());

        System.out.println("======================");
    }

}
