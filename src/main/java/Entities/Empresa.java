package Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
}
