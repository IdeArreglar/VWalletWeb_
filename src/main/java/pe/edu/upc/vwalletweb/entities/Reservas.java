package pe.edu.upc.vwalletweb.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "reservas")
public class Reservas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reserva")
    private int idReservas;
    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;
    @Column(name = "total")
    private float total;
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    public Reservas() {
    }

    public Reservas(int idReservas, LocalDate fecha, float total, Usuario usuario) {
        this.idReservas = idReservas;
        this.fecha = fecha;
        this.total = total;
        this.usuario = usuario;
    }

    public int getIdReservas() {
        return idReservas;
    }

    public void setIdReservas(int idReservas) {
        this.idReservas = idReservas;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}
