package pe.edu.upc.vwalletweb.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "TipoUsuario")
public class TipoUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoUsuario;
    @Column(name = "tipoTipoUsuario", nullable = false, length = 200)
    private String tipoTipoUsuario;
    @ManyToOne
    @JoinColumn(name = "usuarioID")
    private Usuario usuario;

    public TipoUsuario() {
    }

    public TipoUsuario(int idTipoUsuario, String tipoTipoUsuario, Usuario usuario) {
        this.idTipoUsuario = idTipoUsuario;
        this.tipoTipoUsuario = tipoTipoUsuario;
        this.usuario = usuario;
    }

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
