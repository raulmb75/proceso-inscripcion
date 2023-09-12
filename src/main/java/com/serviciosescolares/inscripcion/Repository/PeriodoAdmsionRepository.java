package com.serviciosescolares.inscripcion.Repository;

import com.serviciosescolares.inscripcion.entity.PeriodosAdmision;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PeriodoAdmsionRepository extends JpaRepository<PeriodosAdmision, Long> {

    @Query(value = "FROM PeriodosAdmision WHERE nombrePeriodoAdmision = ?1")
    PeriodosAdmision buscarPeriodoPorNombre(String nombrePeriodoAdmision);
}
