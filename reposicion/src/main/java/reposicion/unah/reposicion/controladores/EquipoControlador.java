package reposicion.unah.reposicion.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import reposicion.unah.reposicion.modelos.EquipoModelo;
import reposicion.unah.reposicion.servicios.EquipoServicio;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/equipos")
public class EquipoControlador {

    @Autowired
    private EquipoServicio equipoServicio;

    @PostMapping("/crear")
    public EquipoModelo crearEquipo(@RequestBody EquipoModelo equipo) {
        return equipoServicio.crearEquipo(equipo);
    }

    @DeleteMapping("/eliminar/{codigoEquipo}")
    public void eliminarEquipo(@PathVariable Integer codigoEquipo) {
        equipoServicio.eliminarEquipo(codigoEquipo);
    }

    @GetMapping("/buscar/{codigoEquipo}")
    public Optional<EquipoModelo> buscarEquipo(@PathVariable Integer codigoEquipo) {
        return equipoServicio.buscarEquipo(codigoEquipo);
    }

    @PostMapping("/simular")
    public void simularPartidos() {
        equipoServicio.simularPartidos();
    }

    @GetMapping("/todos")
    public List<EquipoModelo> obtenerTodosEquipos() {
        return equipoServicio.obtenerTodosEquipos();
    }
}

