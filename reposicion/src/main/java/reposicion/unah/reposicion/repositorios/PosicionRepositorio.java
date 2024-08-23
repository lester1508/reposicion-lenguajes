package reposicion.unah.reposicion.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import reposicion.unah.reposicion.modelos.PosicionModelo;

@Repository
public interface PosicionRepositorio extends JpaRepository<PosicionModelo, Integer> {
}

