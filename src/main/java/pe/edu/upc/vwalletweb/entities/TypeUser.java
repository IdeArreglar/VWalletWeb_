package pe.edu.upc.vwalletweb.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "typeUsers", uniqueConstraints = {@UniqueConstraint(columnNames = {"id_usuario", "tipo"})})
public class TypeUser implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type_user")
    private Long idTypeUser;

    @Column(name = "tipo", length = 100)
    private String tipo;

    @ManyToOne()
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    public TypeUser() {
    }

    public Long getIdTypeUser() {
        return idTypeUser;
    }

    public void setIdTypeUser(Long idTypeUser) {
        this.idTypeUser = idTypeUser;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
