package pe.edu.upc.vwalletweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.vwalletweb.entities.Transporte;

import java.util.List;

@Repository
public interface ITransporteRepository extends JpaRepository<Transporte, Integer> {
    @Query(value = "SELECT id_transporte,universidad_salida, universidad_llegada \n" +
            "FROM transporte \n" +
            "WHERE universidad_salida = :uSalida \n" +
            "    AND universidad_llegada = :uLlegada \n" +
            "    AND hora_llegada >= NOW(); \n", nativeQuery = true)
    List<String[]> transportesUniversidades(String uSalida, String uLlegada);
}
