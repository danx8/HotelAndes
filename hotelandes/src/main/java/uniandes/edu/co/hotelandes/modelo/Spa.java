package uniandes.edu.co.hotelandes.modelo;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Spa")
public class Spa {
    @EmbeddedId
    private SpaPK pk;
    private String duracion;
    private String Tipo_servicio;


    public Spa(){
        ;
    }

    public Spa(Servicio id, String duracion, String Tipo_servicio){
        this.pk = new SpaPK(id);
        this.duracion = duracion;
        this.Tipo_servicio = Tipo_servicio;
    }

    public SpaPK getPk() {
        return pk;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getTipo_servicio() {
        return Tipo_servicio;
    }

    public void setPk(SpaPK pk) {
        this.pk = pk;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public void setTipo_servicio(String tipo_servicio) {
        Tipo_servicio = tipo_servicio;
    }
    

    
}
