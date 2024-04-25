package pe.edu.upc.vwalletweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "biblioteca")
public class Biblioteca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_biblioteca")
    private int idBiblioteca;
    @Column(name = "sede", nullable = false, length = 100)
    private String sede;
    @ManyToOne
    @JoinColumn(name = "id_servicio")
    private Servicios servicios;

    public Biblioteca() {
    }

    public Biblioteca(int idBiblioteca, String sede, Servicios servicios) {
        this.idBiblioteca = idBiblioteca;
        this.sede = sede;
        this.servicios = servicios;
    }

    public int getIdBiblioteca() {
        return idBiblioteca;
    }

    public void setIdBiblioteca(int idBiblioteca) {
        this.idBiblioteca = idBiblioteca;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public Servicios getServicios() {
        return servicios;
    }

    public void setServicios(Servicios servicios) {
        this.servicios = servicios;
    }
}
