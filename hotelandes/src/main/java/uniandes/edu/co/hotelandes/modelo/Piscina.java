package uniandes.edu.co.hotelandes.modelo;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name = "Piscina")
public class Piscina {
    @EmbeddedId
    private PiscinaPK pk;
    private String profundidad;

    public Piscina(){
        ;
    }

    public Piscina(Servicio id, String profundidad){
        this.pk = new PiscinaPK(id);
        this.profundidad = profundidad; 

    }

    public PiscinaPK getPk() {
        return pk;
    }

    public String getProfundidad() {
        return profundidad;
    }

    public void setPk(PiscinaPK pk) {
        this.pk = pk;
    }

    public void setProfundidad(String profundidad) {
        this.profundidad = profundidad;
    }
    

    
}
