package pe.edu.upc.vwalletweb.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.vwalletweb.repositories.IGastosRepository;
import pe.edu.upc.vwalletweb.serviceinterfaces.IGastosService;

@Service
public class GastosServiceImplement implements IGastosService {
    @Autowired
    private IGastosRepository gR;
}
