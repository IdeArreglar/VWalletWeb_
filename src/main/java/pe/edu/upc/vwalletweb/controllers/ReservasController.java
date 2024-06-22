package pe.edu.upc.vwalletweb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.vwalletweb.dtos.CantidadReservasXUsuarioDTO;
import pe.edu.upc.vwalletweb.dtos.ReservasDTO;
import pe.edu.upc.vwalletweb.dtos.TotalGastoxUsuarioDTO;
import pe.edu.upc.vwalletweb.dtos.TransporteDTO;
import pe.edu.upc.vwalletweb.entities.Reservas;
import pe.edu.upc.vwalletweb.serviceinterfaces.IReservasService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/reservas")
public class ReservasController {
    @Autowired
    private IReservasService rS;

    @PostMapping

    public void registrar(@RequestBody ReservasDTO reservasDTO) {
        ModelMapper r = new ModelMapper();
        Reservas reservas = r.map(reservasDTO, Reservas.class);
        rS.insert(reservas);
    }
    @PutMapping()

    public void modificar(@RequestBody ReservasDTO reserDTO){
        ModelMapper m = new ModelMapper();
        Reservas reser = m.map(reserDTO,Reservas.class);
        rS.insert(reser);
    }
    @GetMapping("/{id}")

    public ReservasDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        ReservasDTO dto = m.map(rS.listarId(id), ReservasDTO.class);
        return dto;
    }


    @GetMapping

    public List<ReservasDTO> list() {
        return rS.list().stream().map(y -> {
            ModelMapper l = new ModelMapper();
            return l.map(y, ReservasDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")

    public void eliminar(@PathVariable("id") Integer id){
        rS.delete(id);
    }


    @GetMapping("/cantidadreservasxusuario")
    public List<CantidadReservasXUsuarioDTO> CantidadDeReservasXUsuarios(){
        List<String[]> filalistatotalgasto = rS.CantidadReservasXUsuario();
        List<CantidadReservasXUsuarioDTO> dtoLista = new ArrayList<>();
        for(String[] columna:filalistatotalgasto){
            CantidadReservasXUsuarioDTO dto = new CantidadReservasXUsuarioDTO();
            dto.setName_usuario(columna[0]);
            dto.setTotal_reservas(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
