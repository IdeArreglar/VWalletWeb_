package pe.edu.upc.vwalletweb.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "gastos")
public class Gastos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGasto;
    @Column(name = "montoGastos",nullable = false)
    private float montoGastos;
    @Column(name = "fechaGastos",nullable = false)
    private LocalDate fechaGastos;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "servicios_id")
    private Servicios servicios;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;
    @ManyToOne
    @JoinColumn(name = "servicios_servicios_id")
    private Transporte transporte;

    public Gastos() {
    }

    public Gastos(int idGasto, float montoGastos, LocalDate fechaGastos, Usuario usuario, Servicios servicios, Menu menu, Transporte transporte) {
        this.idGasto = idGasto;
        this.montoGastos = montoGastos;
        this.fechaGastos = fechaGastos;
        this.usuario = usuario;
        this.servicios = servicios;
        this.menu = menu;
        this.transporte = transporte;
    }

    public int getIdGasto() {
        return idGasto;
    }

    public void setIdGasto(int idGasto) {
        this.idGasto = idGasto;
    }

    public float getMontoGastos() {
        return montoGastos;
    }

    public void setMontoGastos(float montoGastos) {
        this.montoGastos = montoGastos;
    }

    public LocalDate getFechaGastos() {
        return fechaGastos;
    }

    public void setFechaGastos(LocalDate fechaGastos) {
        this.fechaGastos = fechaGastos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Servicios getServicios() {
        return servicios;
    }

    public void setServicios(Servicios servicios) {
        this.servicios = servicios;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }
}
