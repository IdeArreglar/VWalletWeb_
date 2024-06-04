package pe.edu.upc.vwalletweb.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "cafeteria")
public class Cafeteria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCafeteria;
    @Column(name = "sedeCafeteria",nullable = false,length = 100)
    private String sedeCafeteria;

    public Cafeteria() {
    }

    public Cafeteria(int idCafeteria, String sedeCafeteria) {
        this.idCafeteria = idCafeteria;
        this.sedeCafeteria = sedeCafeteria;
    }

    public int getIdCafeteria() {
        return idCafeteria;
    }

    public void setIdCafeteria(int idCafeteria) {
        this.idCafeteria = idCafeteria;
    }

    public String getSedeCafeteria() {
        return sedeCafeteria;
    }

    public void setSedeCafeteria(String sedeCafeteria) {
        this.sedeCafeteria = sedeCafeteria;
    }

}
