package pe.edu.upc.vwalletweb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.vwalletweb.dtos.BibliotecaDTO;
import pe.edu.upc.vwalletweb.dtos.LibroDisponiblePorSedeDTO;
import pe.edu.upc.vwalletweb.dtos.UsuarioDTO;
import pe.edu.upc.vwalletweb.entities.Biblioteca;
import pe.edu.upc.vwalletweb.serviceinterfaces.IBibliotecaService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/biblioteca")
public class BibliotecaController {
    @Autowired
    private IBibliotecaService bS;

    @PostMapping
    public void registrar(@RequestBody BibliotecaDTO bibliotecaDTO) {
        ModelMapper r = new ModelMapper();
        Biblioteca biblioteca = r.map(bibliotecaDTO, Biblioteca.class);
        bS.insert(biblioteca);
    }
    @GetMapping("/{id}")
    public BibliotecaDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        BibliotecaDTO dto = m.map(bS.listarId(id), BibliotecaDTO.class);
        return dto;
    }
    @PutMapping()
    public void modificar(@RequestBody BibliotecaDTO bibliotecDTO) {
        ModelMapper m = new ModelMapper();
        Biblioteca bibliotec = m.map(bibliotecDTO, Biblioteca.class);
        bS.insert(bibliotec);
    }

    @GetMapping
    public List<BibliotecaDTO> list() {
        return bS.list().stream().map(y -> {
            ModelMapper l = new ModelMapper();
            return l.map(y, BibliotecaDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        bS.delete(id);
    }
    
    @GetMapping("/librodisponibleporsede")
    public List<LibroDisponiblePorSedeDTO> librodisponibleporsede() {
        List<String[]> librosdispos = bS.LibroDisponiblePorSede();
        List<LibroDisponiblePorSedeDTO> dtoLista = new ArrayList<>();
        for (String[] columna : librosdispos) {
            LibroDisponiblePorSedeDTO dto = new LibroDisponiblePorSedeDTO();
            dto.setSedeBiblioteca(columna[0]);
            dto.setCantidad_libros(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
