package reposicion.unah.reposicion.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reposicion.unah.reposicion.modelos.PosicionModelo;
import reposicion.unah.reposicion.repositorios.PosicionRepositorio;

import java.util.List;
import java.util.Optional;

@Service
public class PosicionServicio {

    @Autowired
    private PosicionRepositorio posicionRepositorio;

    public PosicionModelo crearOActualizarPosicion(PosicionModelo posicion) {
        return posicionRepositorio.save(posicion);
    }

    public void eliminarPosicion(Integer codigoEquipo) {
        posicionRepositorio.deleteById(codigoEquipo);
    }

    public Optional<PosicionModelo> buscarPosicion(Integer codigoEquipo) {
        return posicionRepositorio.findById(codigoEquipo);
    }

    public List<PosicionModelo> obtenerTodasLasPosiciones() {
        return posicionRepositorio.findAll();
    }
}

