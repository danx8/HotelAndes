package uniandes.edu.co.hotelandes.modelo;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name = "Restaurante")
public class Restaurante {
    @EmbeddedId
    private RestaurantePK pk;
    private String estilo;

    public Restaurante(){
        ;
    }

    public Restaurante(Servicio id, String estilo){
        this.pk = new RestaurantePK(id);
        this.estilo = estilo; 

    }
    public RestaurantePK getPk() {
        return pk;
    }
    public String getEstilo() {
        return estilo;
    }
    public void setPk(RestaurantePK pk) {
        this.pk = pk;
    }
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    


    

    
}


