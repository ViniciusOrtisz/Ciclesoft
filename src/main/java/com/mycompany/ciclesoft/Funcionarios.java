/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ciclesoft;

import java.util.Random;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

// Classe : Funcionários
// Analista Responsável: Erick
// Desenvolvedor: Vinicius
public class Funcionarios extends Pessoa {

    private int idFuncionario;
    private double salario;
    private String cargo;
    public String dataAdmissao;
    public double comissao;
    public String nCarteiraTrabalho;

    Random random = new Random();
    public Scanner Ler = new Scanner(System.in);

    List<Funcionarios> listaFuncionario = new ArrayList<>();

    public int opcaoWhile = -1;

    public Funcionarios(int idFuncionario, double salario, String cargo, String dataAdmissao, double comissao, String nCarteiraTrabalho, int idPessoa, String nome, String dataNascimento, String cpf, String cpfParaFormatar, String rgParaFormatar, String telefone, String email, String endereco, String bairro, String referencia, String cep, String cepParaFormatar, String cidade, String rg, String estado) {
        super(idPessoa, nome, dataNascimento, cpf, cpfParaFormatar, rgParaFormatar, telefone, email, endereco, bairro, referencia, cep, cepParaFormatar, cidade, rg, estado);
        this.idFuncionario = idFuncionario;
        this.salario = salario;
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
        this.comissao = comissao;
        this.nCarteiraTrabalho = nCarteiraTrabalho;
    }

    public Funcionarios() {
    }



