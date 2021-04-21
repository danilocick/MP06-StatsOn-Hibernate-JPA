package Entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table( name = "equipo")
public class Equipo {
    @Id
    @Column(name = "id_equipo")
    private  int id_equipo;
    @Column(name = "nom")
    private  String nom;

    @OneToMany(mappedBy = "equipo")
    private List<Jugador> personas;


    public List<Jugador> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Jugador> personas) {
        this.personas = personas;
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
