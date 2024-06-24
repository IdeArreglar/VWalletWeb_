package pe.edu.upc.vwalletweb.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.vwalletweb.entities.RecargaSaldo;
import pe.edu.upc.vwalletweb.entities.Transporte;
import pe.edu.upc.vwalletweb.repositories.IRecargaSaldoRepository;
import pe.edu.upc.vwalletweb.serviceinterfaces.IRecargaSalgoService;

import java.time.LocalDate;
import java.util.List;

@Service
public class RecargaSaldoServiceImplement implements IRecargaSalgoService {
    @Autowired
    private IRecargaSaldoRepository rsR;

    @Override
    public void insert(RecargaSaldo recargasaldo) {
        rsR.save(recargasaldo);
    }

    @Override
    public List<RecargaSaldo> list() {
        return rsR.findAll();
    }

    @Override
    public RecargaSaldo listarId(Integer idRecargaSaldo) {
        return rsR.findById(idRecargaSaldo).orElse(new RecargaSaldo());
    }

    @Override
    public void delete(int idRecargaSaldo) {
        rsR.deleteById(idRecargaSaldo);
    }

    @Override
    public List<String[]> TotalRecargadoUsuario() {
        return rsR.TotalRecargadoUsuario();
    }

    @Override
    public List<String[]> FechaRecargaSaldoIntervalo(LocalDate fInicio, LocalDate fFin) {

        return rsR.FechaRecargaSaldoIntervalo(fInicio, fFin);
    }

   @Override
   public List<String[]> CantMenuLentejas(String platoprincipal) {
       return rsR.CantMenuLentejas(platoprincipal);
   }

    @Override
    public List<String[]> ViajeElegir(String universidadsalida, String universidadllegada) {
        return rsR.ViajeElegir(universidadsalida,universidadllegada);
    }


}
