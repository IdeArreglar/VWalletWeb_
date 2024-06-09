package pe.edu.upc.vwalletweb.serviceinterfaces;

import pe.edu.upc.vwalletweb.entities.Cafeteria;
import pe.edu.upc.vwalletweb.entities.Libro;

import java.util.List;

public interface ILibroService {
    public void insert(Libro libro);

    public List<Libro> list();

    public Libro listarId(Integer idLibro);
    public void delete(int idLibro);
}
