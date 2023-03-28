/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classeprodutos;

public class Produtos {
   
    private int idProduto;
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
    public int marcha;
    public double peso;
    public String cor;
    public int aro;
    
   public static void main(String[] args) {
       System.out.println("Produtos....");
 }
    public void CadastrarProduto(int AidProduto){
    idProduto = AidProduto;
}
    public void AtualizarProduto(int AidProduto){
    idProduto = AidProduto;
}
    public void ExcluirProduto(int AidProduto){
    idProduto = AidProduto;
}
    public void ConsultarProduto(int AidProduto){
    idProduto = AidProduto;
}

}