package pe.edu.upc.vwalletweb.dtos;


import pe.edu.upc.vwalletweb.entities.Servicios;

import java.time.LocalDate;

public class GastosDTO {
    private int idGastos;

    private float montoGastos;

    private LocalDate fechaGastos;

    private Servicios servicios;

    public int getIdGastos() {
        return idGastos;
    }

    public void setIdGastos(int idGastos) {
        this.idGastos = idGastos;
    }

    public float getMontoGastos() {
        return montoGastos;
    }

    public void setMontoGastos(float montoGastos) {
        this.montoGastos = montoGastos;
    }

    public LocalDate getFechaGastos() {
        return fechaGastos;
    }

    public void setFechaGastos(LocalDate fechaGastos) {
        this.fechaGastos = fechaGastos;
    }

    public Servicios getServicios() {
        return servicios;
    }

    public void setServicios(Servicios servicios) {
        this.servicios = servicios;
    }
}
