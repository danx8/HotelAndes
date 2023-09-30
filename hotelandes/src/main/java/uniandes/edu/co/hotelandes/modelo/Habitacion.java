package uniandes.edu.co.hotelandes.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Habitaciones")
public class Habitacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer capacidad;
    private Integer costo;

    public Habitacion(Integer capacidad, Integer costo) {

        this.capacidad = capacidad;
        this.costo = costo;

    }

    public Habitacion(){;}

    public Integer getId() {
        return id;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public Integer getCosto() {
        return costo;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }
    
}
