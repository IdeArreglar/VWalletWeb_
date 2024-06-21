package pe.edu.upc.vwalletweb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.vwalletweb.dtos.*;
import pe.edu.upc.vwalletweb.entities.Menu;
import pe.edu.upc.vwalletweb.serviceinterfaces.IMenuService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private IMenuService mS;

    @PostMapping
    @PreAuthorize("hasAuthority('ESTUDIANTE') or hasAuthority('ADMIN')")
    public void registrar(@RequestBody MenuDTO menuDTO) {
        ModelMapper r = new ModelMapper();
        Menu menu = r.map(menuDTO, Menu.class);
        mS.insert(menu);
    }



    @PutMapping()
    @PreAuthorize("hasAuthority('ESTUDIANTE') or hasAuthority('ADMIN')")
    public void modificar(@RequestBody MenuDTO menuDTO) {
        ModelMapper m = new ModelMapper();
        Menu menu = m.map(menuDTO, Menu.class);
        mS.insert(menu);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public MenuDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        MenuDTO dto = m.map(mS.listarId(id), MenuDTO.class);
        return dto;
    }


    @GetMapping
    @PreAuthorize("hasAuthority('ESTUDIANTE') or hasAuthority('ADMIN')")
    public List<MenuDTO> list() {
        return mS.list().stream().map(y -> {
            ModelMapper l = new ModelMapper();
            return l.map(y, MenuDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ESTUDIANTE') or hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") Integer id) {
        mS.delete(id);
    }

    @GetMapping("/cantidaddemenusporsede")
    public List<CantidaddeMenusporSedeDTO> CantidaddeMenusporSede() {
        List<String[]> menusedefilaLista = mS.CantidaddeMenusporSede();
        List<CantidaddeMenusporSedeDTO> dtoLista = new ArrayList<>();
        for (String[] columna : menusedefilaLista) {
            CantidaddeMenusporSedeDTO dto = new CantidaddeMenusporSedeDTO();
          dto.setSede_cafeteria(columna[0]);
          dto.setCantidad_menus(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }

    @GetMapping("/menucaros")

    public List<MenusCarosDTO> menusCaros() {
        List<String[]> menusDeFilaLista = mS.menusCaros();
        List<MenusCarosDTO> dtoLista = new ArrayList<>();
        for (String[] columna : menusDeFilaLista) {
            MenusCarosDTO dto = new MenusCarosDTO();
            dto.setMenu(columna[0]);
            dto.setTotal_gasto(Float.parseFloat(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }

    @GetMapping("/platomaspedidos")

    public List<PlatosMasPedidosDTO> platosMasPedidos() {
        List<String[]> menusDeFilaLista = mS.platosMasPedidos();
        List<PlatosMasPedidosDTO> dtoLista = new ArrayList<>();
        for (String[] columna : menusDeFilaLista) {
            PlatosMasPedidosDTO dto = new PlatosMasPedidosDTO();
            dto.setPlato_mas_pedido(columna[0]);
            dto.setCantidad(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }

    @GetMapping("/economicos")

    public List<MenusEconomicosDTO> menusEconomicos() {
        List<String[]> menusDeFilaLista = mS.menusEconomicos();
        List<MenusEconomicosDTO> dtoLista = new ArrayList<>();
        for(String[] columna : menusDeFilaLista){
            MenusEconomicosDTO dto = new MenusEconomicosDTO();
            dto.setPlatoPrincipal(columna[0]);
            dto.setPrecioMenu(Float.parseFloat(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
