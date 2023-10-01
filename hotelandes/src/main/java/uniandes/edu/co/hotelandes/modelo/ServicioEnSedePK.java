package uniandes.edu.co.hotelandes.modelo;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class ServicioEnSedePK implements Serializable {

    @ManyToOne
    @JoinColumn(name = "id_servicio", referencedColumnName = "id")
    private Servicio id_servicio;

    @ManyToOne
    @JoinColumn(name = "id_sede", referencedColumnName = "id")
    private Sede id_sede;

    public ServicioEnSedePK(Servicio id_servicio, Sede id_sede) {

        super();
        this.id_servicio = id_servicio;
        this.id_sede = id_sede;
    }

    public Servicio getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(Servicio id_servicio) {
        this.id_servicio = id_servicio;
    }

    public Sede getId_sede() {
        return id_sede;
    }

    public void setId_sede(Sede id_sede) {
        this.id_sede = id_sede;
    }
    
}
