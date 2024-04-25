package pe.edu.upc.vwalletweb.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "transporte")
public class Transporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transporte")
    private int idTransporte;
    @Column(name = "universidad_salida", nullable = false, length = 100)
    private String universidadSalida;
    @Column(name = "universidad_llegada", nullable = false, length = 100)
    private String universidadLlegada;
    @Column(name = "hora_salida", nullable = false)
    private LocalDate horaSalida;
    @Column(name = "hora_llegada", nullable = false)
    private LocalDate horaLlegada;
    @Column(name = "precio", nullable = false)
    private float precio;
    @ManyToOne
    @JoinColumn(name = "id_servicio")
    private Servicios servicios;

    public Transporte() {
    }

    public Transporte(int idTransporte, String universidadSalida, String universidadLlegada, LocalDate horaSalida, LocalDate horaLlegada, float precio, Servicios servicios) {
        this.idTransporte = idTransporte;
        this.universidadSalida = universidadSalida;
        this.universidadLlegada = universidadLlegada;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.precio = precio;
        this.servicios = servicios;
    }

    public int getIdTransporte() {
        return idTransporte;
    }

    public void setIdTransporte(int idTransporte) {
        this.idTransporte = idTransporte;
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

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Servicios getServicios() {
        return servicios;
    }

    public void setServicios(Servicios servicios) {
        this.servicios = servicios;
    }
}
