package uniandes.edu.co.hotelandes.repositorio;
import java.util.Collection;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import uniandes.edu.co.hotelandes.modelo.Gimnasio;
public interface GimnasioRepository extends JpaRepository<Gimnasio, Integer>{
    @Query(value= "SELECT * FROM Gimnasios", nativeQuery=true)
    Collection<Gimnasio> darGimnasios();
    
    @Query(value="SELECT * FROM Gimnasios WHERE id=id", nativeQuery=true)
    Gimnasio darGimnasio(@Param("id") Integer id);

    @Modifying
    @Transactional
    @Query(value ="INSERT INTO Gimnasios (id, num_maquinas) VALUES(1, :num_maquinas)", nativeQuery=true)
    void insertarGimnasio(@Param("num_maquinas") Integer num_maquinas);

    @Modifying
    @Transactional
    @Query(value="UPDATE Gimnasios SET num_maquinas=:num_maquinas WHERE id=:id",  nativeQuery=true)
    void actualizarGimnasio(@Param("id") Integer id, @Param("num_maquinas") Integer num_maquinas);
     
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM Gimnasios WHERE id=:id", nativeQuery = true)
    void eliminarGimnasio(@Param("id") Integer id);


    
}
