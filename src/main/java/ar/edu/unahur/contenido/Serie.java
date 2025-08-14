package ar.edu.unahur.contenido;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido{
    private  List<Temporada> temporadas = new ArrayList<>();

    public Serie(String titulo, Double costoBase, List<Temporada> temporadas) {
        super(titulo, costoBase);
        this.temporadas = temporadas;
    }

    public Serie(String titulo, Double costoBase) {
        super(titulo, costoBase);
    }

    public List<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(List<Temporada> temporadas) {
        this.temporadas = temporadas;
    }
    
    public void agregarTemporada(Temporada unTemporada){
        temporadas.add(unTemporada);
    }
    
    @Override
    protected Double cargosAdicionales() {
        
        return temporadas.stream().mapToDouble(t-> t.costoPromedio()).average().orElse(0.0);
    }
    
    
}
