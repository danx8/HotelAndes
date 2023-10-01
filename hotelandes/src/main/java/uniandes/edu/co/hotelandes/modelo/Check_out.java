package uniandes.edu.co.hotelandes.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Check_out")
public class Check_Out {
    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String horaEntrada;

    public Check_Out(Integer id, String horaEntrada) {
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
