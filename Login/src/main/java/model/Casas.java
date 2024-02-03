package model;

public class Casas {
    
    private String id;
    private String endereco;
    private String numeroQuartos;
    private String area;

    public Casas(String id, String endereco, String numeroQuartos, String area) {
        this.id = id;
        this.endereco = endereco;
        this.numeroQuartos = numeroQuartos;
        this.area = area;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumeroQuartos() {
        return numeroQuartos;
    }

    public void setNumeroQuartos(String numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
}