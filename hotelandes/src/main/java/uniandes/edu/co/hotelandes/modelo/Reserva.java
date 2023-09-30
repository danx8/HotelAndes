package uniandes.edu.co.hotelandes.modelo;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Reservas")
public class Reserva {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Date fecha_hora_inicio;
    private Date fecha_hora_fin;
    private Integer precio;

    public Reserva(Date fecha_hora_inicio, Date fecha_hora_fin, Integer precio) {
        
        this.fecha_hora_fin = fecha_hora_fin;
        this.fecha_hora_inicio = fecha_hora_inicio;
        this.precio = precio;
    }

    public Reserva(){;}

    public Integer getId() {
        return id;
    }

    public Date getFecha_hora_inicio() {
        return fecha_hora_inicio;
    }

    public Date getFecha_hora_fin() {
        return fecha_hora_fin;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFecha_hora_inicio(Date fecha_hora_inicio) {
        this.fecha_hora_inicio = fecha_hora_inicio;
    }

    public void setFecha_hora_fin(Date fecha_hora_fin) {
        this.fecha_hora_fin = fecha_hora_fin;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    
}
