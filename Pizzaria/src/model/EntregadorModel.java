package model;
//insert update precisa ser igual ao BD
public class EntregadorModel {
    private int id;
    private int codigo;
    private String nome;
    private String celular;
    private String data;
//insert code - getter and setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}