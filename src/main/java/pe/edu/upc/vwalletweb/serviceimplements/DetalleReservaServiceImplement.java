package pe.edu.upc.vwalletweb.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.vwalletweb.entities.DetalleReservas;
import pe.edu.upc.vwalletweb.entities.Libro;
import pe.edu.upc.vwalletweb.repositories.IDetalleReservasRepository;
import pe.edu.upc.vwalletweb.serviceinterfaces.IDetalleReservasService;

import java.util.List;

@Service
public class DetalleReservaServiceImplement implements IDetalleReservasService {
    @Autowired
    private IDetalleReservasRepository drR;
    @Override
    public void insert(DetalleReservas detallereservas) {
        drR.save(detallereservas);
    }

    @Override
    public List<DetalleReservas> list() {
        return drR.findAll();
    }

    @Override
    public DetalleReservas listarId(Integer idDetalleReserva) {
        return drR.findById(idDetalleReserva).orElse(new DetalleReservas());
    }

    @Override
    public void delete(int idDetalleReserva) {
        drR.deleteById(idDetalleReserva);
    }

    @Override
    public List<String[]> totalViajesRealizadosPorTransporteID() {
        return drR.totalViajesRealizadosPorTransporteID();
    }

}
