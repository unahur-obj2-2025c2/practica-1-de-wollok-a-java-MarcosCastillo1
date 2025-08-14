package ar.edu.unahur.contenido;

public abstract class Contenido {
    private String titulo;
    private Double costoBase;
    
    public Contenido(String titulo, Double costoBase) {
        this.titulo = titulo;
        this.costoBase = costoBase;
    }

    public String getTitulo() {
        return titulo;
    }

    public Double getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(Double costoBase) {
        this.costoBase = costoBase;
    }

    public Double COSTO(){
        return costoBase + this.cargosAdicionales();
    }

    protected abstract Double cargosAdicionales();
    
}

