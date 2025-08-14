package ar.edu.unahur.contenido;

public class Idra {
    private static Idra instance = new Idra();
    private Double valor = 0.5;
    
    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    public static Idra getInstance(){
        return instance ;
    }
    private Idra() {} //asi se anula un constructor
}
