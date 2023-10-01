package uniandes.edu.co.hotelandes.modelo;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Check_In")
public class Check_In {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String horaEntrada;
    
    public Check_In(){;}

    public Check_In(Integer id, String horaEntrada) {
        this.id = id;
        this.horaEntrada = horaEntrada;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    
}
