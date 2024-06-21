package pe.edu.upc.vwalletweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.vwalletweb.entities.RecargaSaldo;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IRecargaSaldoRepository extends JpaRepository<RecargaSaldo, Integer> {
    //Query 1
    @Query(value = "SELECT u.name_usuario, SUM(monto_recarga) AS total_recargado\n " +
            "FROM recargasaldo r\n " +
            "JOIN usuario u ON u.id_usuario = r.usuario_id\n " +
            "GROUP BY u.name_usuario ", nativeQuery = true)
    List<String[]> TotalRecargadoUsuario();

    //Query 9
    @Query(value = """
            SELECT id_recarga_saldo, fecha_recarga, monto_recarga, usuario_id FROM recargasaldo \s
            WHERE fecha_recarga \s
            BETWEEN :fInicio AND :fFin \s
            """, nativeQuery = true)
    List<String[]> FechaRecargaSaldoIntervalo(LocalDate fInicio, LocalDate fFin);
}
