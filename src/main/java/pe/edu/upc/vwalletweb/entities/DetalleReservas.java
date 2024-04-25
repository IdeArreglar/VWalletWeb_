package pe.edu.upc.vwalletweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "detallereservas")
public class DetalleReservas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetalleReserva;
    @ManyToOne
    @JoinColumn(name = "id_reserva")
    private Reservas reservas;
    @ManyToOne
    @JoinColumn(name = "id_menu")
    private Menu menu;
    @ManyToOne
    @JoinColumn(name = "id_transporte")
    private Transporte transporte;
    @ManyToOne
    @JoinColumn(name = "id_libro")
    private Libro libro;

    @Column(name = "subtotal", nullable = false)
    private float subtotalReserva;


}
