package ar.edu.unahur.contenido;

public class Pelicula extends Contenido{

    public Pelicula(String titulo, Double costoBase) {
        super(titulo, costoBase);
    }

    @Override
    protected Double cargosAdicionales() {
        return 0.0 ;

        
    }

    

}   
