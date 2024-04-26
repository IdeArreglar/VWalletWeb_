package pe.edu.upc.vwalletweb.dtos;

public class PlatosMasPedidosDTO {
    private String plato;
    private int cantidad;

    public PlatosMasPedidosDTO() {
    }

    public PlatosMasPedidosDTO(String plato, int cantidad) {
        this.plato = plato;
        this.cantidad = cantidad;
    }

    public String getPlato() {
        return plato;
    }

    public void setPlato(String plato) {
        this.plato = plato;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
