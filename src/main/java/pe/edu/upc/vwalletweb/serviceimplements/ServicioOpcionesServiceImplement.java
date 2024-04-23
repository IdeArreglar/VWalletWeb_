package pe.edu.upc.vwalletweb.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.vwalletweb.repositories.IServicioOpcionesRepository;
import pe.edu.upc.vwalletweb.serviceinterfaces.IServicioOpcionesService;

@Service
public class ServicioOpcionesServiceImplement implements IServicioOpcionesService {
    @Autowired
    private IServicioOpcionesRepository sR;
}
