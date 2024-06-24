package pe.edu.upc.vwalletweb.serviceinterfaces;

import pe.edu.upc.vwalletweb.entities.Reservas;
import pe.edu.upc.vwalletweb.entities.Transporte;

import java.util.List;

public interface IReservasService {

    public void insert(Reservas reservas);

    public Reservas listarId(Integer idReservas);

    public List<Reservas> list();

    public void delete(int idReservas);

    List<String[]> CantidadReservasXUsuario();

    List<String[]> CantidadReservasXUsuario2();
}
