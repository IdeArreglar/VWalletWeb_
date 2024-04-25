package pe.edu.upc.vwalletweb.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "recargasaldo")
public class RecargaSaldo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_recarga_saldo")
    private int idRecargaSaldo;
    @Column(name = "monto", nullable = false)
    private float monto;
    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    public RecargaSaldo() {
    }

    public RecargaSaldo(int idRecargaSaldo, float monto, LocalDate fecha, Usuario usuario) {
        this.idRecargaSaldo = idRecargaSaldo;
        this.monto = monto;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public int getIdRecargaSaldo() {
        return idRecargaSaldo;
    }

    public void setIdRecargaSaldo(int idRecargaSaldo) {
        this.idRecargaSaldo = idRecargaSaldo;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
