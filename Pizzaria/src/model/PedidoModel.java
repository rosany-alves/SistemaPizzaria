package model;
//insert update precisa ser igual ao BD
public class PedidoModel extends ClienteModel{
    private String ingrediente;
    private String tamanho;
    private String preco;
    
//insert code - getter and setter

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }


}