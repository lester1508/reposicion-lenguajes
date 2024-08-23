package reposicion.unah.reposicion.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import reposicion.unah.reposicion.modelos.EquipoModelo;

@Repository
public interface EquipoRepositorio extends JpaRepository<EquipoModelo, Integer> {
}
