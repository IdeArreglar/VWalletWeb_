package pe.edu.upc.vwalletweb.controllers;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.vwalletweb.dtos.TypeUserDTO;
import pe.edu.upc.vwalletweb.entities.TypeUser;
import pe.edu.upc.vwalletweb.serviceinterfaces.ITypeUserService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/typeUsers")
@RequiredArgsConstructor
public class TypeUserController {
    private ITypeUserService tS;

    @PostMapping
    public void registrar(@RequestBody TypeUserDTO dto) {
        ModelMapper m = new ModelMapper();
        TypeUser r = m.map(dto, TypeUser.class);
        tS.insert(r);
    }

    @PutMapping
    public void modificar(@RequestBody TypeUserDTO dto) {
        ModelMapper m = new ModelMapper();
        TypeUser r = m.map(dto, TypeUser.class);
        tS.insert(r);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        tS.delete(id);
    }

    @GetMapping("/{id}")
    public TypeUserDTO listarId(@PathVariable("id") Long id) {
        ModelMapper m = new ModelMapper();
        TypeUserDTO dto = m.map(tS.listarId(id), TypeUserDTO.class);
        return dto;
    }

    @GetMapping
    public List<TypeUserDTO> listar() {
        return tS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, TypeUserDTO.class);
        }).collect(Collectors.toList());
    }
}
