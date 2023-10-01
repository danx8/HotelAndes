package uniandes.edu.co.hotelandes.repositorio;

import java.util.Collection;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import uniandes.edu.co.hotelandes.modelo.Servicio;
import uniandes.edu.co.hotelandes.modelo.Usuario;

public interface ServicioRepository extends JpaRepository<Servicio, Integer> {
    
    @Query(value = "SELECT * FROM Servicios", nativeQuery = true)
    Collection<Usuario> darServicios();

    @Query(value = "SELECT FROM Servicios WHERE id= :id", nativeQuery = true)
    Usuario darServicio(@Param("id") Integer id);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO Servicios(id, horario, costo) VALUES(Hotelandes_sequence.nextval, :horario, :costo)", nativeQuery = true)
    void insertServicio(@Param("horario") Date horario, @Param("costo") Integer costo);

    @Modifying
    @Transactional
    @Query(value = "UPDATE Servicios horario= :horario, costo= :costo WHERE id= :id", nativeQuery = true)
    void updateServicio(@Param("id") Integer id, @Param("horario") Date horario, @Param("costo") Integer costo);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM Servicios WHERE id= :id", nativeQuery = true)
    void deleteServicio(@Param("id") Integer id);
}
