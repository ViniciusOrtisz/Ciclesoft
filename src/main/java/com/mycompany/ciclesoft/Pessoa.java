/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ciclesoft;

/**
 *
 * @author aluno
 */
public class Pessoa {

    private int idPessoa;
    public String nome;
    public String dataNascimento;
    public String cpf;
    public String cpfParaFormatar;
    public String rgParaFormatar;
    public String telefone;
    public String email;
    public String endereco;
    public String bairro;
    public String referencia;
    public String cep;
    public String cepParaFormatar;
    public String cidade;
    private String rg;
    public String estado;

    public Pessoa() {
    }

    public Pessoa(int idPessoa, String nome, String dataNascimento, String cpf, String cpfParaFormatar, String rgParaFormatar, String telefone, String email, String endereco, String bairro, String referencia, String cep, String cepParaFormatar, String cidade, String rg, String estado) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.cpfParaFormatar = cpfParaFormatar;
        this.rgParaFormatar = rgParaFormatar;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.bairro = bairro;
        this.referencia = referencia;
        this.cep = cep;
        this.cepParaFormatar = cepParaFormatar;
        this.cidade = cidade;
        this.rg = rg;
        this.estado = estado;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpfParaFormatar() {
        return cpfParaFormatar;
    }

    public void setCpfParaFormatar(String cpfParaFormatar) {
        this.cpfParaFormatar = cpfParaFormatar;
    }

    public String getRgParaFormatar() {
        return rgParaFormatar;
    }

    public void setRgParaFormatar(String rgParaFormatar) {
        this.rgParaFormatar = rgParaFormatar;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCepParaFormatar() {
        return cepParaFormatar;
    }

    public void setCepParaFormatar(String cepParaFormatar) {
        this.cepParaFormatar = cepParaFormatar;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
