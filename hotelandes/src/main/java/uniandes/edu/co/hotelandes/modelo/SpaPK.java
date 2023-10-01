package uniandes.edu.co.hotelandes.modelo;
import java.io.Serializable;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
public class SpaPK implements Serializable {

    @OneToOne
    @JoinColumn(name= "id", referencedColumnName = "id")
    private Servicio id;

    public SpaPK(){
         super();
    }

    public SpaPK(Servicio id){
        super();
        this.id = id;
    }

    public Servicio getId() {
        return id;
    }

    public void setId(Servicio id) {
        this.id = id;
    }

    

    
}
