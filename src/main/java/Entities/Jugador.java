package Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "jugador")
public class Jugador extends Persona{
    @Column(name = "dorsal")
    private int dorsal;
    @Column(name = "patrocinador")
    private int patrocinador;
}