package pe.edu.upc.vwalletweb.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.vwalletweb.repositories.IReservaRepository;
import pe.edu.upc.vwalletweb.serviceinterfaces.IReservaService;

@Service
public class ReservaServiceImplement implements IReservaService {
    @Autowired
    private IReservaRepository rR;
}
