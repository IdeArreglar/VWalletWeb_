package pe.edu.upc.vwalletweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.vwalletweb.entities.Cafeteria;

import java.util.List;

@Repository
public interface ICafeteriaRepository extends JpaRepository<Cafeteria,Integer> {

    @Query(value = "SELECT c.sede_cafeteria, AVG(m.precio_menu) AS precio_promedio\n " +
            "FROM cafeteria c\n " +
            "JOIN menu m ON c.id_cafeteria = m.cafeteria_id\n " +
            "GROUP BY c.sede_cafeteria; ", nativeQuery = true)
    List<String[]> PromedioPreciosDeMenuXCafeteria();

}
