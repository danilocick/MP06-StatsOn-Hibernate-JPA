package Entities;

import javax.persistence.*;

@Entity
@Table( name = "jugador")
public class Jugador extends Persona{
    @Column(name = "dorsal")
    private int dorsal;
    @Column(name = "patrocinador")
    private int patrocinador;

    @ManyToOne()
    @JoinColumn(name = "num_entidad_fiscal")
    private Empresa empresa;

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(int patrocinador) {
        this.patrocinador = patrocinador;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}