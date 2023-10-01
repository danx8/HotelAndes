package uniandes.edu.co.hotelandes.repositorio;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import uniandes.edu.co.hotelandes.modelo.Spa;


public interface SpaRepository extends JpaRepository<Spa, Integer> {


      @Query(value = "SELECT * FROM Spas", nativeQuery = true)
    Collection<Spa> darSpas();

    @Query(value = "SELECT FROM Spas WHERE id= :id", nativeQuery = true)
    Spa darSpa(@Param("id") Integer id);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO Spas(id, duracion, tipo_servicio) VALUES(Hotelandes_sequence.nextval, :duracion, :tipo_servicio)", nativeQuery = true)
    void insertSpa(@Param("duracion") String duracion, @Param("tipo_servicio") String tipo_servicio);

    @Modifying
    @Transactional
    @Query(value = "UPDATE Spas duracion= :duracion, Tipo_servicio= :Tipo_servicio WHERE id= :id", nativeQuery = true)
    void updateSpa(@Param("id") Integer id, @Param("duracion") String duracion, @Param("Tipo_servicio") String Tipo_servicio);
    
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM Spas WHERE id= :id", nativeQuery = true)
    void deleteSpa(@Param("id") Integer id);
    
}
