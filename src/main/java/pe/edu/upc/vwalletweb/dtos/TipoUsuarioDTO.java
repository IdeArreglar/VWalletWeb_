package pe.edu.upc.vwalletweb.dtos;


import pe.edu.upc.vwalletweb.entities.Usuario;

public class TipoUsuarioDTO {
    private int idTipoUsuario;

    private String tipoTipoUsuario;

    private Usuario usuario;

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getTipoTipoUsuario() {
        return tipoTipoUsuario;
    }

    public void setTipoTipoUsuario(String tipoTipoUsuario) {
        this.tipoTipoUsuario = tipoTipoUsuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
