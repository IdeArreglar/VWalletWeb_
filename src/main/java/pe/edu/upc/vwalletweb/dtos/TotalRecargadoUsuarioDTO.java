package pe.edu.upc.vwalletweb.dtos;

public class TotalRecargadoUsuarioDTO {
    private String name_usuario;
    private float total_recargado;

    public String getName_usuario() {
        return name_usuario;
    }

    public void setName_usuario(String name_usuario) {
        this.name_usuario = name_usuario;
    }

    public float getTotal_recargado() {
        return total_recargado;
    }

    public void setTotal_recargado(float total_recargado) {
        this.total_recargado = total_recargado;
    }
}
