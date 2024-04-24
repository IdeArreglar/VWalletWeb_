package pe.edu.upc.vwalletweb.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "cafeteria")
public class Cafeteria {
    @Id
    @Column(name="servicios_id")
    private int idServicios;
    @Column(name = "sedeCafeteria",nullable = false,length = 100)
    private String sedeCafeteria;
    @OneToOne
    @MapsId
    private Servicios servicios;

    public Cafeteria() {
    }

    public Cafeteria(int idServicios, String sedeCafeteria, Servicios servicios) {
        this.idServicios = idServicios;
        this.sedeCafeteria = sedeCafeteria;
        this.servicios = servicios;
    }

    public int getIdServicios() {
        return idServicios;
    }

    public void setIdServicios(int idServicios) {
        this.idServicios = idServicios;
    }

    public String getSedeCafeteria() {
        return sedeCafeteria;
    }

    public void setSedeCafeteria(String sedeCafeteria) {
        this.sedeCafeteria = sedeCafeteria;
    }

    public Servicios getServicios() {
        return servicios;
    }

    public void setServicios(Servicios servicios) {
        this.servicios = servicios;
    }
}
