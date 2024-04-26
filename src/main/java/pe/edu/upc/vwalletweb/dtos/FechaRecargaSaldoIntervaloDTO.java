package pe.edu.upc.vwalletweb.dtos;

import java.time.LocalDate;

public class FechaRecargaSaldoIntervaloDTO {
    private LocalDate fechaRecarga;
    private int idRecargaSaldo;
    private int montoRecarga;
    private int idUsuario;

    public LocalDate getFechaRecarga() {
        return fechaRecarga;
    }

    public void setFechaRecarga(LocalDate fechaRecarga) {
        this.fechaRecarga = fechaRecarga;
    }

    public int getIdRecargaSaldo() {
        return idRecargaSaldo;
    }

    public void setIdRecargaSaldo(int idRecargaSaldo) {
        this.idRecargaSaldo = idRecargaSaldo;
    }

    public int getMontoRecarga() {
        return montoRecarga;
    }

    public void setMontoRecarga(int montoRecarga) {
        this.montoRecarga = montoRecarga;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}
