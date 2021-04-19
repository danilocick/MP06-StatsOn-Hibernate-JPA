package Entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table( name = "partido")
public class Partido {
    @Id
    @Column(name = "id_partido")
    private  int id_partido;
    @Column(name = "id_equipo_local")
    private  int id_equipo_local;
    @Column(name = "id_equipo_visitante")
    private  int id_equipo_visitante;
    @Column(name = "fecha")
    private Date fecha;


    public int getId_partido() {
        return id_partido;
    }

    public void setId_partido(int id_partido) {
        this.id_partido = id_partido;
    }

    public int getId_equipo_local() {
        return id_equipo_local;
    }

    public void setId_equipo_local(int id_equipo_local) {
        this.id_equipo_local = id_equipo_local;
    }

    public int getId_equipo_visitante() {
        return id_equipo_visitante;
    }

    public void setId_equipo_visitante(int id_equipo_visitante) {
        this.id_equipo_visitante = id_equipo_visitante;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
