package reposicion.unah.reposicion.modelos;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "equipos")
@Data
public class EquipoModelo<posicion> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoEquipo")
    private Integer codigoEquipo;

    private String nombre;

    private Double ataque;
    
    private Double defensa;

    @OneToOne (mappedBy = "equipo",cascade = CascadeType.ALL)
    private posicion posicion;
    
}
