package pe.edu.upc.vwalletweb.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "transporte")
public class Transporte {
    @Id
    @Column(name="servicios_id")
    private int idServicios;

    @Column(name = "universidadSalida",nullable = false,length = 100)
    private String universidadSalida;
    @Column(name = "universidadLlegada",nullable = false,length = 100)
    private String universidadLlegada;
    @Column(name = "horaSalida",nullable = false)
    private LocalDate horaSalida;
    @Column(name = "horaLlegada",nullable = false)
    private LocalDate horaLlegada;
    @Column(name = "precioTransporte",nullable = false)
    private float precioTransporte;
    @OneToOne
    @MapsId
    private Servicios servicios;

    public Transporte() {
    }

    public Transporte(int idServicios, String universidadSalida, String universidadLlegada, LocalDate horaSalida, LocalDate horaLlegada, float precioTransporte, Servicios servicios) {
        this.idServicios = idServicios;
        this.universidadSalida = universidadSalida;
        this.universidadLlegada = universidadLlegada;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.precioTransporte = precioTransporte;
        this.servicios = servicios;
    }

    public int getIdServicios() {
        return idServicios;
    }

    public void setIdServicios(int idServicios) {
        this.idServicios = idServicios;
    }

    public String getUniversidadSalida() {
        return universidadSalida;
    }

    public void setUniversidadSalida(String universidadSalida) {
        this.universidadSalida = universidadSalida;
    }

    public String getUniversidadLlegada() {
        return universidadLlegada;
    }

    public void setUniversidadLlegada(String universidadLlegada) {
        this.universidadLlegada = universidadLlegada;
    }

    public LocalDate getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalDate horaSalida) {
        this.horaSalida = horaSalida;
    }

    public LocalDate getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(LocalDate horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public float getPrecioTransporte() {
        return precioTransporte;
    }

    public void setPrecioTransporte(float precioTransporte) {
        this.precioTransporte = precioTransporte;
    }

    public Servicios getServicios() {
        return servicios;
    }

    public void setServicios(Servicios servicios) {
        this.servicios = servicios;
    }
}
