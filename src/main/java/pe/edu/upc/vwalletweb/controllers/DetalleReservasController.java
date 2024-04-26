package pe.edu.upc.vwalletweb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.vwalletweb.dtos.DetalleReservasDTO;
import pe.edu.upc.vwalletweb.entities.DetalleReservas;
import pe.edu.upc.vwalletweb.serviceinterfaces.IDetalleReservasService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/detallereservas")
public class DetalleReservasController {
    @Autowired
    private IDetalleReservasService drS;

    @PostMapping
    public void registrar(@RequestBody DetalleReservasDTO dreservasDTO) {
        ModelMapper r = new ModelMapper();
        DetalleReservas detallereservas = r.map(dreservasDTO, DetalleReservas.class);
        drS.insert(detallereservas );
    }
    @PutMapping()
    public void modificar(@RequestBody DetalleReservasDTO dereservasDTO){
        ModelMapper m = new ModelMapper();
        DetalleReservas dereserva = m.map(dereservasDTO,DetalleReservas.class);
        drS.insert(dereserva);
    }
    @GetMapping
    public List<DetalleReservasDTO> list() {
        return drS.list().stream().map(y -> {
            ModelMapper l = new ModelMapper();
            return l.map(y, DetalleReservasDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        drS.delete(id);
    }
}