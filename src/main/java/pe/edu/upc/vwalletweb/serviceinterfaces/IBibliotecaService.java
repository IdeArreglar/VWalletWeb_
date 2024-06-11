package pe.edu.upc.vwalletweb.serviceinterfaces;

import pe.edu.upc.vwalletweb.entities.Biblioteca;
import pe.edu.upc.vwalletweb.entities.Transporte;

import java.util.List;

public interface IBibliotecaService {
    public void insert(Biblioteca biblioteca);

    public List<Biblioteca> list();
    public Biblioteca listarId(Integer idBiblioteca);
    public void delete(int idBiblioteca);

    List<String[]>LibroDisponiblePorSede();
}
