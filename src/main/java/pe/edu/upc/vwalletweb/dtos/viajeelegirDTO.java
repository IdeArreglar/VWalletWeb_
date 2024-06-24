package pe.edu.upc.vwalletweb.dtos;

public class viajeelegirDTO {

    private String universidad_salida;
    private String universidad_llegada;
    private int num_viajes;

    public String getUniversidad_salida() {
        return universidad_salida;
    }

    public void setUniversidad_salida(String universidad_salida) {
        this.universidad_salida = universidad_salida;
    }

    public String getUniversidad_llegada() {
        return universidad_llegada;
    }

    public void setUniversidad_llegada(String universidad_llegada) {
        this.universidad_llegada = universidad_llegada;
    }

    public int getNum_viajes() {
        return num_viajes;
    }

    public void setNum_viajes(int num_viajes) {
        this.num_viajes = num_viajes;
    }
}
