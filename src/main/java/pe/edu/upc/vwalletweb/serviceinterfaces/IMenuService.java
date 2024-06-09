package pe.edu.upc.vwalletweb.serviceinterfaces;

import pe.edu.upc.vwalletweb.entities.Libro;
import pe.edu.upc.vwalletweb.entities.Menu;

import java.util.List;

public interface IMenuService {
    void insert(Menu menu);

    List<Menu> list();

    void delete(int idMenu);

    public Menu listarId(Integer idMenu);

    List<String[]> MenuDisponiblePorSede();

    List<String[]> menusCaros();

    List<String[]> platosMasPedidos();

    List<String[]> menusEconomicos();
}
