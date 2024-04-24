package pe.edu.upc.vwalletweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "biblioteca")
public class Biblioteca {
    @Id
    @Column(name="servicios_id")
    private int idServicios;

    @Column(name = "sedeBiblioteca",nullable = false,length = 100)
    private String sedeBiblioteca;
    @OneToOne
    @MapsId
    private Servicios servicios;

    public Biblioteca() {
    }

    public Biblioteca(int idServicios, String sedeBiblioteca, Servicios servicios) {
        this.idServicios = idServicios;
        this.sedeBiblioteca = sedeBiblioteca;
        this.servicios = servicios;
    }

    public int getIdServicios() {
        return idServicios;
    }

    public void setIdServicios(int idServicios) {
        this.idServicios = idServicios;
    }

    public String getSedeBiblioteca() {
        return sedeBiblioteca;
    }

    public void setSedeBiblioteca(String sedeBiblioteca) {
        this.sedeBiblioteca = sedeBiblioteca;
    }

    public Servicios getServicios() {
        return servicios;
    }

    public void setServicios(Servicios servicios) {
        this.servicios = servicios;
    }
}
