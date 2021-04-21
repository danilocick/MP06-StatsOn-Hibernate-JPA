package Entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table( name = "jugador")
@Inheritance(strategy= InheritanceType.JOINED)
public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private  int id_persona;

//    @Column(name="id_equipo")
//    private int equipo;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_equipo")
    private Equipo equipo;

    @Column(name = "nom")
    private String nom;
    @Column(name = "dorsal")
    private int dorsal;
    @Column(name = "patrocinador")
    private String patrocinador;


    //GETTERS AND SETTERS
    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(String patrocinador) {
        this.patrocinador = patrocinador;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

//    public int getEquipo() {
//        return equipo;
//    }
//
//    public void setEquipo(int equipo) {
//        this.equipo = equipo;
//    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
}
