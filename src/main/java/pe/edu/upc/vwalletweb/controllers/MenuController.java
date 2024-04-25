package pe.edu.upc.vwalletweb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.vwalletweb.dtos.MenuDTO;
import pe.edu.upc.vwalletweb.entities.Menu;
import pe.edu.upc.vwalletweb.serviceinterfaces.IMenuService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private IMenuService mS;

    @PostMapping
    public void registrar(@RequestBody MenuDTO menuDTO) {
        ModelMapper r = new ModelMapper();
        Menu menu = r.map(menuDTO, Menu.class);
        mS.insert(menu);
    }
    @PutMapping()
    public void modificar(@RequestBody MenuDTO menuDTO){
        ModelMapper m = new ModelMapper();
        Menu menu = m.map(menuDTO,Menu.class);
        mS.insert(menu);
    }
    @GetMapping
    public List<MenuDTO> list() {
        return mS.list().stream().map(y -> {
            ModelMapper l = new ModelMapper();
            return l.map(y, MenuDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        mS.delete(id);
    }
}
