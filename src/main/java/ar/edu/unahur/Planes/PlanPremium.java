package ar.edu.unahur.Planes;

import ar.edu.unahur.Usuarios.Usuario;

public class PlanPremium implements PlanSuscribible {
    private Double valorPremium;
    
    public PlanPremium(Double valorPremium) {
        this.valorPremium = valorPremium;
    }

    @Override
    public Double costoPlan(Usuario unUsuario) {
      return valorPremium;
    }

    public Double getValorPremium() {
        return valorPremium;
    }

    public void setValorPremium(Double valorPremium) {
        this.valorPremium = valorPremium;
    }

    

}
