package model;

import javax.swing.JOptionPane;

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
    
    public Casas() {
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
    
    public double calcularDensidadeQuartosPorMetroQuadrado() {
  
        double numeroQuartosDouble = Double.parseDouble(numeroQuartos);
        double areaDouble = Double.parseDouble(area);


        if (areaDouble == 0) {
            JOptionPane.showMessageDialog(null, "0");
        }
        else{
            JOptionPane.showMessageDialog(null," A densidade de Quartos dessa casa é :"+numeroQuartosDouble / areaDouble);
        }  
        return 0;
    }

}