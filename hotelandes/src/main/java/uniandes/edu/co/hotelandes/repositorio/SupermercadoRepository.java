package uniandes.edu.co.hotelandes.repositorio;

import java.util.Collection;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import uniandes.edu.co.hotelandes.modelo.Producto;
import uniandes.edu.co.hotelandes.modelo.Restaurante;
import uniandes.edu.co.hotelandes.modelo.Supermercado;

public interface SupermercadoRepository extends JpaRepository<Supermercado, Integer>  {
 
    
}
