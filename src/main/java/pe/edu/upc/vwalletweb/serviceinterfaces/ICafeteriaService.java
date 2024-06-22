package pe.edu.upc.vwalletweb.serviceinterfaces;

import pe.edu.upc.vwalletweb.entities.Cafeteria;
import pe.edu.upc.vwalletweb.entities.Transporte;

import java.util.List;

public interface ICafeteriaService {
    public void insert(Cafeteria cafeteria);

    public List<Cafeteria> list();

    public Cafeteria listarId(Integer idCafeteria);

    public void delete(int idCafeteria);
    List<String[]> PromedioPreciosDeMenuXCafeteria();
}
