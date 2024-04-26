package pe.edu.upc.vwalletweb.serviceinterfaces;

import pe.edu.upc.vwalletweb.entities.Transporte;

import java.util.List;

public interface ITransporteService {
    public void insert(Transporte transporte);

    public List<Transporte> list();

    public void delete(int idTransporte);
}
