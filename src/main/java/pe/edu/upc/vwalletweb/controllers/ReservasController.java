package pe.edu.upc.vwalletweb.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.vwalletweb.serviceinterfaces.IReservaService;

@RestController
@RequestMapping("/reservas")
@RequiredArgsConstructor
public class ReservasController {
    private IReservaService rS;
}
