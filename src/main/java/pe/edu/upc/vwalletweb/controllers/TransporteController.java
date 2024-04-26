package pe.edu.upc.vwalletweb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.vwalletweb.dtos.TransporteDTO;
import pe.edu.upc.vwalletweb.entities.Transporte;
import pe.edu.upc.vwalletweb.serviceinterfaces.ITransporteService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/transporte")
public class TransporteController {
    @Autowired
    private ITransporteService tS;
    @PostMapping
    public void registrar(@RequestBody TransporteDTO transporteDTO) {
        ModelMapper r = new ModelMapper();
        Transporte transporte = r.map(transporteDTO, Transporte.class);
        tS.insert(transporte);
    }
    @PutMapping()
    public void modificar(@RequestBody TransporteDTO transportDTO){
        ModelMapper m = new ModelMapper();
        Transporte transport = m.map(transportDTO,Transporte.class);
        tS.insert(transport);
    }
    @GetMapping
    public List<TransporteDTO> list() {
        return tS.list().stream().map(y -> {
            ModelMapper l = new ModelMapper();
            return l.map(y, TransporteDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        tS.delete(id);
    }

}
