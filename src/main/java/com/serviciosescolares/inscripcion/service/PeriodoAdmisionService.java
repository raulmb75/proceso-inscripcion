package com.serviciosescolares.inscripcion.service;

import com.serviciosescolares.inscripcion.Repository.PeriodoAdmsionRepository;
import com.serviciosescolares.inscripcion.entity.PeriodosAdmision;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PeriodoAdmisionService {

    @Autowired
    private PeriodoAdmsionRepository periodoAdmsionRepository;


    //Crear un nuevo periodo
    public PeriodosAdmision crearPeriodo(PeriodosAdmision periodosAdmision) {
        return periodoAdmsionRepository.save(periodosAdmision);
    }

    //Obtener todos los periodos
    public List<PeriodosAdmision> obtenerLosPeriodos(){
        return periodoAdmsionRepository.findAll();
    }

    //Buscar periodo por id
    public PeriodosAdmision buscarPorId(Long idPeriodoAdmision){
        Optional<PeriodosAdmision> optionalPeriodo = periodoAdmsionRepository.findById(idPeriodoAdmision);

        if (optionalPeriodo.isPresent()) {
            PeriodosAdmision periodo = optionalPeriodo.get();

            return periodo;
        } else {
            return null;
        }
    }

    //Modificar un periodo
    public PeriodosAdmision cambiarPeriodo(Long idPeriodoAdmision, PeriodosAdmision periodosAdmision) {
        Optional<PeriodosAdmision> optionalPeriodo = periodoAdmsionRepository.findById(idPeriodoAdmision);

        if (optionalPeriodo.isPresent()) {
            PeriodosAdmision periodo = optionalPeriodo.get();

            periodo.setAnioPeriodoAdmision(periodosAdmision.getAnioPeriodoAdmision());
            periodo.setEstatusPeriodo(periodosAdmision.getEstatusPeriodo());
            periodo.setPeriodoAdmision(periodosAdmision.getPeriodoAdmision());
            periodo.setCicloPeriodoAdmision(periodosAdmision.getCicloPeriodoAdmision());
            periodo.setNombrePeriodoAdmision(periodosAdmision.getNombrePeriodoAdmision());
            periodo.setFechaInicio(periodosAdmision.getFechaInicio());
            periodo.setFechaFin(periodosAdmision.getFechaFin());

            periodoAdmsionRepository.save(periodo);

            return periodo;
        } else {
            return null;
        }
    }

    /*public PeriodosAdmision cambiarPeriodo(Long idPeriodoAdmision, PeriodosAdmision periodosAdmision ){
        PeriodosAdmision periodos = periodoAdmsionRepository.findById(idPeriodoAdmision).orElse(null);
        if (periodos == null){
            return null;
        }else{
            periodos.setAnioPeriodoAdmision(periodosAdmision.getAnioPeriodoAdmision());
            periodos.setEstatusPeriodo(periodosAdmision.getEstatusPeriodo());
            periodos.setPeriodoAdmision(periodosAdmision.getPeriodoAdmision());
            periodos.setCicloPeriodoAdmision(periodosAdmision.getCicloPeriodoAdmision());
            periodos.setNombrePeriodoAdmision(periodosAdmision.getNombrePeriodoAdmision());
            periodos.setFechaInicio(periodosAdmision.getFechaInicio());
            periodos.setFechaFin(periodosAdmision.getFechaFin());
        }


        //estudiante.setEstatusAlumno("EGR");
        periodoAdmsionRepository.save(periodos);

        return periodos;
    }*/

    //elimina los periodos
    public Boolean eliminarPeriodo(Long idPeriodoAdmision) {
        Optional<PeriodosAdmision> optionalPeriodo = periodoAdmsionRepository.findById(idPeriodoAdmision);

        if (optionalPeriodo.isPresent()) {
            PeriodosAdmision periodo = optionalPeriodo.get();

            periodoAdmsionRepository.deleteById(idPeriodoAdmision);

            return true;
        } else {
            return false;
        }


    }

}
