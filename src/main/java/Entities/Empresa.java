package Entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table( name = "empresa")
public class Empresa {
    @Id
    @Column(name = "num_entidad_fiscal")
    private  int num_entidad_fiscal;
    @Column(name = "nom")
    private  String nom;
    @Column(name = "presupuesto")
    private int presupuesto;



    public int getNum_entidad_fiscal() {
        return num_entidad_fiscal;
    }

    public void setNum_entidad_fiscal(int num_entidad_fiscal) {
        this.num_entidad_fiscal = num_entidad_fiscal;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
}
