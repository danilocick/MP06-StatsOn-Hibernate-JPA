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


    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public int getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(int id_equipo) {
        this.id_equipo = id_equipo;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
