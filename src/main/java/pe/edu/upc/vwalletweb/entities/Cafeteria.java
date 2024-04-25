package pe.edu.upc.vwalletweb.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "cafeteria")
public class Cafeteria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cafeteria")
    private int idCafeteria;
    @Column(name = "sede", nullable = false, length = 100)
    private String sede;
    @ManyToOne
    @JoinColumn(name = "id_servicio")
    private Servicios servicios;

    public Cafeteria() {
    }

    public Cafeteria(int idCafeteria, String sede, Servicios servicios) {
        this.idCafeteria = idCafeteria;
        this.sede = sede;
        this.servicios = servicios;
    }

    public int getIdCafeteria() {
        return idCafeteria;
    }

    public void setIdCafeteria(int idCafeteria) {
        this.idCafeteria = idCafeteria;
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
