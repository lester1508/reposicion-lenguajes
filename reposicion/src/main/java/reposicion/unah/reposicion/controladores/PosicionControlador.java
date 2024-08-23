package reposicion.unah.reposicion.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import reposicion.unah.reposicion.modelos.PosicionModelo;
import reposicion.unah.reposicion.servicios.PosicionServicio;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/posiciones")
public class PosicionControlador {

    @Autowired
    private PosicionServicio posicionServicio;

    @PostMapping("/crear")
    public PosicionModelo crearOActualizarPosicion(@RequestBody PosicionModelo posicion) {
        return posicionServicio.crearOActualizarPosicion(posicion);
    }

    @DeleteMapping("/eliminar/{codigoEquipo}")
    public void eliminarPosicion(@PathVariable Integer codigoEquipo) {
        posicionServicio.eliminarPosicion(codigoEquipo);
    }

    @GetMapping("/buscar/{codigoEquipo}")
    public Optional<PosicionModelo> buscarPosicion(@PathVariable Integer codigoEquipo) {
        return posicionServicio.buscarPosicion(codigoEquipo);
    }

    @GetMapping("/todas")
    public List<PosicionModelo> obtenerTodasLasPosiciones() {
        return posicionServicio.obtenerTodasLasPosiciones();
    }
}

