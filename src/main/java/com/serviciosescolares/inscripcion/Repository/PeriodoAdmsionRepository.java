package com.serviciosescolares.inscripcion.Repository;

import com.serviciosescolares.inscripcion.entity.PeriodosAdmision;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeriodoAdmsionRepository extends JpaRepository<PeriodosAdmision, Long> {

}
