package uniandes.edu.co.hotelandes.repositorio;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import uniandes.edu.co.hotelandes.modelo.ServicioEnSede;

public interface ServicioEnSedeRepository extends JpaRepository<ServicioEnSede, Integer> {

    @Query(value = "SELECT * Servicios_en_Sedes", nativeQuery = true)
    Collection<ServicioEnSede> darServiciosEnSedes();

    @Query(value = "SELECT * FROM Servicios_en_sedes WHERE sedes_id= :sedes_id AND servicios_id= :servicios_id", nativeQuery = true)
    ServicioEnSede darServicioEnSede(@Param("sedes_id") Integer sedes_id, @Param("servicios_id") Integer servicios_id);

    @Modifying
    @Transactional
    @Query(value = "UPDATE Servicios_en_sedes SET sedes_id= :sedes_id_nuevo, servicios_id= :servicios_id_nuevo WHERE servicios_id= :servicios_id AND sedes_id= :sedes_id", nativeQuery = true)
    void updateServicioEnSede(@Param("sedes_id") Integer sedes_id, @Param("servicios_id") Integer servicios_id, @Param("servicios_id_nuevo") Integer servicios_id_nuevo, @Param("sedes_id_nuevo") Integer sedes_id_nuevo);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO Servicios_en_sedes (servicios_id, sedes_id) VALUES (:servicios_id, :sedes_id)", nativeQuery = true)
    void insertServicioEnSede(@Param("servicios_id") Integer servicios_id, @Param("sedes_id") Integer sedes_id);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM Servicios_en_sedes WHERE servicios_id= :servicios_id AND sedes_id= :sedes_id", nativeQuery = true)
    void deleteServicioEnSede(@Param("servicios_id") Integer servicios_id, @Param("sedes_id") Integer sedes_id);
    
}
