package pe.edu.upc.vwalletweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "detallereservas")
public class DetalleReservas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetalleReserva;
    @ManyToOne
    @JoinColumn(name = "reservas_id")
    private Reservas reservas;
    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;
    @ManyToOne
    @JoinColumn(name = "transporte_id")
    private Transporte transporte;
    @ManyToOne
    @JoinColumn(name = "libro_id")
    private Libro libro;

    @Column(name = "subtotalReserva", nullable = false)
    private float subtotalReserva;


}
