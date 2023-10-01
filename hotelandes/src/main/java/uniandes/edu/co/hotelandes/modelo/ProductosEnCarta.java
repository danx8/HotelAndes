package uniandes.edu.co.hotelandes.modelo;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Productos_en_cartas")
public class ProductosEnCarta{

    @EmbeddedId
    private ProductosEnCartaPK pk;

    public ProductosEnCarta(Carta carta_id, Producto producto_id) {
        this.pk = new ProductosEnCartaPK(carta_id, producto_id);
    }

    public ProductosEnCarta(){;}

    public ProductosEnCartaPK getPk() {
        return pk;
    }

    public void setPk(ProductosEnCartaPK pk) {
        this.pk = pk;
    }
    
}