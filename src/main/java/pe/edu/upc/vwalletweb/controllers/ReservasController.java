package pe.edu.upc.vwalletweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.vwalletweb.serviceinterfaces.IReservasService;

@RestController
@RequestMapping("/reservas")
public class ReservasController {
    @Autowired
    private IReservasService rS;
}
