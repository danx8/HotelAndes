package uniandes.edu.co.hotelandes.repositorio;
import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import uniandes.edu.co.hotelandes.modelo.Tienda;

public interface TiendaRepository extends JpaRepository<Tienda, Integer> {

     @Query(value = "SELECT * FROM Tiendas", nativeQuery = true)
    Collection<Tienda> darTiendas();

    @Query(value = "SELECT FROM Tiendas WHERE id= :id", nativeQuery = true)
    Tienda darTienda(@Param("id") Integer id);
    
    @Modifying
    @Transactional
    @Query(value = "INSTERT INTO Tiendas(id, nombre) VALUES(Hotleandes_sequence.nextval, :nombre)", nativeQuery = true)
    void insertarTienda( @Param("nombre") String nombre);

    @Modifying
    @Transactional
    @Query(value = "UPDATE Tiendas SET nombre= :nombre WHERE id= :id", nativeQuery = true)
    void updateTiendas(@Param("id") Integer id, @Param("nombre") String nombre);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM Tiendas WHERE id= :id", nativeQuery = true)
    void deleteTiendas(@Param("id") Integer id);




    
}