    public void consultarTodos() {

        for (Funcionarios funcionarios : listaFuncionario) {
    System.out.println("ID: " + funcionarios.getIdFuncionario());
    System.out.println("Nome: " + funcionarios.getNome());
    System.out.println("Cargo: " + funcionarios.getCargo());
    System.out.println("Data de Admissão: " + funcionarios.getDataAdmissao());
    System.out.println("Salário: " + funcionarios.getSalario());
    System.out.println("Comissão: " + funcionarios.getComissao());
    System.out.println("Número da Carteira de Trabalho: " + funcionarios.getnCarteiraTrabalho());
    System.out.println("Data de Nascimento: " + funcionarios.getDataNascimento());
    System.out.println("CPF: " + funcionarios.getCpf());
    System.out.println("RG: " + funcionarios.getRg());
    System.out.println("Telefone: " + funcionarios.getTelefone());
    System.out.println("Email: " + funcionarios.getEmail());
    System.out.println("Endereço: " + funcionarios.getEndereco());
    System.out.println("Bairro: " + funcionarios.getBairro());
    System.out.println("Referência: " + funcionarios.getReferencia());
    System.out.println("CEP: " + funcionarios.getCep());
    System.out.println("Cidade: " + funcionarios.getCidade());
    System.out.println("Estado: " + funcionarios.getEstado());
    System.out.println("========================");
}

// ...

public void CadastrarFuncionario() {
    listaFuncionario.add(new Funcionarios());
    for (Funcionarios funcionarios : listaFuncionario) {
        if (funcionarios.getIdFuncionario() == 0) {
            funcionarios.setIdFuncionario(random.nextInt(1000));
            System.out.println("O ID do Funcionário será " + funcionarios.getIdFuncionario());

            System.out.println("Informe o Nome do Funcionário:");
            funcionarios.setNome(Ler.next());
            Ler.nextLine();
            System.out.println("Informe o Cargo:");
            funcionarios.setCargo(Ler.nextLine());

            System.out.println("Informe a Data de Admissão:");
            funcionarios.setDataAdmissao(Ler.nextLine());

            System.out.println("Informe o Salário:");
            funcionarios.setSalario(Ler.nextDouble());

            System.out.println("Informe a Comissão:");
            funcionarios.setComissao(Ler.nextDouble());
            Ler.nextLine();
            System.out.println("Informe o Número da Carteira de Trabalho:");
            funcionarios.setnCarteiraTrabalho(Ler.nextLine());

            System.out.println("Informe a Data de Nascimento:");
            funcionarios.setDataNascimento(Ler.next());

            Ler.nextLine();
            System.out.println("Informe o CPF (apenas números, 11 dígitos):");
            funcionarios.setCpf(cpf_formatador(cpfParaFormatar = Ler.next()));
            System.out.println(funcionarios.getCpf());

            System.out.println("Informe o RG (apenas números, 10 dígitos):");
            funcionarios.setRg(rg_formatador(rgParaFormatar = Ler.next()));
            System.out.println(funcionarios.getRg());

            Ler.nextLine();

            System.out.println("Informe o Telefone:");
            funcionarios.setTelefone(Ler.next());
            System.out.println("Informe o Email:");
            funcionarios.setEmail(Ler.next());
            Ler.nextLine();
            System.out.println("Informe o Endereço:");
            funcionarios.setEndereco(Ler.next());
            Ler.nextLine();
            System.out.println("Informe o Bairro:");
            funcionarios.setBairro(Ler.next());
            Ler.nextLine();
            System.out.println("Informe Alguma Referência:");
            funcionarios.setReferencia(Ler.next());
            Ler.nextLine();

            System.out.println("Informe o CEP (apenas números, 7 dígitos):");
            funcionarios.setCep(cep_formatador(cepParaFormatar = Ler.next()));
            System.out.println(funcionarios.getCep());

            Ler.nextLine();

            System.out.println("Informe a Cidade:");
            funcionarios.setCidade(Ler.next());
            Ler.nextLine();
            System.out.println("Informe o Estado:");
            funcionarios.setEstado(Ler.next());
            Ler.nextLine();
            System.out.println("Cadastro realizado com sucesso");

                break;
            }
        }

    }

          public void AtualizarFuncionario() {
            System.out.println("Informe o ID que será atualizado: ");
            int buscarId = Ler.nextInt();
            for (Funcionarios funcionarios : listaFuncionario) {
                if (funcionarios.getIdFuncionario() == buscarId) {

                    System.out.println("[1] Id");
                    System.out.println("[2] Nome");
                    System.out.println("[3] Cargo");
                    System.out.println("[4] Data de Admissão");
                    System.out.println("[5] Salário");
                    System.out.println("[6] Comissão");
                    System.out.println("[7] Número da Carteira de Trabalho");
                    System.out.println("[8] Data de Nascimento");
                    System.out.println("[9] CPF");
                    System.out.println("[10] RG");
                    System.out.println("[11] Telefone");
                    System.out.println("[12] E-mail");
                    System.out.println("[13] Endereço");
                    System.out.println("[14] Bairro");
                    System.out.println("[15] Referência");
                    System.out.println("[16] CEP");
                    System.out.println("[17] Cidade");
                    System.out.println("[18] Estado");

                    while (!Ler.hasNextInt()) {
                        System.out.print("Tente novamente escolhendo uma das opções acima");
                        Ler.next();
                    }

                    int opcao = Ler.nextInt();
                    Ler.nextLine(); // Limpar o buffer

                    switch (opcao) {
                        case 1:
                            System.out.println("Informe o novo ID: ");
                            funcionarios.setIdFuncionario(Ler.nextInt());
                            System.out.println("==== Cadastro atualizado ====");
                            break;
                        case 2:
                            System.out.println("Informe o novo nome do funcionário: ");
                            funcionarios.setNome(Ler.nextLine());
                            System.out.println("==== Cadastro atualizado ====");
                            break;
                        case 3:
                            System.out.println("Informe o novo cargo: ");
                            funcionarios.setCargo(Ler.nextLine());
                            System.out.println("==== Cadastro atualizado ====");
                            break;
                        case 4:
                            System.out.println("Informe a nova data de admissão: ");
                            funcionarios.setDataAdmissao(Ler.nextLine());
                            System.out.println("==== Cadastro atualizado ====");
                            break;
                        case 5:
                            System.out.println("Informe o novo salário: ");
                            funcionarios.setSalario(Ler.nextDouble());
                            System.out.println("==== Cadastro atualizado ====");
                            break;
                        case 6:
                            System.out.println("Informe a nova comissão: ");
                            funcionarios.setComissao(Ler.nextDouble());
                            System.out.println("==== Cadastro atualizado ====");
                            break;
                        case 7:
                            System.out.println("Informe o novo número da carteira de trabalho: ");
                            funcionarios.setnCarteiraTrabalho(Ler.nextLine());
                            System.out.println("==== Cadastro atualizado ====");
                            break;
                        case 8:
                            System.out.println("Informe a nova data de nascimento: ");
                            funcionarios.setDataNascimento(Ler.nextLine());
                            System.out.println("==== Cadastro atualizado ====");
                            break;
                        case 9:
                            System.out.println("Informe o novo CPF: ");
                            funcionarios.setCpf(cpf_formatador(cpfParaFormatar = Ler.next()));
                            System.out.println(getCpf());
                            System.out.println("==== Cadastro atualizado ====");
                            break;
                        case 10:
                            System.out.println("Informe o novo RG: ");
                            funcionarios.setRg(rg_formatador(rgParaFormatar = Ler.next()));
                            System.out.println(getRg());
                            System.out.println("==== Cadastro atualizado ====");
                            break;
                        case 11:
                            System.out.println("Informe o novo telefone: ");
                            funcionarios.setTelefone(Ler.nextLine());
                            System.out.println("==== Cadastro atualizado ====");
                            break;
                        case 12:
                            System.out.println("Informe o novo e-mail: ");
                            funcionarios.setEmail(Ler.nextLine());
                            System.out.println("==== Cadastro atualizado ====");
                            break;
                        case 13:
                            System.out.println("Informe o novo endereço: ");
                            funcionarios.setEndereco(Ler.nextLine());
                            System.out.println("==== Cadastro atualizado ====");
                            break;
                        case 14:
                            System.out.println("Informe o novo bairro: ");
                            funcionarios.setBairro(Ler.nextLine());
                            System.out.println("==== Cadastro atualizado ====");
                            break;
                        case 15:
                            System.out.println("Informe a nova referência: ");
                            funcionarios.setReferencia(Ler.nextLine());
                            System.out.println("==== Cadastro atualizado ====");
                            break;
                        case 16:
                            System.out.println("Informe o novo CEP: ");
                            funcionarios.setCep(cep_formatador(cepParaFormatar = Ler.next()));
                            System.out.println(getCep());
                            System.out.println("==== Cadastro atualizado ====");
                            break;
                        case 17:
                            System.out.println("Informe a nova cidade: ");
                            funcionarios.setCidade(Ler.nextLine());
                            System.out.println("==== Cadastro atualizado ====");
                            break;
                        case 18:
                            System.out.println("Informe o novo estado: ");
                            funcionarios.setEstado(Ler.nextLine());
                            System.out.println("==== Cadastro atualizado ====");
                            break;
                        case 0:
                            System.out.println("==== Sair ====");
                            opcaoWhile = 0; // Finaliza o método
                            break;
                    }
                }
            }
        }

    public void ExcluirFuncionario() {
        for (int i = 0; i < listaFuncionario.size(); i++) {
            System.out.println("Informe o ID para deletar: ");
            int idExcluir = Ler.nextInt();
            if (listaFuncionario.get(i).getIdFuncionario() == idExcluir) {
                listaFuncionario.remove(i);
                System.out.println("Funcionário excluído");
                break;
            }
        }
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public String getnCarteiraTrabalho() {
        return nCarteiraTrabalho;
    }

    public void setnCarteiraTrabalho(String nCarteiraTrabalho) {
        this.nCarteiraTrabalho = nCarteiraTrabalho;
    }

    public List<Funcionarios> getListaFuncionario() {
        return listaFuncionario;
    }

    public void setListaFuncionario(List<Funcionarios> listaFuncionario) {
        this.listaFuncionario = listaFuncionario;
    }

    public int getOpcaoWhile() {
        return opcaoWhile;
    }

    public void setOpcaoWhile(int opcaoWhile) {
        this.opcaoWhile = opcaoWhile;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    

    public String cpf_formatador(String cpf) {
        cpf = cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11);

        return cpf;

    }

    public String rg_formatador(String rg) {
        rg = rg.substring(0, 2) + "." + rg.substring(2, 5) + "." + rg.substring(5, 8) + "-" + rg.substring(8, 10);
        return rg;
    }

    public String cep_formatador(String cep) {
        cep = cep.substring(0, 5) + "-" + cep.substring(5, 7);
        return cep;
    }
}
