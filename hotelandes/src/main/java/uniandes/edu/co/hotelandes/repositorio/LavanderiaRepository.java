package uniandes.edu.co.hotelandes.repositorio;
import java.util.Collection;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import uniandes.edu.co.hotelandes.modelo.Lavanderia;
public interface LavanderiaRepository extends JpaRepository<Lavanderia, Integer> {
    @Query(value= "SELECT * FROM Lavanderias", nativeQuery=true)
    Collection<Lavanderia> darLavanderia();
    
    @Query(value="SELECT * FROM Lavanderias WHERE id=id", nativeQuery=true)
    Lavanderia darLavanderia(@Param("id") Integer id);

    @Modifying
    @Transactional
    @Query(value ="INSERT INTO Lavanderias (id,cantidad_prenda,precio, tipo_servicio ) VALUES(Hotelandes_sequence.nextval, :cantidad_prenda, :precio, :tipo_servicio)")
    void insertarLavanderia(@Param("cantidad_prenda") String cantidad_prenda,
    @Param("precio") String precio, @Param("tipo_servicio") String tipo_servicio);

    @Modifying
    @Transactional
    @Query(value="UPDATE Lavanderias SET num_maquinas=:num_maquinas WHERE id=:id")
    void actualizarLavanderia(@Param("id") Integer id, @Param("cantidad_prenda") String num_maquinas,
    @Param("precio") String precio, @Param("tipo_servicio") String tipo_servicio);
     
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM Lavanderias WHERE id=:id", nativeQuery = true)
    void eliminarLavanderia(@Param("id") Integer id);

    
}

