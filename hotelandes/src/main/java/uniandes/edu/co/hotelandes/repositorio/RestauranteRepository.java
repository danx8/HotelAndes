package uniandes.edu.co.hotelandes.repositorio;
import java.util.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import uniandes.edu.co.hotelandes.modelo.Restaurante;

public interface RestauranteRepository extends JpaRepository<Restaurante, Integer>{
    @Query(value= "SELECT * FROM Restaurantes", nativeQuery=true)
    Collection<Restaurante> darRestaurantes();
    
    @Query(value="SELECT * FROM Restaurantes WHERE id=id", nativeQuery=true)
    Restaurante darRestaurante(@Param("id") Integer id);

    @Modifying
    @Transactional
    @Query(value ="INSERT INTO Restaurantes (id, estilo) VALUES(1, :estilo)",  nativeQuery=true)
    void insertarRestaurante(@Param("estilo") String estilo);

    @Modifying
    @Transactional
    @Query(value="UPDATE Restaurantes  SET estilo=:estilo",  nativeQuery=true)
    void actualizarRestaurante(@Param("Id") Integer id, @Param("estilo") String estilo);
     
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM Restaurantes WHERE id=:id", nativeQuery = true)
    void eliminarRestaurante(@Param("id") Integer id);

   
}
