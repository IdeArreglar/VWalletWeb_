package pe.edu.upc.vwalletweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.vwalletweb.entities.Transporte;

import java.util.List;

@Repository
public interface ITransporteRepository extends JpaRepository<Transporte, Integer> {
    //Query 3
    @Query(value = """
            SELECT id_transporte,universidad_salida, universidad_llegada \s
            FROM transporte \s
            WHERE universidad_salida = :uSalida \s
                AND universidad_llegada = :uLlegada \s
                AND hora_salida >= NOW(); \s
            """, nativeQuery = true)
    List<String[]> transportesUniversidades(String uSalida, String uLlegada);
}
