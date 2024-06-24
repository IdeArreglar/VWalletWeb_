package pe.edu.upc.vwalletweb.serviceinterfaces;

import pe.edu.upc.vwalletweb.entities.RecargaSaldo;
import pe.edu.upc.vwalletweb.entities.Transporte;

import java.time.LocalDate;
import java.util.List;

public interface IRecargaSalgoService {
    void insert(RecargaSaldo recargasaldo);

    List<RecargaSaldo> list();
    public RecargaSaldo listarId(Integer idRecargaSaldo);

    void delete(int idRecargaSaldo);

    List<String[]> TotalRecargadoUsuario();

    List<String[]> FechaRecargaSaldoIntervalo(LocalDate fInicio, LocalDate fFin);

    List<String[]> CantMenuLentejas(String platoprincipal);

    List<String[]> ViajeElegir(String universidadsalida, String universidadllegada);

}
