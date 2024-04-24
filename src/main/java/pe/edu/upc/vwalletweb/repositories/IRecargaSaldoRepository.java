package pe.edu.upc.vwalletweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.vwalletweb.entities.RecargaSaldo;

@Repository
public interface IRecargaSaldoRepository extends JpaRepository<RecargaSaldo,Integer> {
}
