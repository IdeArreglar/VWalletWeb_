package pe.edu.upc.vwalletweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "servicios")
public class Servicios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idServicio;
    @Column(name = "nombreServicio",nullable = false,length = 100)
    private String nombreServicio;
    @Column(name = "estado",nullable = false,length = 100)
    private String estado;

    public Servicios() {
    }

    public Servicios(int idServicio, String nombreServicio, String estado) {
        this.idServicio = idServicio;
        this.nombreServicio = nombreServicio;
        this.estado = estado;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
