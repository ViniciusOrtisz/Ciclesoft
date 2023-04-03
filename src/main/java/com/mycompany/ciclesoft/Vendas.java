/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ciclesoft;

import java.util.Scanner;
import java.util.Random;
import java.util.Date;

public class Vendas extends Produtos {

    Random random = new Random();
    public Scanner Ler = new Scanner(System.in);
    
    public int idVenda;
    private String dataDaVenda;
    public int idFuncionario;
    private int idCliente;
    private int idProduto;
    private int quantidade;
    private double valorUnitario;
    public double desconto;
    public double valorTotalVenda;
    public String formaDePagamento;

    public Vendas(int idProduto, double valorVenda, double valorCusto, String modelo, int qntEstoque, String pneu, String freio, String pedaleira, String banco, String guidao, String quadro, String raio, String marcha, double peso, String cor, int aro, String dataDaVenda, int idCliente, int quantidade, double valorUnitario, double desconto, double valorTotalVenda, int idFuncionario, String formaDePagamento, int idVenda) {
        super(idProduto, valorVenda, valorCusto, modelo, qntEstoque, pneu, freio, pedaleira, banco, guidao, quadro, raio, marcha, peso, cor, aro);

        this.dataDaVenda = dataDaVenda;
        this.idCliente = idCliente;
        this.idProduto = idProduto;
        this.quantidade = quantidade;  
        this.desconto = desconto;
        this.valorTotalVenda = valorTotalVenda;
        this.idFuncionario = idFuncionario;
        this.formaDePagamento = formaDePagamento;
        this.idVenda = idVenda;
    }

    public void CadastrarVenda() {

        System.out.println("INFORME O ID DA VENDA : ");
        this.idVenda = random.nextInt(1000);
        System.out.println(idVenda);

        System.out.println("INFORME A DATA DA VENDA : ");
        this.dataDaVenda = Ler.nextLine();

        System.out.println("INFORME O ID DO FUNCIONARIO RESPONSÁVEL PELA VENDA : ");
        this.idFuncionario = Ler.nextInt();

        System.out.println("INFORME O ID DO CLIENTE : ");
        this.idCliente = Ler.nextInt();

        System.out.println("INFORME O ID DO PRODUTO : ");
        this.idProduto = Ler.nextInt();

        System.out.println("INFORME A QUANTIDADE : ");
        this.quantidade = Ler.nextInt();

        System.out.println("INFORME O VALOR UNITARIO DO PRODUTO : ");
        this.valorUnitario = Ler.nextDouble();

        System.out.println("INFORME O DESCONTO : ");
        this.desconto = Ler.nextDouble();

        this.valorTotalVenda = (valorUnitario * quantidade) - desconto;
        System.out.println("VALOR TOTAL DA VENDA : " + valorTotalVenda);

        System.out.println("INFORME A FORMA DE PAGAMENTO");
        this.formaDePagamento = Ler.next();
    }

    public void AtualizarVenda() {

        System.out.println("[1]ID DA VENDA");
        System.out.println("[2]DATA DA VENDA");
        System.out.println("[3]ID FUNCIONARIO");
        System.out.println("[4]ID CLIENTE");
        System.out.println("[5]ID PRODUTO");
        System.out.println("[6]QUANTIDADE");
        System.out.println("[7]VALOR UNITARIO");
        System.out.println("[8]DESCONTO");
        System.out.println("[9]VALOR TOTAL");
        System.out.println("[10]FORMA DE PAGAMENTO");
        while (!Ler.hasNextInt()) {
            System.out.print("Tente novamente escolhendo uma das opcoes acima");
            Ler.next();
        }

        int opcao = Ler.nextInt();
        switch (opcao) {

            case 1:
                System.out.println("INFORME O ID DA VENDA : ");
                this.idVenda = Ler.nextInt();
                break;
            case 2:
                System.out.println("INFORME A DATA DE VENDA : ");
                this.dataDaVenda = Ler.nextLine();
                break;
            case 3:
                System.out.println("INFORME O ID DO FUNCIONARIO : ");
                this.idFuncionario = Ler.nextInt();
                break;
            case 4:
                System.out.println("INFORME O ID DO CLIENTE : ");
                this.idCliente = Ler.nextInt();
                break;
            case 5:
                System.out.println("INFORME O ID DO PRODUTO : ");
                this.idProduto = Ler.nextInt();
                break;
            case 6:
                System.out.println("INFORME A QUANTIDADE : ");
                this.quantidade = Ler.nextInt();
                break;
            case 7:
                System.out.println("INFORME O VALOR UNITARIO : ");
                this.valorUnitario = Ler.nextDouble();
                break;
            case 8:
                System.out.println("INFORME O DESCONTO APLICADO : ");
                this.desconto = Ler.nextDouble();
                break;
            case 9:
                System.out.println("INFORME O VALOR TOTAL : ");
                this.valorTotalVenda = Ler.nextDouble();
                break;
            case 10:
                System.out.println("iNFORME A FORMA DE PAGAMENTO : ");
                this.formaDePagamento = Ler.next();
                break;
            case 0:

                break;

        }

    }
    public void VerAVenda() {
    System.out.println("===========+VENDA" + idVenda +  " +===========");
        
        System.out.println("Id da venda: " + idVenda );
        System.out.println("Data da Venda realizada: " + dataDaVenda);
        System.out.println("Funcionário que realizou: " + idFuncionario);
        System.out.println("Comprador (Cliente): " + idCliente);
        System.out.println("Código Produto: " + idProduto);
        System.out.println("Quantidade?: " + quantidade);
        System.out.println("Valor Unitário: " + valorUnitario);
        System.out.println("Desconto Aplicado: " + desconto);
        System.out.println("Valor Total da Venda: " + valorTotalVenda);
        System.out.println("Forma de Pagamento: " + formaDePagamento);
    }
    

    public void ExcluirVenda() {

        this.idVenda = 0;
        this.dataDaVenda = "";
        this.idFuncionario = 0;
        this.idCliente = 0;
        this.idProduto = 0;
        this.quantidade = 0;
        this.valorUnitario = 0;
        this.desconto = 0;
        this.valorTotalVenda = 0;
        this.formaDePagamento = "";
        
        System.out.println("VENDA DELETADA");
        
    }
    
    
    

    
    public int getIdVenda() {
        return this.idVenda;
    }
    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }
    public String getDataVenda() {
        return this.dataDaVenda;
    }
    public void setDataVenda(String dataVenda) {
        this.dataDaVenda = dataVenda;
    }
    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
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
    public void setIdProduto (int idProduto){
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
    public void setValorTotalVenda(double valorTotalVenda ) {
        this.valorTotalVenda = valorTotalVenda;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaDePagamento = formaPagamento;
    }


    

}