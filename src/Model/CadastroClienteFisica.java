/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Bruna Leonel
 */
public class CadastroClienteFisica extends CadastroCliente{
    private String Cpf;
    private String Rg;
    private String datanascimento;

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getRg() {
        return Rg;
    }

    public void setRg(String Rg) {
        this.Rg = Rg;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

   
    public CadastroClienteFisica(int id, String nome, String endereço, String complemento, String bairro, String cidade, String telefone, String celular, String email, String tipodevia, String estado, String CEP, String Tipopessoa, float limite, String Rg, String Cpf,String datanascimento) {
        this.id = id;
        this.nome = nome;
        this.endereço = endereço;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        this.tipodevia = tipodevia;
        this.estado = estado;
        this.CEP = CEP;
        this.Tipopessoa = Tipopessoa;
        this.limite = limite;
        this.Cpf=Cpf;
        this.Rg= Rg;
        this.datanascimento=datanascimento;
    }
    public CadastroClienteFisica() {
        
    }

   
}
