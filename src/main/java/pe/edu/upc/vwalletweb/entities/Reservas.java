package pe.edu.upc.vwalletweb.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "reservas")
public class Reservas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReservas;
    @Column(name = "fechaReserva", nullable = false)
    private LocalDate fechaReserva;
    @Column(name = "totalReserva", nullable = false)
    private float totalReserva;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Reservas() {
    }

    public Reservas(int idReservas, LocalDate fechaReserva, float totalReserva, Usuario usuario) {
        this.idReservas = idReservas;
        this.fechaReserva = fechaReserva;
        this.totalReserva = totalReserva;
        this.usuario = usuario;
    }

    public int getIdReservas() {
        return idReservas;
    }

    public void setIdReservas(int idReservas) {
        this.idReservas = idReservas;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public float getTotalReserva() {
        return totalReserva;
    }

    public void setTotalReserva(float totalReserva) {
        this.totalReserva = totalReserva;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
