package pe.edu.upc.vwalletweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.vwalletweb.entities.Reservas;

import java.util.List;

@Repository
public interface IReservasRepository extends JpaRepository<Reservas,Integer> {

    @Query(value = "SELECT u.name_usuario, COUNT(*) AS total_reservas\n " +
            "FROM reservas r\n " +
            "JOIN usuario u ON u.id_usuario = r.usuario_id\n " +
            "GROUP BY u.name_usuario; ", nativeQuery = true)
    List<String[]> CantidadReservasXUsuario();
}
