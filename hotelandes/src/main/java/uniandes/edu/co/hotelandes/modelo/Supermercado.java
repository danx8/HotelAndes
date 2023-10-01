package uniandes.edu.co.hotelandes.modelo;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Supermercado")
public class Supermercado{
    @EmbeddedId
    private SupermercadoPK pk;
    private String nombre;

    public Supermercado(){
        ;
    }

    public Supermercado(Servicio id, String nombre){
        this.pk = new SupermercadoPK(id);
        this.nombre = nombre; 

    }

    public SupermercadoPK getPk() {
        return pk;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPk(SupermercadoPK pk) {
        this.pk = pk;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    


    
}
