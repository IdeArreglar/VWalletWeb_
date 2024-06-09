package pe.edu.upc.vwalletweb.dtos;

import java.time.LocalDateTime;

public class TransporteDTO {
    private int idTransporte;

    private String universidadSalida;

    private String universidadLlegada;

    private int horaSalida;

    private int horaLlegada;

    private float precioTransporte;

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

    public int getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(int horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public float getPrecioTransporte() {
        return precioTransporte;
    }

    public void setPrecioTransporte(float precioTransporte) {
        this.precioTransporte = precioTransporte;
    }
}
