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
public class CadastroClienteJuridica extends CadastroCliente{
    private String Cnpj;
    private String inscriçãoestadual;

    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String Cnpj) {
        this.Cnpj = Cnpj;
    }

    public String getInscriçãoestadual() {
        return inscriçãoestadual;
    }

    public void setInscriçãoestadual(String inscriçãoestadual) {
        this.inscriçãoestadual = inscriçãoestadual;
    }

      public CadastroClienteJuridica(int id, String nome, String endereço, String complemento, String bairro, String cidade, String telefone, String celular, String email, String tipodevia, String estado, String CEP, String Tipopessoa, float limite,String Cnpj, String inscriçãoestadual) {
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
        this.Cnpj = Cnpj;
        this.inscriçãoestadual = inscriçãoestadual;
    }
    public CadastroClienteJuridica() {
        
    }
    
    
    
}
