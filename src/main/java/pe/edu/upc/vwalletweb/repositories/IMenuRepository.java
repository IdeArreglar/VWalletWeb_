package pe.edu.upc.vwalletweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.vwalletweb.entities.Menu;

import java.util.List;

@Repository
public interface IMenuRepository extends JpaRepository<Menu, Integer> {

    //Query 4
    @Query(value = "SELECT c.sede_cafeteria, COUNT(m.id_menu) as cantidad_menus\n " +
            "FROM cafeteria c\n " +
            "JOIN menu m ON c.id_cafeteria= m.cafeteria_id\n " +
            "GROUP BY c.sede_cafeteria ", nativeQuery = true)
    List<String[]> CantidaddeMenusporSede();
    //Query 2
    @Query(value = "SELECT m.plato_principal, SUM(m.precio_menu) AS total_gasto \n " +
            "FROM detallereservas dr\n " +
            "JOIN menu m ON dr.menu_id = m.id_menu \n " +
            "GROUP BY m.plato_principal \n " +
            "ORDER BY total_gasto DESC ", nativeQuery = true)

    List<String[]> menusCaros();
//Query 8
    @Query(value = "SELECT m.plato_principal AS plato_mas_pedido, COUNT(*) AS cantidad \n " +
            "FROM Menu m \n " +
            "JOIN DetalleReservas dr ON dr.menu_id = m.id_menu \n " +
            "GROUP BY m.plato_principal \n " +
            "ORDER BY cantidad DESC ", nativeQuery = true)
    List<String[]>platosMasPedidos();
//Query 10
    @Query(value = "SELECT m.plato_principal, m.precio_menu  \n " +
            "FROM menu m  \n " +
            "WHERE m.precio_menu < (SELECT AVG(precio_menu) FROM menu); ",nativeQuery = true)
    List<String[]>menusEconomicos();
}
