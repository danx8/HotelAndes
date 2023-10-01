package uniandes.edu.co.hotelandes.modelo;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class ProductosEnCartaPK implements Serializable{
    @ManyToOne
    @JoinColumn(name="cartas_id", referencedColumnName="id")
    private Carta cartas_id;
    
    @ManyToOne
    @JoinColumn(name="producto_id", referencedColumnName = "id")
    private Producto producto_id;

    public ProductosEnCartaPK(Carta cartas_id, Producto producto_id) {
        super();
        this.cartas_id = cartas_id;
        this.producto_id = producto_id;
    }

    public Carta getCartas_id() {
        return cartas_id;
    }

    public void setCartas_id(Carta cartas_id) {
        this.cartas_id = cartas_id;
    }

    public Producto getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(Producto producto_id) {
        this.producto_id = producto_id;
    }

    
}