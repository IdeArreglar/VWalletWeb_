package pe.edu.upc.vwalletweb.serviceinterfaces;

import pe.edu.upc.vwalletweb.entities.Menu;

import java.util.List;

public interface IMenuService {
    public void insert(Menu menu);

    public List<Menu> list();

    public void delete(int idMenu);

    public List<String[]>MenuDisponiblePorSede();

}
