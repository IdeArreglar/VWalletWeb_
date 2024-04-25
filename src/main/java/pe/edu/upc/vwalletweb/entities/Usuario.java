package pe.edu.upc.vwalletweb.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long idUsuario;

    @Column(name = "username", length = 30, unique = true)
    private String nameUsuario;
    @Column(name = "password", length = 200)
    private String passwordUsuario;
    @Column(name = "email", length = 200)
    private String emailUsuario;
    @Column(name = "enabled")
    private Boolean enabledUsuario;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_usuario")
    private List<TypeUser> typeUsers;

    public Usuario() {
    }

    public Usuario(Long idUsuario, String nameUsuario, String passwordUsuario, String emailUsuario, Boolean enabledUsuario, List<TypeUser> typeUsers) {
        this.idUsuario = idUsuario;
        this.nameUsuario = nameUsuario;
        this.passwordUsuario = passwordUsuario;
        this.emailUsuario = emailUsuario;
        this.enabledUsuario = enabledUsuario;
        this.typeUsers = typeUsers;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNameUsuario() {
        return nameUsuario;
    }

    public void setNameUsuario(String nameUsuario) {
        this.nameUsuario = nameUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public Boolean getEnabledUsuario() {
        return enabledUsuario;
    }

    public void setEnabledUsuario(Boolean enabledUsuario) {
        this.enabledUsuario = enabledUsuario;
    }

    public List<TypeUser> getTypeUsers() {
        return typeUsers;
    }

    public void setTypeUsers(List<TypeUser> typeUsers) {
        this.typeUsers = typeUsers;
    }
}


