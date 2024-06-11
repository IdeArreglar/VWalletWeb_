package pe.edu.upc.vwalletweb.serviceinterfaces;


import pe.edu.upc.vwalletweb.entities.DetalleReservas;
import pe.edu.upc.vwalletweb.entities.Transporte;

import java.util.List;

public interface IDetalleReservasService {
    public void insert(DetalleReservas detallereservas);

    public List<DetalleReservas> list();
    public DetalleReservas listarId(Integer idDetalleReserva);

    public void delete(int idDetalleReserva);
    List<String[]> totalViajesRealizadosPorTransporteID();
}
