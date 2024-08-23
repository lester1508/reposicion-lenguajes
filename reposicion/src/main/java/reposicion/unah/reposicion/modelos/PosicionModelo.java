package reposicion.unah.reposicion.modelos;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "posiciones")
@Data
public class PosicionModelo {

    @Id
    @Column(name = "codigoEquipo")
    private Integer codigoEquipo;

    private Integer empates;

    private Integer ganados;

    private Integer perdidos;

    @Column(name = "golesFavor" )
    private Integer golesFavor;

    @Column(name = "golesFavor" )
    private Integer golesContra;

    private Integer puntos;

    @OneToOne
    @JoinColumn(name = "codigoEquipo",referencedColumnName = "codigoequipo")
    private EquipoModelo equipo;

    
   
}
