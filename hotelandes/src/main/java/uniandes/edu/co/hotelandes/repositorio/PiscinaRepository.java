package uniandes.edu.co.hotelandes.repositorio;

import java.util.Collection;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import uniandes.edu.co.hotelandes.modelo.Piscina;

public interface PiscinaRepository extends JpaRepository<Piscina, Integer> {
    
    @Query(value= "SELECT * FROM Piscinas", nativeQuery=true)
    Collection<Piscina> darPiscinas();
    
    @Query(value="SELECT * FROM Piscinas WHERE id=id", nativeQuery=true)
    Piscina darPiscina(@Param("id") Integer id);

    @Modifying
    @Transactional
    @Query(value ="INSERT INTO Piscinas (id, profundidad) VALUES(Hotelandes_sequence.nextval, :profundidad)", nativeQuery=true)
    void insertarPiscina(@Param("profundidad") Integer profundidad);

    @Modifying
    @Transactional
    @Query(value="UPDATE  Piscinas  SET  profundidad=:profundidad WHERE id=:id", nativeQuery=true)
    void actualizarPiscina(@Param("Id") Integer id, @Param("profundidad") Integer profundidad);
     
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM Piscinas WHERE id=:id", nativeQuery = true)
    void eliminarPiscina(@Param("id") Integer id);

}
