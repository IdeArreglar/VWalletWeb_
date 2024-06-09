package pe.edu.upc.vwalletweb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import pe.edu.upc.vwalletweb.dtos.BibliotecaDTO;
import pe.edu.upc.vwalletweb.dtos.CafeteriaDTO;
import pe.edu.upc.vwalletweb.entities.Cafeteria;
import pe.edu.upc.vwalletweb.serviceinterfaces.ICafeteriaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cafeteria")
public class CafeteriaController {
    @Autowired
    private ICafeteriaService cS;

    @PostMapping

    public void registrar(@RequestBody CafeteriaDTO cafeteriaDTO) {
        ModelMapper r = new ModelMapper();
        Cafeteria cafeteria = r.map(cafeteriaDTO, Cafeteria.class);
        cS.insert(cafeteria);
    }
    @PutMapping()

    public void modificar(@RequestBody CafeteriaDTO cafeDTO){
        ModelMapper m = new ModelMapper();
        Cafeteria cafe = m.map(cafeDTO,Cafeteria.class);
        cS.insert(cafe);
    }

    @GetMapping("/{id}")
    public CafeteriaDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        CafeteriaDTO dto = m.map(cS.listarId(id), CafeteriaDTO.class);
        return dto;
    }
    @GetMapping

    public List<CafeteriaDTO> list() {
        return cS.list().stream().map(y -> {
            ModelMapper l = new ModelMapper();
            return l.map(y, CafeteriaDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")

    public void eliminar(@PathVariable("id") Integer id){
        cS.delete(id);
    }
}
