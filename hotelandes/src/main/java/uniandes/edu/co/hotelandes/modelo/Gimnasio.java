package uniandes.edu.co.hotelandes.modelo;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name = "Gimnasio")
public class Gimnasio {
    @EmbeddedId
    private LavanderiaPK pk;
    private String num_maquinas;

    public Gimnasio(){
        ;
    }

    public Gimnasio(Servicio id, String num_maquinas){
        this.pk = new LavanderiaPK(id);
        this.num_maquinas = num_maquinas; 

    }

    public LavanderiaPK getPk() {
        return pk;
    }

    public String getNum_maquinas() {
        return num_maquinas;
    }

    public void setPk(LavanderiaPK pk) {
        this.pk = pk;
    }

    public void setNum_maquinas(String num_maquinas) {
        this.num_maquinas = num_maquinas;
    } 
    
    
}
