package ar.edu.unahur.Planes;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.Usuarios.Usuario;
import ar.edu.unahur.contenido.Contenido;

public class PlanBasico implements PlanSuscribible {
    private Integer limite;
    
    private Double costoBase;

    @Override
    public Double costoPlan(Usuario unUsuario) {
        List<Contenido> contenidoUsuario = unUsuario.getContenidos();
        List<Contenido> excedentes = contenidoUsuario.subList(limite,contenidoUsuario.size()).orElse(List new ArrayList<>() );
        if(limite >= contenidoUsuario.size()){
            return costoBase ;
        }
        else{
            return costoBase +excedentes.stream().mapToDouble(c->costoBase).sum();
        }
    }

    public PlanBasico(Integer limite, Double costoBase) {
        this.limite = limite;
        this.costoBase = costoBase;
    }
    

}
