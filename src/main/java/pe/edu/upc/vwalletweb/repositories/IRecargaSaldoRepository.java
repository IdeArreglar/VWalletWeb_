package pe.edu.upc.vwalletweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.vwalletweb.entities.RecargaSaldo;

import java.util.List;

@Repository
public interface IRecargaSaldoRepository extends JpaRepository<RecargaSaldo,Integer> {
    @Query(value = "SELECT usuario_id, SUM(monto_recarga) AS total_recargado \n" +
            "FROM recargasaldo \n" +
            "GROUP BY usuario_id; \n", nativeQuery = true)
    public List<String[]>TotalRecargadoUsuario();


    @Query(value="SELECT * FROM recargasaldo  \n" +
            "WHERE fecha_recarga  \n" +
            "BETWEEN '2024-01-01' AND '2024-01-31' \n",nativeQuery = true)
    public List<String[]>FechaRecargaSaldoIntervalo();
}
