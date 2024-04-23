package pe.edu.upc.vwalletweb.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.vwalletweb.repositories.ITipoUsuarioRepository;
import pe.edu.upc.vwalletweb.serviceinterfaces.ITipoUsuarioService;

@Service
public class TipoUsuarioServiceImplement implements ITipoUsuarioService {
    @Autowired
    private ITipoUsuarioRepository tR;
}
