package uniandes.edu.co.hotelandes.modelo;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name = "Bar")
public class Bar {

    @EmbeddedId
    private BarPK pk;
    private String estilo;

    public Bar(){
        ;
    }

    public Bar(Servicio id, String estilo ){
        this.pk = new BarPK(id);
        this.estilo = estilo;
    }

    public BarPK getPk() {
        return pk;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setPk(BarPK pk) {
        this.pk = pk;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    

    
}
