package pe.edu.upc.vwalletweb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.vwalletweb.dtos.ServiciosDTO;
import pe.edu.upc.vwalletweb.entities.Servicios;
import pe.edu.upc.vwalletweb.serviceinterfaces.IServiciosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/servicios")
public class ServiciosController {
    @Autowired
    private IServiciosService sS;

    @PostMapping
    public void registrar(@RequestBody ServiciosDTO dtoM) {
        ModelMapper d = new ModelMapper();
        Servicios movie = d.map(dtoM, Servicios.class);
        sS.insert(movie);
    }
    @PutMapping()
    public void modificar(@RequestBody ServiciosDTO dto){
        ModelMapper m=new ModelMapper();
        Servicios mo=m.map(dto,Servicios.class);
        sS.insert(mo);
    }
    @GetMapping
    public List<ServiciosDTO> list() {
        return sS.list().stream().map(y -> {
            ModelMapper c = new ModelMapper();
            return c.map(y, ServiciosDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/buscarestado")
    @PreAuthorize("hasAuthority('ESTUDIANTE')")
    public List<ServiciosDTO> buscar(@RequestParam String est) {
        return sS.buscarEstado(est).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ServiciosDTO.class);
        }).collect(Collectors.toList());
    }


}
