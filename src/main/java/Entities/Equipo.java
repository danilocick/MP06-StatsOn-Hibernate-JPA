package Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "equipo")
public class Equipo {
    @Id
    @Column(name = "id_equipo")
    private  int id_equipo;
    @Column(name = "nom")
    private  String nom;
}
