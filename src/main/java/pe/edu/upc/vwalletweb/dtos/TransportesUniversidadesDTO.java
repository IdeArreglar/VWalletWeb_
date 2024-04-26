package pe.edu.upc.vwalletweb.dtos;

public class TransportesUniversidadesDTO {
    private int transporteId;
    private String universidadSalida;
    private String universidadLlegada;

    public TransportesUniversidadesDTO() {
    }

    public TransportesUniversidadesDTO(int transporteId, String universidadSalida, String universidadLlegada) {
        this.transporteId = transporteId;
        this.universidadSalida = universidadSalida;
        this.universidadLlegada = universidadLlegada;
    }

    public int getTransporteId() {
        return transporteId;
    }

    public void setTransporteId(int transporteId) {
        this.transporteId = transporteId;
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
}
