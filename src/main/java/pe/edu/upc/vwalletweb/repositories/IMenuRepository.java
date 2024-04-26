package pe.edu.upc.vwalletweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.vwalletweb.entities.Menu;

import java.util.List;

@Repository
public interface IMenuRepository extends JpaRepository<Menu,Integer> {
    @Query(value="SELECT m.* FROM menu m \n" +
            "JOIN cafeteria c ON m.cafeteria_id = c.id_cafeteria \n" +
            "WHERE c.sede_cafeteria = 'San Isidro'",nativeQuery = true)
    public List<String[]>MenuDisponiblePorSede();
}
