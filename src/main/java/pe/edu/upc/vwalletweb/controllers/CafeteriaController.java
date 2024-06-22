package pe.edu.upc.vwalletweb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.vwalletweb.dtos.CafeteriaDTO;
import pe.edu.upc.vwalletweb.dtos.CantidadReservasXUsuarioDTO;
import pe.edu.upc.vwalletweb.dtos.PromedioPreciosDeMenuXCafeteriaDTO;
import pe.edu.upc.vwalletweb.dtos.TransporteDTO;
import pe.edu.upc.vwalletweb.entities.Cafeteria;
import pe.edu.upc.vwalletweb.serviceinterfaces.ICafeteriaService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cafeteria")
public class CafeteriaController {
    @Autowired
    private ICafeteriaService cS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void registrar(@RequestBody CafeteriaDTO cafeteriaDTO) {
        ModelMapper r = new ModelMapper();
        Cafeteria cafeteria = r.map(cafeteriaDTO, Cafeteria.class);
        cS.insert(cafeteria);
    }
    @PutMapping()
    @PreAuthorize("hasAuthority('ADMIN')")
    public void modificar(@RequestBody CafeteriaDTO cafeDTO){
        ModelMapper m = new ModelMapper();
        Cafeteria cafe = m.map(cafeDTO,Cafeteria.class);
        cS.insert(cafe);
    }
    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public CafeteriaDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        CafeteriaDTO dto = m.map(cS.listarId(id), CafeteriaDTO.class);
        return dto;
    }
    @GetMapping
    @PreAuthorize("hasAuthority('ESTUDIANTE') or hasAuthority('ADMIN')")
    public List<CafeteriaDTO> list() {
        return cS.list().stream().map(y -> {
            ModelMapper l = new ModelMapper();
            return l.map(y, CafeteriaDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") Integer id){
        cS.delete(id);
    }


    @GetMapping("/promediopreciosdemenuxcafeteria")
    public List<PromedioPreciosDeMenuXCafeteriaDTO> PromediosDePreciosDeMenuXCafeterias(){
        List<String[]> filalistatotalgasto = cS.PromedioPreciosDeMenuXCafeteria();
        List<PromedioPreciosDeMenuXCafeteriaDTO> dtoLista = new ArrayList<>();
        for(String[] columna:filalistatotalgasto){
            PromedioPreciosDeMenuXCafeteriaDTO dto = new PromedioPreciosDeMenuXCafeteriaDTO();
            dto.setSede_cafeteria(columna[0]);
            dto.setPrecio_promedio(Float.parseFloat(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
