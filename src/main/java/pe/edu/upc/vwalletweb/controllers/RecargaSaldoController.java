package pe.edu.upc.vwalletweb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.vwalletweb.dtos.FechaRecargaSaldoIntervaloDTO;
import pe.edu.upc.vwalletweb.dtos.RecargaSaldoDTO;
import pe.edu.upc.vwalletweb.dtos.ServiciosDTO;
import pe.edu.upc.vwalletweb.dtos.TotalRecargadoUsuarioDTO;
import pe.edu.upc.vwalletweb.entities.RecargaSaldo;
import pe.edu.upc.vwalletweb.entities.Servicios;
import pe.edu.upc.vwalletweb.serviceinterfaces.IRecargaSalgoService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/recargasaldo")
public class RecargaSaldoController {
    @Autowired
    private IRecargaSalgoService rsS;

    @PostMapping
    public void registrar(@RequestBody RecargaSaldoDTO recargasaldoDTO) {
        ModelMapper r = new ModelMapper();
        RecargaSaldo recargasaldo = r.map(recargasaldoDTO, RecargaSaldo.class);
        rsS.insert(recargasaldo );
    }
    @PutMapping()
    public void modificar(@RequestBody RecargaSaldoDTO recargasalDTO){
        ModelMapper m = new ModelMapper();
        RecargaSaldo recargasal = m.map(recargasalDTO,RecargaSaldo.class);
        rsS.insert(recargasal);
    }
    @GetMapping
    public List<RecargaSaldoDTO> list() {
        return rsS.list().stream().map(y -> {
            ModelMapper l = new ModelMapper();
            return l.map(y, RecargaSaldoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        rsS.delete(id);
    }

    @GetMapping("/TotalRecargadoUsuario")
    public List<TotalRecargadoUsuarioDTO> TotalRecargado(){
        List<String[]> filalistarecargatotal = rsS.TotalRecargadoUsuario();
        List<TotalRecargadoUsuarioDTO> dtoLista = new ArrayList<>();
        for(String[] columna:filalistarecargatotal){
            TotalRecargadoUsuarioDTO dto = new TotalRecargadoUsuarioDTO();
           dto.setIdUsuario(Integer.parseInt(columna[0]));
           dto.setTotal_recargado(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }


    @GetMapping("/FechaRecarga")
    public List<FechaRecargaSaldoIntervaloDTO> FechaRecarga(){
        List<String[]> filalistafecharecarga = rsS.TotalRecargadoUsuario();
        List<FechaRecargaSaldoIntervaloDTO> dtoLista = new ArrayList<>();
        for(String[] columna:filalistafecharecarga){
            FechaRecargaSaldoIntervaloDTO dto = new FechaRecargaSaldoIntervaloDTO();
         dto.setFechaRecarga(LocalDate.parse(columna[0]));
         dto.setIdRecargaSaldo(Integer.parseInt(columna[1]));
         dto.setMontoRecarga(Integer.parseInt(columna[2]));
         dto.setIdUsuario(Integer.parseInt(columna[3]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }




}
