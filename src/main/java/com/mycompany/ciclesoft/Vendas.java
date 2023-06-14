/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ciclesoft;

//Analista: Nathan
//Desenvolvedor : Maria

import java.util.Scanner;
import java.util.Random;
import java.util.Date;

public class Vendas extends Produtos {

    Random random = new Random();
    public Scanner Ler = new Scanner(System.in);
    
    public int aIdVenda;
    private String aDataDaVenda;
    public int aIdFuncionario;
    private int aIdCliente;
    private int aIdProduto;
    private int aQuantidade;
    private double aValorUnitario;
    public double aDesconto;
    public double aValorTotalVenda;
    public String aFormaDePagamento;
    
    public Vendas(){
    
    }

    public Vendas(int idProduto, double valorVenda, double valorCusto, String modelo, int qntEstoque, String pneu, String freio, String pedaleira, String banco, String guidao, String quadro, String raio, String marcha, double peso, String cor, int aro, String dataDaVenda, int idCliente, int quantidade, double valorUnitario, double desconto, double valorTotalVenda, int idFuncionario, String formaDePagamento, int idVenda) {
        super(idProduto, valorVenda, valorCusto, modelo, qntEstoque, pneu, freio, pedaleira, banco, guidao, quadro, raio, marcha, peso, cor, aro);

        this.aDataDaVenda = aDataDaVenda;
        this.aIdCliente = aIdCliente;
        this.aIdProduto = aIdProduto;
        this.aQuantidade = aQuantidade;  
        this.aDesconto = aDesconto;
        this.aValorTotalVenda = aValorTotalVenda;
        this.aIdFuncionario = aIdFuncionario;
        this.aFormaDePagamento = aFormaDePagamento;
        this.aIdVenda = aIdVenda;
    }

