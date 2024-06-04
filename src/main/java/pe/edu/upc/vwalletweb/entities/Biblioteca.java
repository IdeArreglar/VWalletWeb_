package pe.edu.upc.vwalletweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "biblioteca")
public class Biblioteca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBiblioteca;
    @Column(name = "sedeBiblioteca",nullable = false,length = 100)
    private String sedeBiblioteca;

    public Biblioteca() {
    }

    public Biblioteca(int idBiblioteca, String sedeBiblioteca) {
        this.idBiblioteca = idBiblioteca;
        this.sedeBiblioteca = sedeBiblioteca;
    }

    public int getIdBiblioteca() {
        return idBiblioteca;
    }

    public void setIdBiblioteca(int idBiblioteca) {
        this.idBiblioteca = idBiblioteca;
    }

    public String getSedeBiblioteca() {
        return sedeBiblioteca;
    }

    public void setSedeBiblioteca(String sedeBiblioteca) {
        this.sedeBiblioteca = sedeBiblioteca;
    }
}
