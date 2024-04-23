package pe.edu.upc.vwalletweb.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "Gastos")

public class Gastos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGastos;
    @Column(name = "montoGastos", nullable = false)
    private float montoGastos;
    @Column(name = "fechaGastos", nullable = false)
    private LocalDate fechaGastos;
    @ManyToOne
    @JoinColumn(name = "servicioID")
    private Servicios servicios;

    public Gastos() {
    }

    public Gastos(int idGastos, float montoGastos, LocalDate fechaGastos, Servicios servicios) {
        this.idGastos = idGastos;
        this.montoGastos = montoGastos;
        this.fechaGastos = fechaGastos;
        this.servicios = servicios;
    }

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
