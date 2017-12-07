/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Aleska
 */
public class Carro {
    private int Id;
    private String Cpf;
    private String Modelo;
    private String Marca;
    private String Placa;
    private String Cor;
    private String Km;
    private String Chassi;
    private String DataVenda;
    private String AnoFabricacao;
    private String AnoModelo;
    private String Pintura;
    private String Detalhamento;
    private String Nome;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public String getKm() {
        return Km;
    }

    public void setKm(String Km) {
        this.Km = Km;
    }

    public String getChassi() {
        return Chassi;
    }

    public void setChassi(String Chassi) {
        this.Chassi = Chassi;
    }

    public String getDataVenda() {
        return DataVenda;
    }

    public void setDataVenda(String DataVenda) {
        this.DataVenda = DataVenda;
    }

    public String getAnoFabricacao() {
        return AnoFabricacao;
    }

    public void setAnoFabricacao(String AnoFabricacao) {
        this.AnoFabricacao = AnoFabricacao;
    }

    public String getAnoModelo() {
        return AnoModelo;
    }

    public void setAnoModelo(String AnoModelo) {
        this.AnoModelo = AnoModelo;
    }

    public String getPintura() {
        return Pintura;
    }

    public void setPintura(String Pintura) {
        this.Pintura = Pintura;
    }

    public String getDetalhamento() {
        return Detalhamento;
    }

    public void setDetalhamento(String Detalhamento) {
        this.Detalhamento = Detalhamento;
    }

    public Carro(int Id, String Cpf, String Modelo, String Marca, String Placa, String Cor, String Km, String Chassi, String DataVenda, String AnoFabricacao, String AnoModelo, String Pintura, String Detalhamento) {
        this.Id = Id;
        this.Cpf = Cpf;
        this.Modelo = Modelo;
        this.Marca = Marca;
        this.Placa = Placa;
        this.Cor = Cor;
        this.Km = Km;
        this.Chassi = Chassi;
        this.DataVenda = DataVenda;
        this.AnoFabricacao = AnoFabricacao;
        this.AnoModelo = AnoModelo;
        this.Pintura = Pintura;
        this.Detalhamento = Detalhamento;
    }

    public Carro() {
    }
        
}
