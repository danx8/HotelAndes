package uniandes.edu.co.hotelandes.modelo;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Embeddable
public class ReservaHabitacionPK implements Serializable {
    
    @ManyToOne
    @JoinColumn(name = "id_habitacion", referencedColumnName = "id")
    private Habitacion habitacion_id;

    @ManyToOne
    @JoinColumn(name = "id_reserva", referencedColumnName = "id")
    private Reserva reserva_id;

    public ReservaHabitacionPK(Habitacion id_habitacion, Reserva id_reserva) {

        super();
        this.habitacion_id = id_habitacion;
        this.reserva_id = id_reserva;
    }

    public Habitacion getId_habitacion() {
        return habitacion_id;
    }

    public Reserva getId_reserva() {
        return reserva_id;
    }

    public void setId_habitacion(Habitacion id_habitacion) {
        this.habitacion_id = id_habitacion;
    }

    public void setId_reserva(Reserva id_reserva) {
        this.reserva_id = id_reserva;
    }

    
}
