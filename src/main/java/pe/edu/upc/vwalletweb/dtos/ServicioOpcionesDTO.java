package pe.edu.upc.vwalletweb.dtos;


import pe.edu.upc.vwalletweb.entities.Servicios;

import java.time.LocalDate;

public class ServicioOpcionesDTO {
    private int idServicioOpciones;

    private String nombreServicioOpciones;

    private String descripcionServicioOpciones;

    private LocalDate fechaServicioOpciones;

    private float montoServicioOpciones;

    private Servicios servicios;

    public int getIdServicioOpciones() {
        return idServicioOpciones;
    }

    public void setIdServicioOpciones(int idServicioOpciones) {
        this.idServicioOpciones = idServicioOpciones;
    }

    public String getNombreServicioOpciones() {
        return nombreServicioOpciones;
    }

    public void setNombreServicioOpciones(String nombreServicioOpciones) {
        this.nombreServicioOpciones = nombreServicioOpciones;
    }

    public String getDescripcionServicioOpciones() {
        return descripcionServicioOpciones;
    }

    public void setDescripcionServicioOpciones(String descripcionServicioOpciones) {
        this.descripcionServicioOpciones = descripcionServicioOpciones;
    }

    public LocalDate getFechaServicioOpciones() {
        return fechaServicioOpciones;
    }

    public void setFechaServicioOpciones(LocalDate fechaServicioOpciones) {
        this.fechaServicioOpciones = fechaServicioOpciones;
    }

    public float getMontoServicioOpciones() {
        return montoServicioOpciones;
    }

    public void setMontoServicioOpciones(float montoServicioOpciones) {
        this.montoServicioOpciones = montoServicioOpciones;
    }

    public Servicios getServicios() {
        return servicios;
    }

    public void setServicios(Servicios servicios) {
        this.servicios = servicios;
    }
}
