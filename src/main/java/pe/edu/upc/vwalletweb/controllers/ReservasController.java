package pe.edu.upc.vwalletweb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.vwalletweb.dtos.ReservasDTO;
import pe.edu.upc.vwalletweb.entities.Reservas;
import pe.edu.upc.vwalletweb.serviceinterfaces.IReservasService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/reservas")
public class ReservasController {
    @Autowired
    private IReservasService rS;

    @PostMapping
    public void registrar(@RequestBody ReservasDTO reservasDTO) {
        ModelMapper r = new ModelMapper();
        Reservas reservas = r.map(reservasDTO, Reservas.class);
        rS.insert(reservas);
    }
    @PutMapping()
    public void modificar(@RequestBody ReservasDTO reserDTO){
        ModelMapper m = new ModelMapper();
        Reservas reser = m.map(reserDTO,Reservas.class);
        rS.insert(reser);
    }
    @GetMapping
    public List<ReservasDTO> list() {
        return rS.list().stream().map(y -> {
            ModelMapper l = new ModelMapper();
            return l.map(y, ReservasDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        rS.delete(id);
    }
}