    public void CadastrarProdVenda() {
        
        System.out.println("INFORME O ID DO PRODUTO : ");
        this.aIdProduto = Ler.nextInt();
        System.out.println("INFORME A QUANTIDADE : ");
        this.aQuantidade = Ler.nextInt();
        System.out.println("INFORME O VALOR UNITARIO DO PRODUTO : ");
        this.aValorUnitario = Ler.nextDouble();
    }
    public void CadastrarVenda(){
        
        System.out.println("INFORME O ID DA VENDA : ");
        this.aIdVenda = random.nextInt(1000);
        System.out.println(aIdVenda);
        System.out.println("INFORME A DATA DA VENDA : ");
        this.aDataDaVenda = Ler.nextLine();
        System.out.println("INFORME O ID DO FUNCIONARIO RESPONSÁVEL PELA VENDA : ");
        this.aIdFuncionario = Ler.nextInt();
        System.out.println("INFORME O ID DO CLIENTE : ");
        this.aIdCliente = Ler.nextInt();
        System.out.println("INFORME O DESCONTO : ");
        this.aDesconto = Ler.nextDouble();
        this.aValorTotalVenda = (aValorUnitario * aQuantidade) - aDesconto;
        System.out.println("VALOR TOTAL DA VENDA : " + aValorTotalVenda);
        System.out.println("INFORME A FORMA DE PAGAMENTO");
        this.aFormaDePagamento = Ler.next();
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
                this.aIdVenda = Ler.nextInt();
                break;
            case 2:
                System.out.println("INFORME A DATA DE VENDA : ");
                this.aDataDaVenda = Ler.nextLine();
                break;
            case 3:
                System.out.println("INFORME O ID DO FUNCIONARIO : ");
                this.aIdFuncionario = Ler.nextInt();
                break;
            case 4:
                System.out.println("INFORME O ID DO CLIENTE : ");
                this.aIdCliente = Ler.nextInt();
                break;
            case 5:
                System.out.println("INFORME O ID DO PRODUTO : ");
                this.aIdProduto = Ler.nextInt();
                break;
            case 6:
                System.out.println("INFORME A QUANTIDADE : ");
                this.aQuantidade = Ler.nextInt();
                break;
            case 7:
                System.out.println("INFORME O VALOR UNITARIO : ");
                this.aValorUnitario = Ler.nextDouble();
                break;
            case 8:
                System.out.println("INFORME O DESCONTO APLICADO : ");
                this.aDesconto = Ler.nextDouble();
                break;
            case 9:
                System.out.println("INFORME O VALOR TOTAL : ");
                this.aValorTotalVenda = Ler.nextDouble();
                break;
            case 10:
                System.out.println("iNFORME A FORMA DE PAGAMENTO : ");
                this.aFormaDePagamento = Ler.next();
                break;
            case 0:

                break;
        }
    }
    public void VerAVenda() {
    System.out.println("===========+VENDA" + aIdVenda +  " +===========");
    
        System.out.println("Id da venda: " + aIdVenda );
        System.out.println("Data da Venda realizada: " + aDataDaVenda);
        System.out.println("Funcionário que realizou: " + aIdFuncionario);
        System.out.println("Comprador (Cliente): " + aIdCliente);
        System.out.println("Código Produto: " + aIdProduto);
        System.out.println("Quantidade?: " + aQuantidade);
        System.out.println("Valor Unitário: " + aValorUnitario);
        System.out.println("Desconto Aplicado: " + aDesconto);
        System.out.println("Valor Total da Venda: " + aValorTotalVenda);
        System.out.println("Forma de Pagamento: " + aFormaDePagamento);
    }
    public void ExcluirVenda() {
        this.aIdVenda = 0;
        this.aDataDaVenda = "";
        this.aIdFuncionario = 0;
        this.aIdCliente = 0;
        this.aIdProduto = 0;
        this.aQuantidade = 0;
        this.aValorUnitario = 0;
        this.aDesconto = 0;
        this.aValorTotalVenda = 0;
        this.aFormaDePagamento = "";
        
        System.out.println("VENDA DELETADA");
    }

    @Override
    public void excluirProduto() {
        super.excluirProduto(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    @Override
    public void atualizacaoProtudo() {
        super.atualizacaoProtudo(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    //OverLoad
    public void atualizacaoProtudo(int i){
      this.excluirProduto();
   }
    
    public int getIdVenda() {
        return this.aIdVenda;
    }
    public void setIdVenda(int aIdVenda) {
        this.aIdVenda = aIdVenda;
    }
    public String getDataVenda() {
        return this.aDataDaVenda;
    }
    public void setDataVenda(String aDataVenda) {
        this.aDataDaVenda = aDataVenda;
    }
    public int getIdFuncionario() {
        return aIdFuncionario;
    }
    public void setIdFuncionario(int aIdFuncionario) {
        this.aIdFuncionario = aIdFuncionario;
    }
    public int getIdCliente() {
        return aIdCliente;
    }
    public void setIdCliente(int aIdCliente) {
        this.aIdCliente = aIdCliente;
    }
    public int getIdProduto() {
        return aIdProduto;
    }
    public void setIdProduto (int aIdProduto){
        this.aIdProduto = aIdProduto;
    }
    public int getQuantidade() {
        return aQuantidade;
    }
    public void setQuantidade(int aQuantidade) {
        this.aQuantidade = aQuantidade;
    }
    public double getValorUnitario() {
        return aValorUnitario;
    }
    public void setValorUnitario(double aValorUnitario) {
        this.aValorUnitario = aValorUnitario;
    }
    public double getDesconto() {
        return aDesconto;
    }
    public void setDesconto(double aDesconto) {
        this.aDesconto = aDesconto;
    }
    public double getValorTotalVenda() {
        return aValorTotalVenda;
    }
    public void setValorTotalVenda(double aValorTotalVenda ) {
        this.aValorTotalVenda = aValorTotalVenda;
    }
    public String getFormaDePagamento() {
        return aFormaDePagamento;
    }
    public void setFormaPagamento(String aFormaDePagamento) {
        this.aFormaDePagamento = aFormaDePagamento;
    }
}
