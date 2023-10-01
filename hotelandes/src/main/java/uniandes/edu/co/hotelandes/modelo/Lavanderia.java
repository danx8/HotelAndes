package uniandes.edu.co.hotelandes.modelo;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name = "Lavanderia")
public class Lavanderia {
    @EmbeddedId
    private LavanderiaPK pk;
    private String nombre;

    public Lavanderia(){
        ;
    }

    public Lavanderia(Servicio id, String nombre){
        this.pk = new LavanderiaPK(id);
        this.nombre = nombre; 

    }

    public LavanderiaPK getPk() {
        return pk;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPk(LavanderiaPK pk) {
        this.pk = pk;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
