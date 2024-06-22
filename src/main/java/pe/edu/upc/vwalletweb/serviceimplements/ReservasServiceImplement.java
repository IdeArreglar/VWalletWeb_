package pe.edu.upc.vwalletweb.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.vwalletweb.entities.Reservas;
import pe.edu.upc.vwalletweb.entities.Transporte;
import pe.edu.upc.vwalletweb.repositories.IReservasRepository;
import pe.edu.upc.vwalletweb.serviceinterfaces.IReservasService;

import java.util.List;

@Service
public class ReservasServiceImplement implements IReservasService {
    @Autowired
    private IReservasRepository rR;

    @Override
    public void insert(Reservas reservas) {
        rR.save(reservas);
    }

    @Override
    public Reservas listarId(Integer idReservas) {
        return rR.findById(idReservas).orElse(new Reservas());
    }

    @Override
    public List<Reservas> list() {
        return rR.findAll();
    }

    @Override
    public void delete(int idReservas) {
        rR.deleteById(idReservas);
    }

    @Override
    public List<String[]> CantidadReservasXUsuario() {
        return rR.CantidadReservasXUsuario();
    }
}
