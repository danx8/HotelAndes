package uniandes.edu.co.hotelandes.modelo;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "Alojamiento")
public class Alojamiento {



    @EmbeddedId
    private AlojamientoPK pk;
    
    @OneToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private Usuario usuario_id;

    @OneToOne
    @JoinColumn(name = "checkin_id", referencedColumnName = "id")
    private Check_In check_in;

    @OneToOne
    @JoinColumn(name = "checkout_id", referencedColumnName = "id")
    private Check_Out check_out;

    public Alojamiento(Servicio id, Usuario usuario, Check_In check_In, Check_Out check_Out) {
        this.pk = new AlojamientoPK(id);
        this.usuario_id = usuario;
        this.check_in = check_In;
        this.check_out = check_Out;
    }

    public AlojamientoPK getPk() {
        return pk;
    }

    public void setPk(AlojamientoPK pk) {
        this.pk = pk;
    }

    public Usuario getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Usuario usuario_id) {
        this.usuario_id = usuario_id;
    }

    public Check_In getCheck_in() {
        return check_in;
    }

    public void setCheck_in(Check_In check_in) {
        this.check_in = check_in;
    }

    public Check_Out getCheck_out() {
        return check_out;
    }

    public void setCheck_out(Check_Out check_out) {
        this.check_out = check_out;
    }

    

}
