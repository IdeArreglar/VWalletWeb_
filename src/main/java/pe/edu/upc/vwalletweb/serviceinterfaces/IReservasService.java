package pe.edu.upc.vwalletweb.serviceinterfaces;

import pe.edu.upc.vwalletweb.entities.RecargaSaldo;
import pe.edu.upc.vwalletweb.entities.Reservas;

import java.util.List;

public interface IReservasService {

    public void insert(Reservas reservas);

    public List<Reservas> list();

    public Reservas listarId(Integer idReservas);

    public void delete(int idReservas);
}
