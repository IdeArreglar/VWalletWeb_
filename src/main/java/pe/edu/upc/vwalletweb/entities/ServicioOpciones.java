package pe.edu.upc.vwalletweb.entities;


import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "ServicioOpciones")
public class ServicioOpciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idServicioOpciones;
    @Column(name = "nombreServicioOpciones", nullable = false, length = 200)
    private String nombreServicioOpciones;
    @Column(name = "descripcionServicioOpciones", nullable = false, length = 200)
    private String descripcionServicioOpciones;
    @Column(name = "fechaServicioOpciones", nullable = false)
    private LocalDate fechaServicioOpciones;
    @Column(name = "montoServicioOpciones", nullable = false)
    private float montoServicioOpciones;
    @ManyToOne
    @JoinColumn(name = "serviciosID")
    private Servicios servicios;

    public ServicioOpciones() {
    }

    public ServicioOpciones(int idServicioOpciones, String nombreServicioOpciones, String descripcionServicioOpciones, LocalDate fechaServicioOpciones, float montoServicioOpciones, Servicios servicios) {
        this.idServicioOpciones = idServicioOpciones;
        this.nombreServicioOpciones = nombreServicioOpciones;
        this.descripcionServicioOpciones = descripcionServicioOpciones;
        this.fechaServicioOpciones = fechaServicioOpciones;
        this.montoServicioOpciones = montoServicioOpciones;
        this.servicios = servicios;
    }

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
