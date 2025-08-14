package ar.edu.unahur.Usuarios;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.Planes.PlanSuscribible;
import ar.edu.unahur.contenido.Contenido;

public class Usuario {
    private  PlanSuscribible plan;
    
    private List<Contenido> contenidos = new ArrayList<>();
    
    public Usuario(PlanSuscribible plan, List<Contenido> contenidos) {
        this.plan = plan;
        this.contenidos = contenidos;
    }

    public Usuario(List<Contenido> contenidos) {
        this.contenidos = contenidos;
    }

    public PlanSuscribible getPlan() {
        return plan;
    }

    public void setPlan(PlanSuscribible plan) {
        this.plan = plan;
    }
    
    public void verContenido(Contenido unContenido){
        contenidos.add(unContenido)
    }

    public List<Contenido> getContenidos() {
        return contenidos;
    }

    
    
}
