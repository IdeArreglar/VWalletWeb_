package pe.edu.upc.vwalletweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "servicios")
public class Servicios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_servicio")
    private int idServicios;
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;
    @Column(name = "estado", nullable = false, length = 100)
    private String estado;

    public Servicios() {
    }

    public Servicios(int idServicios, String nombre, String estado) {
        this.idServicios = idServicios;
        this.nombre = nombre;
        this.estado = estado;
    }

    public int getIdServicios() {
        return idServicios;
    }

    public void setIdServicios(int idServicios) {
        this.idServicios = idServicios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
