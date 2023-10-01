package uniandes.edu.co.hotelandes.modelo;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Tienda")
public class Tienda {
    @EmbeddedId
    private TiendaPK pk;
    private String nombre;

    public Tienda(){
        ;
    }

    public Tienda(Servicio id, String nombre){
        this.pk = new TiendaPK(id);
        this.nombre = nombre; 

    }

    public TiendaPK getPk() {
        return pk;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPk(TiendaPK pk) {
        this.pk = pk;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
