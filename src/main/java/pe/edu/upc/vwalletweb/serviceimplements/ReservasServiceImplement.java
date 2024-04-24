package pe.edu.upc.vwalletweb.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.vwalletweb.repositories.IReservasRepository;
import pe.edu.upc.vwalletweb.serviceinterfaces.IReservasService;

@Service
public class ReservasServiceImplement implements IReservasService {
    @Autowired
    private IReservasRepository rR;
}
