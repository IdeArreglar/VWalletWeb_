package pe.edu.upc.vwalletweb.dtos;

public class CantidadReservasXUsuarioDTO {

    private String name_usuario;
    private int total_reservas;

    public String getName_usuario() {
        return name_usuario;
    }

    public void setName_usuario(String name_usuario) {
        this.name_usuario = name_usuario;
    }

    public int getTotal_reservas() {
        return total_reservas;
    }

    public void setTotal_reservas(int total_reservas) {
        this.total_reservas = total_reservas;
    }
}
