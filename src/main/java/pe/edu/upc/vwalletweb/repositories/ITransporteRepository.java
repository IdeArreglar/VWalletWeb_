package pe.edu.upc.vwalletweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.vwalletweb.entities.Transporte;

@Repository
public interface ITransporteRepository extends JpaRepository<Transporte,Integer> {
}
