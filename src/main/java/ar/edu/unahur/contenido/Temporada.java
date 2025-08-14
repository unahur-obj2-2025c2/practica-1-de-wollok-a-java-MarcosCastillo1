package ar.edu.unahur.contenido;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
    private final Integer numero; //es una constante
    
    private List<Episodio> episodios = new ArrayList<>();  //en lugar de new list se pone new ArrayList<>()
   
    public Temporada(Integer numero, List<Episodio> episodios) {
        this.numero = numero;
        this.episodios = episodios;
    }

    public Temporada(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public List<Episodio> getEpisodios() {
        return episodios;
    }

    public void agregarEpisodio(Episodio unEpisodio){
        episodios.add(unEpisodio) ;
    }

    public Double costoPromedio(){
        return episodios.stream().mapToDouble(e -> e.getCosto()).average().orElse(0.0); // el orElse se pone ya que no se puede hacer un map a lista vacia,
        // el stream lo convierte en flujo de datos para poder iterar en la lista
    }
    



}
