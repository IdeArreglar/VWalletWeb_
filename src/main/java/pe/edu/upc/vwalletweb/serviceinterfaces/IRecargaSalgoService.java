package pe.edu.upc.vwalletweb.serviceinterfaces;

import pe.edu.upc.vwalletweb.entities.RecargaSaldo;

import java.util.List;

public interface IRecargaSalgoService {
    public void insert(RecargaSaldo recargasaldo);

    public List<RecargaSaldo> list();

    public void delete(int idRecargaSaldo);

    public List<String[]> TotalRecargadoUsuario();

    public List<String[]>FechaRecargaSaldoIntervalo();

}
