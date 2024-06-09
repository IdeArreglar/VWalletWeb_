package pe.edu.upc.vwalletweb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.vwalletweb.dtos.CafeteriaDTO;
import pe.edu.upc.vwalletweb.dtos.LibroDTO;
import pe.edu.upc.vwalletweb.entities.Libro;
import pe.edu.upc.vwalletweb.serviceinterfaces.ILibroService;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/libro")
public class LibroController {
    @Autowired
    private ILibroService lS;

    @PostMapping
    public void registrar(@RequestBody LibroDTO libroDTO) {
        ModelMapper r = new ModelMapper();
        Libro libro = r.map(libroDTO, Libro.class);
        lS.insert(libro);
    }


    @PutMapping()
    public void modificar(@RequestBody LibroDTO liDTO){
        ModelMapper m = new ModelMapper();
        Libro libro = m.map(liDTO,Libro.class);
        lS.insert(libro);
    }

    @GetMapping("/{id}")
    public LibroDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        LibroDTO dto = m.map(lS.listarId(id), LibroDTO.class);
        return dto;
    }
    @GetMapping
    public List<LibroDTO> list() {
        return lS.list().stream().map(y -> {
            ModelMapper l = new ModelMapper();
            return l.map(y, LibroDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        lS.delete(id);
    }

}
