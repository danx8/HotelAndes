package uniandes.edu.co.hotelandes.modelo;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name = "Prestamos")
public class Prestamos {
    @EmbeddedId
    private PrestamosPK pk;
    private String nombre_utensilio;
    private String estado ;
    private String precio_utensilio ;
     
    public Prestamos(){
        ;
    }

    public Prestamos(Servicio id, String nombre_utensilio,String estado,String precio_utensilio){
        this.pk = new PrestamosPK(id);
        this.nombre_utensilio = nombre_utensilio; 
        this.estado=estado;
        this.precio_utensilio=precio_utensilio;

    }

    public PrestamosPK getPk() {
        return pk;
    }

    public String getNombre_utensilio() {
        return nombre_utensilio;
    }

    public String getEstado() {
        return estado;
    }

    public String getPrecio_utensilio() {
        return precio_utensilio;
    }

    public void setPk(PrestamosPK pk) {
        this.pk = pk;
    }

    public void setNombre_utensilio(String nombre_utensilio) {
        this.nombre_utensilio = nombre_utensilio;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPrecio_utensilio(String precio_utensilio) {
        this.precio_utensilio = precio_utensilio;
    }
    

    
}
