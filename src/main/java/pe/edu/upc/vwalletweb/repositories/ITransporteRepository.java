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
               
            """, nativeQuery = true)
    List<String[]> transportesUniversidades(String uSalida, String uLlegada);

    @Query(value = "SELECT u.name_usuario, SUM(t.precio_transporte) AS TotalGastoTransporte\n " +
            "FROM reservas r\n " +
            "JOIN detallereservas dr ON r.id_reservas = dr.reservas_id\n " +
            "JOIN transporte t ON dr.transporte_id = t.id_transporte\n " +
            "JOIN usuario u ON r.usuario_id = u.id_usuario\n " +
            "GROUP BY u.name_usuario ", nativeQuery = true)
    List<String[]> totalGastoxUsuario();
}
