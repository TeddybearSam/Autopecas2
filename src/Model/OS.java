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
public class OS {
    private int Id;
    private int IdCarro;
    private String Placa;
    private String km;
    private String Servico;
    private String TipoServico;
    private String Peças;
    private String QuantPecas;
    private String ValorPeca;
    private String ValorTotal;
    private String Mecanico;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getIdCarro() {
        return IdCarro;
    }

    public void setIdCarro(int IdCarro) {
        this.IdCarro = IdCarro;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public String getServico() {
        return Servico;
    }

    public void setServico(String Servico) {
        this.Servico = Servico;
    }

    public String getTipoServico() {
        return TipoServico;
    }

    public void setTipoServico(String TipoServico) {
        this.TipoServico = TipoServico;
    }

    public String getPeças() {
        return Peças;
    }

    public void setPecas(String Peças) {
        this.Peças = Peças;
    }

    public String getQuantPecas() {
        return QuantPecas;
    }

    public void setQuantPecas(String QuantPecas) {
        this.QuantPecas = QuantPecas;
    }

    public String getValorPeca() {
        return ValorPeca;
    }

    public void setValorPeca(String ValorPeca) {
        this.ValorPeca = ValorPeca;
    }

    public String getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(String ValorTotal) {
        this.ValorTotal = ValorTotal;
    }

    public String getMecanico() {
        return Mecanico;
    }

    public void setMecanico(String Mecânico) {
        this.Mecanico = Mecânico;
    }

    public OS(int Id, int IdCarro, String Placa, String km, String DescricaoServico, String TipoServico, String Peças, String QuantPecas, String ValorPeca, String ValorTotal, String Mecânico) {
        this.Id = Id;
        this.IdCarro = IdCarro;
        this.Placa = Placa;
        this.km = km;
        this.Servico = DescricaoServico;
        this.TipoServico = TipoServico;
        this.Peças = Peças;
        this.QuantPecas = QuantPecas;
        this.ValorPeca = ValorPeca;
        this.ValorTotal = ValorTotal;
        this.Mecanico = Mecânico;
    }

    public OS() {
    }
    
}

