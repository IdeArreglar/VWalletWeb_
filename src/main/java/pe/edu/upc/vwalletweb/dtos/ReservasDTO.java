package pe.edu.upc.vwalletweb.dtos;



import pe.edu.upc.vwalletweb.entities.Usuario;

import java.time.LocalDate;

public class ReservasDTO {
    private int idReservas;

    private LocalDate fechaReserva;

    private float totalReserva;
    private Usuario usuario;

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
