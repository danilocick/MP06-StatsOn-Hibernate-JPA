package Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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
}
