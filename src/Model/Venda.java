
package Model;

public class Venda {
    
  private float desconto ;
  private float valortotal;

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public float getValortotal() {
        return valortotal;
    }

    public void setValortotal(float valortotal) {
        this.valortotal = valortotal;
    }

    public Venda(float desconto, float valortotal) {
        this.desconto = desconto;
        this.valortotal = valortotal;
    }
  
  
   
}
