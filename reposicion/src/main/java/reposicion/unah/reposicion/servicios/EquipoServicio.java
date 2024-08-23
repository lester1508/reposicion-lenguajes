package reposicion.unah.reposicion.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reposicion.unah.reposicion.modelos.EquipoModelo;
import reposicion.unah.reposicion.modelos.PosicionModelo;
import reposicion.unah.reposicion.repositorios.EquipoRepositorio;
import reposicion.unah.reposicion.repositorios.PosicionRepositorio;

import java.util.List;


@Service
public class EquipoServicio {

    @Autowired
    private EquipoRepositorio equipoRepositorio;

    @Autowired
    private PosicionRepositorio posicionRepositorio;

    public EquipoModelo crearEquipo (EquipoModelo equipo) {
        return    equipoRepositorio.save (equipo);
    }

    public boolean eliminarEquipo(Integer codigoEquipo) {
       
        if (posicionRepositorio.existsById (codigoEquipo)) {
                      return false; 
        }
    
        equipoRepositorio.deleteById (codigoEquipo);
                 return true; 
    }

    public List<EquipoModelo> obtenerTodosEquipos() {
        return equipoRepositorio.findAll();
    }

    public void simularPartidos() {
        List<EquipoModelo> equipos = equipoRepositorio.findAll();

        if (equipos.size() < 6) {
            return("No hay equois sufiecientes para simular el partido.");
        }

        for (int i = 0; i < equipos.size(); i++) {
            for (int j = i + 1; j < equipos.size(); j++) {
                
            }
        }
    }

    private void simularPartido(EquipoModelo equipoA, EquipoModelo equipoB) {
   

        PosicionModelo posicionA = posicionRepositorio.findById(equipoA.getCodigoEquipo())
               
        PosicionModelo posicionB = posicionRepositorio.findById(equipoB.getCodigoEquipo())
                

        if (golesA > golesB) {
            posicionA.setPuntos(posicionA.getPuntos() + 3);
        } else if (golesB > golesA) {
            posicionB.setPuntos(posicionB.getPuntos() + 3);
        } else {
            

        posicionA.setGolesFavor(posicionA.getGolesFavor() + golesA);
        posicionA.setGolesContra(posicionA.getGolesContra() + golesB);
      

        
        posicionRepositorio.save(posicionA);
        posicionRepositorio.save(posicionB);
    }

    public List<PosicionModelo> obtenerTablaPosiciones() {
        return posicionRepositorio.findAll();
    }
}






/* 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipoServicio {

    @Autowired
    private EquipoRepositorio equipoRepositorio;

    @Autowired
    private PosicionRepositorio posicionRepositorio;

    public EquipoModelo crearEquipo(EquipoModelo nuevoEquipo) {
        // Aquí puedes agregar lógica adicional si es necesario
        return equipoRepositorio.save(nuevoEquipo);
    }

    public boolean eliminarEquipo(Integer codigoEquipo) {
        // Verificar si el equipo tiene un registro en la tabla de posiciones
        if (posicionRepositorio.existsById(codigoEquipo)) {
            return false; // El equipo no se puede eliminar
        }
        // Si no tiene registros en posiciones, eliminar el equipo
        equipoRepositorio.deleteById(codigoEquipo);
        return true; // El equipo se ha eliminado
    }
}*/
