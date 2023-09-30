package uniandes.edu.co.hotelandes.modelo;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Embeddable
public class ReservaHabitacionPK implements Serializable {
    
    @ManyToOne
    @JoinColumn(name = "id_habitacion", referencedColumnName = "id")
    private Habitacion id_habitacion;

    @ManyToOne
    @JoinColumn(name = "id_reserva", referencedColumnName = "id")
    private Reserva id_reserva;

    public ReservaHabitacionPK(Habitacion id_habitacion, Reserva id_reserva) {

        super();
        this.id_habitacion = id_habitacion;
        this.id_reserva = id_reserva;
    }

    public Habitacion getId_habitacion() {
        return id_habitacion;
    }

    public Reserva getId_reserva() {
        return id_reserva;
    }

    public void setId_habitacion(Habitacion id_habitacion) {
        this.id_habitacion = id_habitacion;
    }

    public void setId_reserva(Reserva id_reserva) {
        this.id_reserva = id_reserva;
    }

    
}
