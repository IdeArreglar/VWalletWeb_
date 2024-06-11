package pe.edu.upc.vwalletweb.serviceinterfaces;

import pe.edu.upc.vwalletweb.entities.Menu;
import pe.edu.upc.vwalletweb.entities.RecargaSaldo;

import java.util.List;

public interface IMenuService {
    void insert(Menu menu);

    List<Menu> list();
    public Menu listarId(Integer idMenu);

    void delete(int idMenu);

    List<String[]> MenuDisponiblePorSede();

    List<String[]> menusCaros();

    List<String[]> platosMasPedidos();

    List<String[]> menusEconomicos();
}
