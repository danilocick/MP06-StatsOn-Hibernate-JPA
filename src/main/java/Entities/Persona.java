package Entities;

import javax.persistence.*;

@Entity
@Table( name = "persona")
@Inheritance(strategy= InheritanceType.JOINED)
public class Persona {
    @Id
    @Column(name = "id_persona")
    private  int id_persona;
    @Column(name = "id_equipo")
    private  int id_equipo;
    @Column(name = "nom")
    private String nom;
}
